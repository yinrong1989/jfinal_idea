package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by yinrong on 2016/4/5.
 */
public class UserController  extends Controller {
    public void index(){
        renderText("这是user");
    }
}
