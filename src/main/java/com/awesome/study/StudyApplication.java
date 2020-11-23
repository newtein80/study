package com.awesome.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @SpringBootApplication
 * 하나 이상의 @Bean 메서드를 선언하고 자동 구성 및 구성 요소 스캔을 트리거하는 구성 클래스를 나타냅니다.
 * 이것은 @Configuration, @EnableAutoConfiguration 및 @ComponentScan을 선언하는 것과 동일합니다.
 * 
 * @RestController
 * 'spring-boot-starter-web' dependency Need to add.
 * Called "stereo annotation". In this case, this controller handling incoming web request.
 * The @RestController annotation tells Spring to render the resulting string directly back to the caller.
 */
@RestController
@SpringBootApplication
public class StudyApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
	public static void main(String[] args) {
		// 실행순서: mvn package -> java -jar [packaging file].jar
		SpringApplication.run(StudyApplication.class, args);
	}
}
