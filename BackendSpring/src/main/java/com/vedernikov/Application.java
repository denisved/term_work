package com.vedernikov;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.vedernikov.controller", "com.vedernikov.service", "com.vedernikov.exceptions", "com.vedernikov.config", "com.vedernikov.repository"})
@EntityScan({"com.vedernikov.models"})
@EnableJpaRepositories({"com.vedernikov.repository"})
public class Application {
      public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().exec("cmd /c start mysqld --console");
//        }catch (IOException e){
//            System.out.println("No mysql in path(environment variables)");
//        }
        SpringApplication.run(Application.class, args);
    }
}


