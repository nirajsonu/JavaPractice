package opps;

import java.lang.annotation.Annotation;

public class AnnotationImplemetation implements MyAnoonation{
   /* @Override
    public void m1() {

    }*/

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
