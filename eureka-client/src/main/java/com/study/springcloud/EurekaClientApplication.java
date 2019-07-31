package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * FileName: EurekaClientApplication Description:
 *
 * @author caozhongyu
 * @create 19-7-31
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {
  public static void main(String[] args){
    SpringApplication.run(EurekaClientApplication.class, args);
  }

}