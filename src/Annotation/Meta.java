package Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    String str();
    int value();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация тестового класса")
@MyAnnotation2(str = "Meta", value = 99)
class Meta {
    @What(description = "Аннотация тестового метода")
    @MyAnnotation2(str = "Testing", value = 100)
    public static void myMeth() {
        Meta meta = new Meta();

        try {
            Annotation annos[] = meta.getClass().getAnnotations();
            System.out.println("Bce аннотации для класса Meta:");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();

            Method m = meta.getClass( ).getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Все аннотации для метода myMeth():");
            for (Annotation a : annos)
                System.out.println(a);
        }catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
