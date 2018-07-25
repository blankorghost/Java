package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ����һ��ע��@StudentGender
 * @author ghost
 *
 */
@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentGender {
	public enum Gender{BOY, GIRL};
    Gender gender() default Gender.BOY;
}
