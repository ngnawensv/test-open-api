package com.belrose.testopenapi;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title = "Test Open APIs Service",version = "v1",
		description = "Test Open APIs for integrating openapi and swagger-ui.",
		license = @License(name = "Apache 2.0",url = "https://www.apache.org/licences/LICENCE-2.0")))
public class TestOpenApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestOpenApiApplication.class, args);
	}

}
