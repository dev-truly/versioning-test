package com.example.versioningtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VersioningTestApplication {

	public static void main(String[] args) {
		System.out.println("테스트 작업");
		SpringApplication.run(VersioningTestApplication.class, args);
	}

}
