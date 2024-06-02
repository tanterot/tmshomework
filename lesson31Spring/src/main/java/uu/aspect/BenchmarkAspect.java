package uu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BenchmarkAspect {
    @Pointcut("@annotation(uu.aspect.Benchmark)")
    public void aroundAll(){

    }
    @Around("aroundAll()")
    public Object logAround(ProceedingJoinPoint joinPoint){
        long start = System.nanoTime();
        Object result = null;
        try {
          result =  joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        long finish = System.nanoTime();
        System.out.println(finish-start);
        return result;
    }
}
