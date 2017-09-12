package com.allen.code.aspecttest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AsyncAspect {
    @Pointcut("execution(@com.allen.code.aspecttest.AsyncTask * *(..))")//方法切入点
    public void methodAnnotated() {
    }

    @Pointcut("execution(@com.allen.code.aspecttest.AsyncTask *.new(..))")//构造器切入点
    public void constructorAnnotated() {
    }

    @Before("methodAnnotated() || constructorAnnotated()")//在连接点进行方法替换
    public void aroundJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
//        Object obj = joinPoint.proceed();
        LogUtils.showLog("AsyncAspect getDeclaringClass", "befor");
//        return joinPoint.proceed();

    }

}