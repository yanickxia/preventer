package info.yannxia.java.preventer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Created by yann on 2016/12/15.
 */
public class NotNullConstraintValidator implements ConstraintValidator<NotNull, Object> {

    @Override
    public void initialize(NotNull constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return Objects.nonNull(value);
    }
}
