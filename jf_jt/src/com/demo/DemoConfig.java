package com.demo;

import com.jfinal.config.*;
import com.jfinal.core.Controller;

/**
 * Created by yinrong on 2016/4/5.
 */
public class DemoConfig extends JFinalConfig{

    @Override
    public void configConstant(Constants me) {
      me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
       me.add("/hello",HelloController.class);
       me.add("/",IndexController.class);
       me.add("/user",UserController.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
