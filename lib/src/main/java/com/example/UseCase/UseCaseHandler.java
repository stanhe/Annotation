package com.example.UseCase;
import com.example.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by stan on 2017/3/10.
 */
public class UseCaseHandler {
    public static void trackUseCase(List<Integer> useCases, Class<?> c1) {
        for (Method m : c1.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Find useCase : "+uc.id()+ " description: "+uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("missing --> "+i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases,10,18,14,20);
        trackUseCase(useCases,Annotation.class);
    }
}
