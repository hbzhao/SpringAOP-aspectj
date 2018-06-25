package aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")//定义切点
    //定义增强的方法
    public void beforeGreeting(){
        System.out.println("How are you");
    }
}
