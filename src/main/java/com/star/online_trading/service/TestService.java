package com.star.online_trading.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class TestService {
    private String BASE_URL = "http://http://10.100.200.172:8080";
    private final RestTemplate restTemplate;

    public void get() {
        String forObject = restTemplate.getForObject(BASE_URL, String.class);
    }
}
