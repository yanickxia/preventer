package info.yannxia.java.preventer.constraints;

import info.yannxia.java.preventer.validator.EnumConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author yann
 * @since 2016/12/17.
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = EnumConstraintValidator.class)
public @interface Enums {

    Class enumType();

    String message() default "{info.yannxia.java.preventer.validator.constraints.Enums.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
