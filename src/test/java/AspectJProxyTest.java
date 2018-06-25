import basic.Seller;
import basic.Waiter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJProxyTest {
    String configure = "AspectJ.xml";
    ApplicationContext ctx=new ClassPathXmlApplicationContext(configure);

    @Test
    public void proxy(){
        //这一部分是通过编程生成aspectj增强代理
//        basic.Waiter target=new basic.NaiveWaiter();
//        AspectJProxyFactory factory=new AspectJProxyFactory();
//        factory.setTarget(target);
//        factory.addAspect(PreGreetingAspect.class);
//        basic.Waiter proxy=factory.getProxy();


        //通过xml自动装配aspectj增强类
        Waiter proxy =(Waiter)ctx.getBean("target");
        proxy.serveTo("zhao");
        proxy.greetTo("zhao");
        proxy.needTest("haha");

        Seller seller = (Seller) proxy;
        seller.sell("suger","hongbo");
    }
}
