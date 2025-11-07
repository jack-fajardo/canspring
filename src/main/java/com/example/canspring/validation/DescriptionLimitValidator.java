// note: method name 'isValid' should be required. This is what jakarta validation API wants
// return type also required to be boolean
package com.example.canspring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DescriptionLimitValidator implements ConstraintValidator<DescriptionLimit, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value.length() <= 200;
    }
}
