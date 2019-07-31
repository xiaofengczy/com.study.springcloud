package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * FileName: EurekaServiceApplication Description:
 *
 * @author caozhongyu
 * @create 2019-07-31
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServiceApplication.class);
  }

}