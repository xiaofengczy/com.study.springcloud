package com.study.feign;

import com.study.feign.config.DefaultFeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * FileName: FeignApplication Description:
 *
 * @author caozhongyu
 * @create 19-7-31
 */
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class)
public class FeignApplication {

  public static void main(String[] args) {
    SpringApplication.run(FeignApplication.class);
  }

}