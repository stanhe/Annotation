package com.example.Test;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by stan on 2017/3/11.
 */
public class InjectUtil {
    public static void inject(Test cl) {
        Field[] fields = cl.getClass().getFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                Class<?> annotationType = annotation.annotationType(); //返回方法上面使用的注解类
                CategoryAnnotation categoryAnnotation = annotationType.getAnnotation(CategoryAnnotation.class);
                if (categoryAnnotation != null) {
                    String name = categoryAnnotation.name();
                    AnimalType type = categoryAnnotation.animalType();
                    try {
                        if (type == AnimalType.DOG) {
                            if (name.equals("Ji-wa-wa")) {
                                field.set(cl, new Dog("ji wa wa start sa huan!"));//没错就是 吉娃娃开始撒欢
                            }else {
                                field.set(cl,new Dog("tai di start run!")); //泰迪开始跑
                            }
                        } else if (type == AnimalType.CAT) {
                            field.set(cl,new Cat());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("no categoryAnnotation!");
                }
            }
        }
    }
}
