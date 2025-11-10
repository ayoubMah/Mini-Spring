package main.java.validation.annotations.core;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public record ValidationError(String field, String message){

    }

    public static List<ValidationError> validate(Object obj) throws IllegalAccessException {

        List<ValidationError> errors = new ArrayList<>();
        // get object class
        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class)){
                NotNull annotation = field.getAnnotation(NotNull.class);
                Object value = field.get(obj);
                if (value == null) {
                    errors.add(new ValidationError(field.getName(), annotation.message()));
                }
            }
        }
        return errors;
    }

    public static void printErrors(List<ValidationError> errors) {
        if (errors.isEmpty()) {
            System.out.println("✅ All validations passed!");
        } else {
            errors.forEach(e -> System.err.println(e.field() + ": " + e.message()));
        }
    }
}
