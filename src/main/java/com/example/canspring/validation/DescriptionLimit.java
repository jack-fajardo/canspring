// note: this is almost all boilerplate code because this is managed by jakarta validation API
// i can make this generic so that it would be reusable (e.g InputLength)
package com.example.canspring.validation;

import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = DescriptionLimitValidator.class) // non-boilerplate code
public @interface DescriptionLimit {

    String message() default "Description must not exceed 200 characters"; // non-boilerplate code

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
