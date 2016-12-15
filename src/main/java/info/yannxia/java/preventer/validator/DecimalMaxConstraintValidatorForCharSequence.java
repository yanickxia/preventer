package info.yannxia.java.preventer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.DecimalMax;

/**
 * Created by yann on 2016/12/15.
 */
public class DecimalMaxConstraintValidatorForCharSequence implements ConstraintValidator<DecimalMax, CharSequence> {
    @Override
    public void initialize(DecimalMax constraintAnnotation) {

    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        return false;
    }
}
