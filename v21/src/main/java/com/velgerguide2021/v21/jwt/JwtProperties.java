package com.velgerguide2021.v21.jwt;


import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtProperties {

	private String secretKey = "secret";

	//validity in milliseconds
	private long validityInMs = 3600000; // 1h
}
