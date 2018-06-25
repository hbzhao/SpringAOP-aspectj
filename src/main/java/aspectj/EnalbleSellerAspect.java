package aspectj;

import basic.Seller;
import basic.SmartSeller;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnalbleSellerAspect {
    //定义引介增强，第一个参数是目标类，第二个参数是增强类
    @DeclareParents(value = "basic.NaiveWaiter",defaultImpl =SmartSeller.class)
    public Seller seller;
}
