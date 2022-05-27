package com.nisum.createUser.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nisum.createUser.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiEndPoinstInfo())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiEndPoinstInfo() {
        return new ApiInfoBuilder()
                .title("Nisum Technical Test Java REST API")
                .description("REST API for java technical test Oscar Eduardo Mayor")
                .contact(new Contact("Oscar Eduardo Mayor", "https://github.com/oscarmayor0211", "oscarmayor0211@gmail.com"))
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.txt")
                .version("1.0.0")
                .build();
    }
}

