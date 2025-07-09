package RestTest;

import org.testng.annotations.Test;

import junit.framework.Assert;

//static imports
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class getCall {
	/*
	 * given():
	 *   - Set content type
	 *   - Set cookies
	 *   - Add authentication
	 *   - Add query or path parameters
	 *   - Set headers
	 *
	 * when():
	 *   - Perform HTTP method calls: GET, POST, PUT, DELETE, etc.
	 *
	 * then():
	 *   - Validate status code
	 *   - Extract response body, headers, cookies
	 *   - Validate response body content
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void getTeamDetails() {
		try {
			given().
				//queryParam("t", "Arsenal").
			when().
				get("https://www.thesportsdb.com/api/v1/json/123/searchteams.php?t=Barcelona").
			then().
				assertThat().
				statusCode(200).
				
				and().
				body("teams.strTeam",contains("Barcelona", "FC Barcelona Basquet")).
				
				and().
				header("Content-Length", equalTo("7941")).
				log().all();    //log().all() -  presents the complete body of the response in console output
		}
		catch(Exception e) {
			Assert.fail("Test Failed due to Exception "+e.getMessage());
		}
	}
	
	

}
