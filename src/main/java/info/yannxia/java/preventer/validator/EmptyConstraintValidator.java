package info.yannxia.java.preventer.validator;

import info.yannxia.java.preventer.constraints.Empty;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by yann on 2016/12/16.
 */
public class EmptyConstraintValidator implements ConstraintValidator<Empty, Object> {
    @Override
    public void initialize(Empty constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        if (value.getClass().isArray()) {
            return ((Object[]) value).length == 0;
        }

        if (Iterable.class.isAssignableFrom(value.getClass())) {
            return !((Iterable) value).iterator().hasNext();
        }

        return false;
    }
}
