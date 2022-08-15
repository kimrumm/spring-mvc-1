package hello.springmvc.bagic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

// return 값이 문자열이 바로 반환된다.
@Slf4j
@RestController
public class LogTestController {

	@RequestMapping("/log-test")
	public String logTest(){
		String name = "Spring";

		log.trace("trace log={}", name);
		log.debug("debug log={}", name);
		log.info("info log{} ", name);
		log.warn("warn log={}", name);
		log.error("error log={}", name);

		return "ok";
	}

}
