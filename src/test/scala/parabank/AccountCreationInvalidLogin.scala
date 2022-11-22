package parabank

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class AccountCreationInvalidLogin extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://parabank.parasoft.com")
    .inferHtmlResources()

  private val headers_1 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "origin" -> "https://parabank.parasoft.com",
    "sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "sec-gpc" -> "1",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36"
  )

  private val headers_2 = Map(
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
    "sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows"
  )

  private val headers_21 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "sec-gpc" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36"
  )

  private val headers_23 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "sec-gpc" -> "1",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36"
  )

  private val headers_44 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "content-type" -> "application/json;charset=UTF-8",
    "origin" -> "https://parabank.parasoft.com",
    "sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "sec-gpc" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36"
  )


  private val scn = scenario("AccountCreation")
    .exec(
      http("request_0")
        .get("/parabank/images/bullet2-hover.gif")
    )
    .pause(8)
    .exec(
      http("LOGIN_REQUEST")
        .post("/parabank/login.htm")
        .headers(headers_1)
        .formParam("username", "john")
        .formParam("password", "demo1")
        .resources(
          http("request_2")
            .get("/parabank/webjars/angularjs/1.8.2/angular.min.js")
            .headers(headers_2),
          http("request_3")
            .get("/parabank/images/clear.gif")
            .headers(headers_2),
          http("LOGO_REQUEST")
            .get("/parabank/images/logo.gif")
            .headers(headers_2),
          http("request_5")
            .get("/parabank/template.css"),
          http("request_6")
            .get("/parabank/style.css"),
          http("request_7")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_2),
          http("request_8")
            .get("/parabank/images/topbg.gif")
            .headers(headers_2),
          http("request_9")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_2),
          http("request_10")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_2),
          http("request_11")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_2),
          http("request_12")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_2),
          http("request_13")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_2),
          http("request_14")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_2),
          http("request_15")
            .get("/parabank/images/bullet2-normal.gif")
            .headers(headers_2),
          http("request_16")
            .get("/parabank/images/header-customer.jpg"),
          http("request_17")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_2),
          http("request_18")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_2),
          http("request_19")
            .get("/parabank/images/gradhead.png"),
          http("request_20")
            .get("/parabank/images/gradback.png"),
          http("GET_ACCOUNT_REQUEST")
            .get("/parabank/services_proxy/bank/customers/12212/accounts")
            .headers(headers_21)
        )
    )
    .pause(1)
    .exec(
      http("request_22")
        .get("/parabank/images/bullet2-hover.gif")
    )
    .pause(2)
    .exec(
      http("request_23")
        .get("/parabank/openaccount.htm")
        .headers(headers_23)
        .resources(
          http("request_24")
            .get("/parabank/webjars/angularjs/1.8.2/angular.min.js")
            .headers(headers_2),
          http("request_25")
            .get("/parabank/images/clear.gif")
            .headers(headers_2),
          http("request_26")
            .get("/parabank/images/logo.gif")
            .headers(headers_2),
          http("request_27")
            .get("/parabank/template.css"),
          http("request_28")
            .get("/parabank/style.css"),
          http("request_29")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_2),
          http("request_30")
            .get("/parabank/images/topbg.gif")
            .headers(headers_2),
          http("request_31")
            .get("/parabank/images/header-customer.jpg")
            .headers(headers_2),
          http("request_32")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_2),
          http("request_33")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_2),
          http("request_34")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_2),
          http("request_35")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_2),
          http("request_36")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_2),
          http("request_37")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_2),
          http("request_38")
            .get("/parabank/images/bullet2-normal.gif")
            .headers(headers_2),
          http("request_39")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_2),
          http("request_40")
            .get("/parabank/images/button-bgr.png")
            .headers(headers_2),
          http("request_41")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_2),
          http("request_42")
            .get("/parabank/services_proxy/bank/customers/12212/accounts")
            .headers(headers_21),
          http("request_43")
            .get("/parabank/images/bullet2-hover.gif")
            .headers(headers_2)
        )
    )
    .pause(30)
    .exec(
      http("CREATE_ACCOUNT_REQUEST")
        .post("/parabank/services_proxy/bank/createAccount?customerId=12212&newAccountType=0&fromAccountId=12345")
        .headers(headers_44)
    )

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}

