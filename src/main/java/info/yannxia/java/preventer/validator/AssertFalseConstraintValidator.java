package info.yannxia.java.preventer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.AssertFalse;

/**
 * Created by yann on 2016/12/15.
 */
public class AssertFalseConstraintValidator implements ConstraintValidator<AssertFalse, Boolean> {
    @Override
    public void initialize(AssertFalse constraintAnnotation) {

    }

    @Override
    public boolean isValid(Boolean value, ConstraintValidatorContext context) {
        //null is valid
        return value == null || !value;
    }
}
