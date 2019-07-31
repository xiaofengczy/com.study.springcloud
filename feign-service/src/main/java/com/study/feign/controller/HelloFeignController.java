package com.study.feign.controller;

import com.study.feign.api.HelloFeignService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: HelloFeignController Description:
 *
 * @author caozhongyu
 * @create 19-7-31
 */
@RestController
public class HelloFeignController {

  @Resource
  private HelloFeignService helloFeignService;

  @GetMapping("/search/github")
  public String searchGithubRepoByStr(@RequestParam("query") String queryStr){
    return helloFeignService.searchRepo(queryStr);
  }
}