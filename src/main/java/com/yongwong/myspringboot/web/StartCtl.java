package com.yongwong.myspringboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR hugowong
 * @DATE 2018/11/30
 * @VERSION 1.0.0
 * @DESCRIPTION
 */
@RestController
@RequestMapping("/")
public class StartCtl {

  @RequestMapping("/start")
  public String start(){
    return "welcome to spring-boot";
  }
}
