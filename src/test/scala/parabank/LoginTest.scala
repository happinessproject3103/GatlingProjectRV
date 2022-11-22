package parabank

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class LoginTest extends Simulation{

  // 1 Http Conf
  val httpConf = http.baseUrl("https://parabank.parasoft.com/parabank")
    .acceptHeader("application/json")

  // 2 Scenario Definition
  val scn = scenario("Login Test").
         exec(http("login")
      .post("/login.htm").body(StringBody("""{
                           "username": "john",
                           "password": "demo"
                       } """)).asJson)

  // 3 Load Scenario
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}
