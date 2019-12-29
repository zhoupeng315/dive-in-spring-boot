package com.eric.diveinspringboot.bootstrap;

import com.eric.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/** persistent type */
@ComponentScan(basePackages = "com.eric.diveinspringboot.repository")
public class RepositoryBootstrap {
  public static void main(String[] args) {

    ConfigurableApplicationContext context =
        new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

    MyFirstLevelRepository myFirstLevelRepository =
        context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

    System.out.println("myfirstLevelRepository : " + myFirstLevelRepository.toString());
    context.close();
  }
}
