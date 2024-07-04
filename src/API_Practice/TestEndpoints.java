package API_Practice;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.gson.Gson;

import io.restassured.response.Response;

public class TestEndpoints {
	Faker faker;
	User userPayload;

	@BeforeTest
	public void beforeTest()

	{
		System.out.println("*****************USERNAME UNDER TEST**********************************");
		faker = new Faker();
		userPayload = new User();
		userPayload.setUserId(faker.idNumber().hashCode());
		userPayload.setUserName(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5, 10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());

		System.out.println("Some Random username genereated by Faker:\t" + userPayload.getUserName());
		System.out.println("**********************************************************************");
	}

	@Test(enabled = false)
	public void testPostMethod() {
		Map<String, Object> bodyParam = new HashMap<String, Object>();
		bodyParam.put("id", userPayload.getUserId());
		bodyParam.put("username", userPayload.getUserName());
		bodyParam.put("firstname", userPayload.getFirstName());
		bodyParam.put("lastname", userPayload.getLastName());
		bodyParam.put("email", userPayload.getEmail());
		bodyParam.put("password", userPayload.getPassword());
		bodyParam.put("phone", userPayload.getPhone());
		bodyParam.put("userStatus", 0);
		String payload = new Gson().toJson(bodyParam);
		System.out.println("*************************{POST}***************************************");
		Response response = UserEndpoints.createUser(payload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertTrue(response.statusLine().contains("OK"));
	}

	@Test(priority = 2)
	public void testGetUserByName()

	{

		System.out.println("*************************{GET}****************************************");
		Response response = UserEndpoints.readUser(this.userPayload.getUserName());
		response.then().log().body().statusCode(200);
		System.out.println("************  " + this.userPayload.getUserName() + " is fetched **********");
	}

}