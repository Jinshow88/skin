package com.example.demon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication//스프링 설정 파일이라는 뜻
@ConfigurationPropertiesScan//스프링부트가 필요한 설정을 자동으로 해줌
@EnableJpaAuditing// 패키지 내부의 @Controller @Service @Repository 등을 자동으로 탐색
public class DemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonApplication.class, args);
	}

}
