package  parabank;
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BasicSimulation extends Simulation {

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

  private val headers_25 = Map(
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


  private val scn = scenario("testpara1")
    .exec(
      http("request_0")
        .get("/parabank/activity.htm?id=12345")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/parabank/template.css")
            .headers(headers_1),
          http("request_2")
            .get("/parabank/style.css")
            .headers(headers_1),
          http("request_3")
            .get("/parabank/webjars/angularjs/1.8.2/angular.min.js")
            .headers(headers_1),
          http("request_4")
            .get("/parabank/images/clear.gif")
            .headers(headers_1),
          http("request_5")
            .get("/parabank/images/logo.gif")
            .headers(headers_1),
          http("request_6")
            .get("/parabank/images/main-bg.gif"),
          http("request_7")
            .get("/parabank/images/topbg.gif"),
          http("request_8")
            .get("/parabank/images/header-customer.jpg")
            .headers(headers_1),
          http("request_9")
            .get("/parabank/images/bullet-hover.gif"),
          http("request_10")
            .get("/parabank/images/bullet-normal.gif"),
          http("request_11")
            .get("/parabank/images/home-normal.gif"),
          http("request_12")
            .get("/parabank/images/aboutus-normal.gif"),
          http("request_13")
            .get("/parabank/images/contact-normal.gif"),
          http("request_14")
            .get("/parabank/images/bodybg.gif"),
          http("request_15")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_16")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_17")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_18")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_19")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_20")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_21")
            .get("/parabank/images/bullet2-normal.gif"),
          http("request_22")
            .get("/parabank/images/footerbg.gif"),
          http("request_23")
            .get("/parabank/images/sky-color-bg.gif"),
          http("request_24")
            .get("/parabank/images/button-bgr.png"),
          http("request_25")
            .get("/parabank/services_proxy/bank/accounts/12345")
            .headers(headers_25),
          http("request_26")
            .get("/parabank/services_proxy/bank/accounts/12345/transactions")
            .headers(headers_25),
          http("request_27")
            .get("/parabank/images/gradhead.png"),
          http("request_28")
            .get("/parabank/images/gradhead.png"),
          http("request_29")
            .get("/parabank/images/gradhead.png"),
          http("request_30")
            .get("/parabank/images/gradhead.png"),
          http("request_31")
            .get("/parabank/images/gradback.png"),
          http("request_32")
            .get("/parabank/images/gradback.png"),
          http("request_33")
            .get("/parabank/images/gradback.png"),
          http("request_34")
            .get("/parabank/images/gradback.png"),
          http("request_35")
            .get("/parabank/images/gradback.png"),
          http("request_36")
            .get("/parabank/images/gradback.png"),
          http("request_37")
            .get("/parabank/images/gradback.png"),
          http("request_38")
            .get("/parabank/images/gradback.png"),
          http("request_39")
            .get("/parabank/images/gradback.png"),
          http("request_40")
            .get("/parabank/images/gradback.png"),
          http("request_41")
            .get("/parabank/images/gradback.png"),
          http("request_42")
            .get("/parabank/images/gradback.png"),
          http("request_43")
            .get("/parabank/images/gradback.png"),
          http("request_44")
            .get("/parabank/images/gradback.png"),
          http("request_45")
            .get("/parabank/images/gradback.png"),
          http("request_46")
            .get("/parabank/images/gradback.png"),
          http("request_47")
            .get("/parabank/images/gradback.png"),
          http("request_48")
            .get("/parabank/images/gradback.png"),
          http("request_49")
            .get("/parabank/images/gradback.png"),
          http("request_50")
            .get("/parabank/images/gradback.png"),
          http("request_51")
            .get("/parabank/images/gradback.png"),
          http("request_52")
            .get("/parabank/images/gradback.png"),
          http("request_53")
            .get("/parabank/images/gradback.png"),
          http("request_54")
            .get("/parabank/images/gradback.png"),
          http("request_55")
            .get("/parabank/images/gradback.png"),
          http("request_56")
            .get("/parabank/images/gradback.png"),
          http("request_57")
            .get("/parabank/images/gradback.png"),
          http("request_58")
            .get("/parabank/images/gradback.png"),
          http("request_59")
            .get("/parabank/images/gradback.png"),
          http("request_60")
            .get("/parabank/images/gradback.png"),
          http("request_61")
            .get("/parabank/images/gradback.png"),
          http("request_62")
            .get("/parabank/images/gradback.png")
        )
    )
    .pause(1)
    .exec(
      http("request_63")
        .get("/parabank/images/gradhover.png")
        .resources(
          http("request_64")
            .get("/parabank/images/gradhover.png"),
          http("request_65")
            .get("/parabank/images/gradhover.png"),
          http("request_66")
            .get("/parabank/images/gradhover.png"),
          http("request_67")
            .get("/parabank/images/gradback.png"),
          http("request_68")
            .get("/parabank/images/gradback.png"),
          http("request_69")
            .get("/parabank/images/gradback.png"),
          http("request_70")
            .get("/parabank/images/gradback.png"),
          http("request_71")
            .get("/parabank/images/gradhover.png"),
          http("request_72")
            .get("/parabank/images/gradhover.png"),
          http("request_73")
            .get("/parabank/images/gradhover.png"),
          http("request_74")
            .get("/parabank/images/gradhover.png"),
          http("request_75")
            .get("/parabank/images/gradback.png"),
          http("request_76")
            .get("/parabank/images/gradback.png"),
          http("request_77")
            .get("/parabank/images/gradback.png"),
          http("request_78")
            .get("/parabank/images/gradback.png"),
          http("request_79")
            .get("/parabank/images/gradhover.png"),
          http("request_80")
            .get("/parabank/images/gradhover.png"),
          http("request_81")
            .get("/parabank/images/gradhover.png"),
          http("request_82")
            .get("/parabank/images/gradhover.png"),
          http("request_83")
            .get("/parabank/images/gradback.png"),
          http("request_84")
            .get("/parabank/images/gradback.png"),
          http("request_85")
            .get("/parabank/images/gradback.png"),
          http("request_86")
            .get("/parabank/images/gradback.png"),
          http("request_87")
            .get("/parabank/images/gradhover.png"),
          http("request_88")
            .get("/parabank/images/gradhover.png"),
          http("request_89")
            .get("/parabank/images/gradhover.png"),
          http("request_90")
            .get("/parabank/images/gradhover.png"),
          http("request_91")
            .get("/parabank/images/gradback.png"),
          http("request_92")
            .get("/parabank/images/gradback.png"),
          http("request_93")
            .get("/parabank/images/gradback.png"),
          http("request_94")
            .get("/parabank/images/gradback.png"),
          http("request_95")
            .get("/parabank/images/gradhover.png"),
          http("request_96")
            .get("/parabank/images/gradhover.png"),
          http("request_97")
            .get("/parabank/images/gradhover.png"),
          http("request_98")
            .get("/parabank/images/gradhover.png"),
          http("request_99")
            .get("/parabank/images/gradback.png"),
          http("request_100")
            .get("/parabank/images/gradback.png"),
          http("request_101")
            .get("/parabank/images/gradback.png"),
          http("request_102")
            .get("/parabank/images/gradback.png"),
          http("request_103")
            .get("/parabank/images/gradhover.png"),
          http("request_104")
            .get("/parabank/images/gradhover.png"),
          http("request_105")
            .get("/parabank/images/gradhover.png"),
          http("request_106")
            .get("/parabank/images/gradhover.png"),
          http("request_107")
            .get("/parabank/images/gradback.png"),
          http("request_108")
            .get("/parabank/images/gradback.png"),
          http("request_109")
            .get("/parabank/images/gradback.png"),
          http("request_110")
            .get("/parabank/images/gradback.png"),
          http("request_111")
            .get("/parabank/images/gradhover.png"),
          http("request_112")
            .get("/parabank/images/gradhover.png"),
          http("request_113")
            .get("/parabank/images/gradhover.png"),
          http("request_114")
            .get("/parabank/images/gradhover.png"),
          http("request_115")
            .get("/parabank/images/gradhover.png"),
          http("request_116")
            .get("/parabank/images/gradhover.png"),
          http("request_117")
            .get("/parabank/images/gradhover.png"),
          http("request_118")
            .get("/parabank/images/gradhover.png"),
          http("request_119")
            .get("/parabank/images/gradback.png"),
          http("request_120")
            .get("/parabank/images/gradback.png"),
          http("request_121")
            .get("/parabank/images/gradback.png"),
          http("request_122")
            .get("/parabank/images/gradback.png"),
          http("request_123")
            .get("/parabank/images/gradhover.png"),
          http("request_124")
            .get("/parabank/images/gradhover.png"),
          http("request_125")
            .get("/parabank/images/gradhover.png"),
          http("request_126")
            .get("/parabank/images/gradhover.png"),
          http("request_127")
            .get("/parabank/images/gradback.png"),
          http("request_128")
            .get("/parabank/images/gradback.png"),
          http("request_129")
            .get("/parabank/images/gradback.png"),
          http("request_130")
            .get("/parabank/images/gradback.png"),
          http("request_131")
            .get("/parabank/images/gradback.png"),
          http("request_132")
            .get("/parabank/images/gradback.png"),
          http("request_133")
            .get("/parabank/images/gradback.png"),
          http("request_134")
            .get("/parabank/images/gradback.png"),
          http("request_135")
            .get("/parabank/images/gradhover.png"),
          http("request_136")
            .get("/parabank/images/gradhover.png"),
          http("request_137")
            .get("/parabank/images/gradhover.png"),
          http("request_138")
            .get("/parabank/images/gradhover.png"),
          http("request_139")
            .get("/parabank/images/gradhover.png"),
          http("request_140")
            .get("/parabank/images/gradhover.png"),
          http("request_141")
            .get("/parabank/images/gradhover.png"),
          http("request_142")
            .get("/parabank/images/gradhover.png"),
          http("request_143")
            .get("/parabank/images/gradback.png"),
          http("request_144")
            .get("/parabank/images/gradback.png"),
          http("request_145")
            .get("/parabank/images/gradback.png"),
          http("request_146")
            .get("/parabank/images/gradback.png"),
          http("request_147")
            .get("/parabank/images/gradhover.png"),
          http("request_148")
            .get("/parabank/images/gradhover.png"),
          http("request_149")
            .get("/parabank/images/gradhover.png"),
          http("request_150")
            .get("/parabank/images/gradhover.png"),
          http("request_151")
            .get("/parabank/images/gradback.png"),
          http("request_152")
            .get("/parabank/images/gradback.png"),
          http("request_153")
            .get("/parabank/images/gradback.png"),
          http("request_154")
            .get("/parabank/images/gradback.png"),
          http("request_155")
            .get("/parabank/images/gradhover.png"),
          http("request_156")
            .get("/parabank/images/gradhover.png"),
          http("request_157")
            .get("/parabank/images/gradhover.png"),
          http("request_158")
            .get("/parabank/images/gradhover.png"),
          http("request_159")
            .get("/parabank/images/gradback.png"),
          http("request_160")
            .get("/parabank/images/gradback.png"),
          http("request_161")
            .get("/parabank/images/gradback.png"),
          http("request_162")
            .get("/parabank/images/gradback.png"),
          http("request_163")
            .get("/parabank/images/gradhover.png"),
          http("request_164")
            .get("/parabank/images/gradhover.png"),
          http("request_165")
            .get("/parabank/images/gradhover.png"),
          http("request_166")
            .get("/parabank/images/gradhover.png"),
          http("request_167")
            .get("/parabank/images/gradback.png"),
          http("request_168")
            .get("/parabank/images/gradback.png"),
          http("request_169")
            .get("/parabank/images/gradback.png"),
          http("request_170")
            .get("/parabank/images/gradback.png"),
          http("request_171")
            .get("/parabank/images/gradhover.png"),
          http("request_172")
            .get("/parabank/images/gradhover.png"),
          http("request_173")
            .get("/parabank/images/gradhover.png"),
          http("request_174")
            .get("/parabank/images/gradhover.png"),
          http("request_175")
            .get("/parabank/images/gradback.png"),
          http("request_176")
            .get("/parabank/images/gradback.png"),
          http("request_177")
            .get("/parabank/images/gradback.png"),
          http("request_178")
            .get("/parabank/images/gradback.png"),
          http("request_179")
            .get("/parabank/images/gradback.png"),
          http("request_180")
            .get("/parabank/images/gradback.png"),
          http("request_181")
            .get("/parabank/images/gradback.png"),
          http("request_182")
            .get("/parabank/images/gradback.png"),
          http("request_183")
            .get("/parabank/images/gradhover.png"),
          http("request_184")
            .get("/parabank/images/gradhover.png"),
          http("request_185")
            .get("/parabank/images/gradhover.png"),
          http("request_186")
            .get("/parabank/images/gradhover.png"),
          http("request_187")
            .get("/parabank/images/gradback.png"),
          http("request_188")
            .get("/parabank/images/gradback.png"),
          http("request_189")
            .get("/parabank/images/gradback.png"),
          http("request_190")
            .get("/parabank/images/gradback.png"),
          http("request_191")
            .get("/parabank/images/gradhover.png"),
          http("request_192")
            .get("/parabank/images/gradhover.png"),
          http("request_193")
            .get("/parabank/images/gradhover.png"),
          http("request_194")
            .get("/parabank/images/gradhover.png"),
          http("request_195")
            .get("/parabank/images/gradback.png"),
          http("request_196")
            .get("/parabank/images/gradback.png"),
          http("request_197")
            .get("/parabank/images/gradback.png"),
          http("request_198")
            .get("/parabank/images/gradback.png")
        )
    )

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
