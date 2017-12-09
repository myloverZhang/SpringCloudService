package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.xerial.snappy.Snappy;

import java.io.File;
import java.net.URLConnection;
import java.util.zip.Deflater;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
		System.out.println(String.format("%s",System.getProperty("user.dir")));
	}
}
