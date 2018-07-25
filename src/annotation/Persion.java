package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义一个注解@Persion
 * @author ghost
 *
 */
@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Persion {
	String name() default "zcx";
    int age() default 18;

    String[] hobby() default {"basketball", "football"};
}
