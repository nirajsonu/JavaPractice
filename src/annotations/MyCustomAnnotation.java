package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//at which place used in method,class,aur consustrucor
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface  MyCustomAnnotation {
    int value() default 0;
    String name() default "Neeraj";

    String city() default "Ranchi";
}
