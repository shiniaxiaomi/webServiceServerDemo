package com.lyj;

import javax.jws.WebService;

@WebService
public class Demo {

    public String hello(String str){
        System.out.println(str);
        return "hello";
    }
}
