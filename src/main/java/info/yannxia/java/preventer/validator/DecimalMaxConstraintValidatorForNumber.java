package info.yannxia.java.preventer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.DecimalMax;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by yann on 2016/12/15.
 */
public class DecimalMaxConstraintValidatorForNumber implements ConstraintValidator<DecimalMax, Number> {

    private BigDecimal max;
    private boolean inclusive;

    @Override
    public void initialize(DecimalMax constraintAnnotation) {
        this.max = new BigDecimal(constraintAnnotation.value());
        this.inclusive = constraintAnnotation.inclusive();
    }

    @Override
    public boolean isValid(Number value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        int compareTo = 0;
        if (value instanceof BigDecimal) {
            BigDecimal v = (BigDecimal) value;
            compareTo = v.compareTo(max);
        }
        if (value instanceof BigInteger) {
            BigInteger v = (BigInteger) value;
            compareTo = v.compareTo(max.toBigInteger());
        }
        if (value instanceof Long) {
            Long v = (Long) value;
            compareTo = v.compareTo(max.longValue());
        } else {
            compareTo = BigDecimal.valueOf(value.doubleValue()).compareTo(max);
        }

        return inclusive ? compareTo <= 0 : compareTo < 0;
    }
}
