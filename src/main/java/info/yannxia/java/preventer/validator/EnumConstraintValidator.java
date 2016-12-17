package info.yannxia.java.preventer.validator;

import info.yannxia.java.preventer.constraints.Enums;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

/**
 * @author yann
 * @since 2016/12/17.
 */
public class EnumConstraintValidator implements ConstraintValidator<Enums, String> {

    private Class enumType = null;

    @Override
    public void initialize(Enums constraintAnnotation) {
        this.enumType = constraintAnnotation.enumType();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return Arrays.stream(this.enumType.getEnumConstants())
                .anyMatch(o -> o.toString().equals(value));
    }
}
