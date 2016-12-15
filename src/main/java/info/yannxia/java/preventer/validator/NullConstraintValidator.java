package info.yannxia.java.preventer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Null;
import java.util.Objects;

/**
 * Created by yann on 2016/12/15.
 */
public class NullConstraintValidator implements ConstraintValidator<Null, Object> {
    @Override
    public void initialize(Null constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return Objects.isNull(value);
    }
}
