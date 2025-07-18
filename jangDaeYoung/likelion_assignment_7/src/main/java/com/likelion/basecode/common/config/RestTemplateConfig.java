package com.likelion.basecode.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    // RestTemplate 빈을 생성하여 스프링 컨테이너에 등록 · HTTP 요청 후 JSON, XML, String 과 같은 응답을 받을 수 있는 템플릿
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
