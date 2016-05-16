package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by yinrong on 2016/4/5.
 */
public class IndexController extends Controller{
    public void index(){
        renderText("这是jetty下的controller");
    }
}
