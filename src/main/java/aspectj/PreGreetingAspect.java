package aspectj;

import org.aspectj.lang.annotation.*;

//定义一个aspect的设置类
@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")//定义切点
    //定义增强的方法
    public void beforeGreeting(){
        System.out.println("How are you");
    }

    @After("execution(* serveTo(..))")
    public void afterServing(){
        System.out.println("thank you for coming");
    }

    //环绕增强事实上是一个方法拦截器，环绕增强的方法会成为目标方法调用时的事实执行方法
    //通过反射的方法在环绕增强方法中执行目标方法
    @Around("@annotation(anno.NeedTest)")
    public void needTestFun(){
        System.out.println("@annotation work");
    }
}
