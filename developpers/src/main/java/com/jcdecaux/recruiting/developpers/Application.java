package com.jcdecaux.recruiting.developpers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@PropertySource("application.properties")
@EntityScan("com.jcdecaux.recruiting.developpers.*")  
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }
}
