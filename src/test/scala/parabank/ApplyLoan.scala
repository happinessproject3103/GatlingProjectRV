package parabank

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class ApplyLoan extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://parabank.parasoft.com")
    .inferHtmlResources()

  private val headers_0 = Map(
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

  private val headers_1 = Map(
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
    "sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows"
  )

  private val headers_20 = Map(
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


  private val scn = scenario("testpara1")
    .exec(
      http("request_0")
        .get("/parabank/requestloan.htm")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/parabank/webjars/angularjs/1.8.2/angular.min.js")
            .headers(headers_1),
          http("request_2")
            .get("/parabank/images/clear.gif")
            .headers(headers_1),
          http("request_3")
            .get("/parabank/images/logo.gif")
            .headers(headers_1),
          http("request_4")
            .get("/parabank/template.css"),
          http("request_5")
            .get("/parabank/style.css"),
          http("request_6")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_1),
          http("request_7")
            .get("/parabank/images/topbg.gif")
            .headers(headers_1),
          http("request_8")
            .get("/parabank/images/header-customer.jpg")
            .headers(headers_1),
          http("request_9")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_1),
          http("request_10")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_1),
          http("request_11")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_1),
          http("request_12")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_1),
          http("request_13")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_1),
          http("request_14")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_1),
          http("request_15")
            .get("/parabank/images/bullet2-normal.gif")
            .headers(headers_1),
          http("request_16")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_1),
          http("request_17")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_1),
          http("request_18")
            .get("/parabank/images/button-bgr.png")
            .headers(headers_1),
          http("request_19")
            .get("/parabank/images/bullet2-hover.gif")
            .headers(headers_1)
        )
    )
    .pause(12)
    .exec(
      http("request_20")
        .post("/parabank/services_proxy/bank/requestLoan?customerId=12212&amount=200&downPayment=100&fromAccountId=12456")
        .headers(headers_20)
    )

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
