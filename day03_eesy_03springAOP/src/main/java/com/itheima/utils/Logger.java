package com.itheima.utils;


/***
 * 用于记录日志额公共类  他里面提供了公共的代码
 */
public class Logger {

    /**
     * 用于记录日志计划让其在切入点执行方法之前执行（切入点就是业务层方法）
     */
    public void printLog(){
        System.out.println("Logger类中的printlog方法开始记录日志");
    }
}
