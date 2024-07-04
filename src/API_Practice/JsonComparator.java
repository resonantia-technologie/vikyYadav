package API_Practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class JsonComparator {

	public static void main(String[] args) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();

			// Read the JSON files
			JsonNode json1 = objectMapper.readTree(new File(".//file1.json"));
			JsonNode json2 = objectMapper.readTree(new File(".//file2.json"));

			// Compare the JSON files
			boolean isEqual = compareJson(json1, json2);

			System.out.println("The JSON files are " + (isEqual ? "equal" : "not equal"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean compareJson(JsonNode json1, JsonNode json2) {
		// Check if both nodes are of the same type
		if (json1.getNodeType() != json2.getNodeType()) {
			return false;
		}

		// Compare objects
		if (json1.isObject()) {
			ObjectNode obj1 = (ObjectNode) json1;
			ObjectNode obj2 = (ObjectNode) json2;

			Iterator<Map.Entry<String, JsonNode>> fields1 = obj1.fields();
			while (fields1.hasNext()) {
				Map.Entry<String, JsonNode> entry = fields1.next();
				String fieldName = entry.getKey();
				JsonNode value1 = entry.getValue();

				JsonNode value2 = obj2.get(fieldName);

				// If field is not present in both, or if the values are not equal, return false
				if (value2 == null || !compareJson(value1, value2)) {
					return false;
				}
			}

			return true;
		}

		// Compare arrays
		if (json1.isArray()) {
			ArrayNode arr1 = (ArrayNode) json1;
			ArrayNode arr2 = (ArrayNode) json2;

			if (arr1.size() != arr2.size()) {
				return false;
			}

			for (int i = 0; i < arr1.size(); i++) {
				if (!compareJson(arr1.get(i), arr2.get(i))) {
					return false;
				}
			}

			return true;
		}

		// Compare other value types (text, number, boolean, etc.)
		return json1.equals(json2);
	}
}
