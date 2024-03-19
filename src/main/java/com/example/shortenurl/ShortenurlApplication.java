package com.example.shortenurl;

import com.example.shortenurl.controllers.UrlController;
import com.example.shortenurl.dtos.ShortenUrlRequestDto;
import com.example.shortenurl.dtos.ShortenUrlResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShortenurlApplication implements CommandLineRunner {
	@Autowired
	UrlController urlController;

	public static void main(String[] args) {
		SpringApplication.run(ShortenurlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ShortenUrlRequestDto requestDto = new ShortenUrlRequestDto();
		requestDto.setOriginalUrl("https://www.linkedin.com/in/alaminsk/");
		requestDto.setUserId(1);
		ShortenUrlResponseDto responseDto = urlController.shortenUrl(requestDto);
		System.out.println(responseDto);

	}
}
