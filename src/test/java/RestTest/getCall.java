package RestTest;

import org.testng.annotations.Test;

//static imports
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class getCall {
	
	@Test
	public void getTeamDetails() {
		given().
		when().
			get("https://www.thesportsdb.com/api/v1/json/123/searchteams.php?t=Arsenal").
		then().
			assertThat().
			statusCode(200).
			
			and().
			
			body("teams.strTeam",contains("Arsenal")).
			
			and().
			
			header("Content-Length", equalTo("7942"));
	}

}
