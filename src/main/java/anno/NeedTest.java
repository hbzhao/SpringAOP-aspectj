package anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//注解的保留期限
@Target(ElementType.METHOD)//声明只有函数可以使用这个注解
public @interface NeedTest {
    boolean value() default true;
}
