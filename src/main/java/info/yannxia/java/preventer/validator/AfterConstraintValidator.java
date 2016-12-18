package info.yannxia.java.preventer.validator;

import info.yannxia.java.preventer.constraints.After;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yann
 * @since 2016/12/18.
 */
public class AfterConstraintValidator implements ConstraintValidator<After, Object> {

    @Override
    public void initialize(After constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (null == value) {
            return true;
        }

        if (value instanceof Date) {
            return ((Date) value).after(new Date());
        }

        if (value instanceof Calendar) {
            return ((Calendar) value).after(new Calendar.Builder().build());
        }

        if (value instanceof LocalDateTime) {
            return ((LocalDateTime) value).isAfter(LocalDateTime.now());
        }

        if (value instanceof LocalDate) {
            return ((LocalDate) value).isAfter(LocalDate.now());
        }

        throw new RuntimeException("After Constraint just for Date, Calendar, LocalDate, LocalDateTime");
    }
}
