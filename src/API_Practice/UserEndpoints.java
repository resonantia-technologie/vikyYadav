package API_Practice;

import org.jvnet.staxex.StAxSOAPBody.Payload;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * @author Kailas Andhalkar User Endpoints.java class is designed to to perform
 *         Create, Read, Update, Delete requests to the User services
 */
public class UserEndpoints {
	public static Response createUser(String payLoad) {
		RestAssured.baseURI = Routes.base_uri;
		Response response = RestAssured.given().contentType(ContentType.JSON).body(payLoad).when()
				.post(Routes.base_uri);
		return response;

	}

	public static Response readUser(String username) {
		RestAssured.baseURI = Routes.base_uri;
		Response resonse = RestAssured.given().pathParam("username", username).when().get(Routes.get_put_delete_uri);
		return resonse;
	}

	public static Response updateUser(String username, String paylaod) {
		RestAssured.baseURI = Routes.base_uri;
		Response response = RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.pathParam("username", username).body(paylaod).when().put(Routes.get_put_delete_uri);
		return response;
	}

	public static Response deleteUser(String username) {
		RestAssured.baseURI = Routes.base_uri;
		Response response = RestAssured.given().pathParam("username", null).when().delete(Routes.get_put_delete_uri);

		return response;
	}

}
