package com.study.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FileName: HelloFeignService Description:
 *
 * @author caozhongyu
 * @create 19-7-31
 */
@FeignClient(name = "github-client", url = "https://api.github.com",decode404 = true)
public interface HelloFeignService {

  @GetMapping("/search/repositories")
  ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);

}