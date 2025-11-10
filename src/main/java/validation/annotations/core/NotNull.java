package main.java.validation.annotations.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a field as required (must not be null).
 *
 * <p>This annotation will be used by the Validator engine
 * to check that the field has a non-null value at runtime.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * public class User {
 *     @NotNull(message = "Username cannot be null")
 *     private String username;
 * }
 * </pre>
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    String message() default "Field must be not null!";
}
