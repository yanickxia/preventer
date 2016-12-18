package info.yannxia.java.preventer.constraints;

import info.yannxia.java.preventer.validator.AfterConstraintValidator;
import info.yannxia.java.preventer.validator.EmptyConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Past;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * The annotated element must be a date in the past.
 * Now is defined as the current time according to the virtual machine.
 * <p/>
 * The calendar used if the compared type is of type {@code Calendar}
 * is the calendar based on the current timezone and the current locale.
 * <p/>
 * Supported types are:
 * <ul>
 *     <li>{@code java.util.Date}</li>
 *     <li>{@code java.util.Calendar}</li>
 *     <li>{@code java.time.LocalDateTime}</li>
 *     <li>{@code java.time.LocalDate}</li>
 * </ul>
 * <p/>
 * {@code null} elements are considered valid.
 *
 * @author Emmanuel Bernard
 */



/**
 * @author yann
 * @since 2016/12/18.
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = AfterConstraintValidator.class)
public @interface After {

    String message() default "{info.yannxia.java.preventer.validator.constraints.After.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    /**
     * Defines several {@link Past} annotations on the same element.
     *
     * @see Past
     */
    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    @interface List {

        Past[] value();
    }
}
