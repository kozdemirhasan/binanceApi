package de.kozdemir.binanceApi;

import de.kozdemir.binanceApi.exception.RestTemplateResponseErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BinanceApiApplication {

    private final RestTemplateResponseErrorHandler responseErrorHandler;

    public BinanceApiApplication(RestTemplateResponseErrorHandler responseErrorHandler) {
        this.responseErrorHandler = responseErrorHandler;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .errorHandler(responseErrorHandler)
                .build();

    }

//	@Bean
//	public HttpHeaders httpHeaders(){
//		return new HttpHeaders();
//	}

    public static void main(String[] args) {
        SpringApplication.run(BinanceApiApplication.class, args);
    }

}
