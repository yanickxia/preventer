package info.yannxia.java.preventer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.AssertTrue;

/**
 * Created by yann on 2016/12/15.
 */
public class AssertTrueConstraintValidator implements ConstraintValidator<AssertTrue, Boolean> {
    @Override
    public void initialize(AssertTrue constraintAnnotation) {

    }

    @Override
    public boolean isValid(Boolean value, ConstraintValidatorContext context) {
        return value == null || value;
    }
}
