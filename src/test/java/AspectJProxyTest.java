import aspectj.PreGreetingAspect;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJProxyTest {
    String configure = "AspectJ.xml";
    ApplicationContext ctx=new ClassPathXmlApplicationContext(configure);

    @Test
    public void proxy(){
        //这一部分是通过编程生成aspectj增强代理
//        Waiter target=new NaiveWaiter();
//        AspectJProxyFactory factory=new AspectJProxyFactory();
//        factory.setTarget(target);
//        factory.addAspect(PreGreetingAspect.class);
//        Waiter proxy=factory.getProxy();


        //通过xml自动装配aspectj增强类
        Waiter proxy =(Waiter)ctx.getBean("target");
        proxy.serveTo("zhao");
        proxy.greetTo("zhao");
    }
}
