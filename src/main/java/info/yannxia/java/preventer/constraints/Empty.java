package info.yannxia.java.preventer.constraints;

import info.yannxia.java.preventer.validator.EmptyConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by yann on 2016/12/16.
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = EmptyConstraintValidator.class)
public @interface Empty {

    String message() default "{info.yannxia.java.preventer.validator.constraints.Empty.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}