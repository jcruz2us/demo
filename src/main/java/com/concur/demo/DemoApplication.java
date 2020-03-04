package com.concur.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@EnableAutoConfiguration
@SpringBootConfiguration
public class DemoApplication {

	String testFunction() {
		return "This is a test!";
	}

	@RequestMapping("/")
	String home() throws MalformedURLException {
		var url = new URL("https://yahoo.com");

		Integer t = 4/1;
		var tes = "ahhhh" + 2 + 'c';

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://openjdk.java.net/"))
				.build();
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body)
				.thenAccept(s -> System.out.println(s))
				.join();
		return "Hello World!" + t.toString() + (new Object()) + url.getHost();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
