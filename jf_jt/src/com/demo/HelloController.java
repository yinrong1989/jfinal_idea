package com.demo;


import com.jfinal.core.Controller;

/**
 * Created by yinrong on 2016/4/5.
 */
public class HelloController extends Controller{
 public  void index(){
     renderText("欢迎来到Jfinal的时间");
 }
}
