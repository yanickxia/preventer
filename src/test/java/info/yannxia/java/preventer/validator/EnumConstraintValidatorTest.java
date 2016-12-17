package info.yannxia.java.preventer.validator;

import info.yannxia.java.preventer.constraints.Empty;
import info.yannxia.java.preventer.constraints.Enums;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author yann
 * @since 2016/12/17.
 */
public class EnumConstraintValidatorTest {

    private ValidationWrapper<Enums> validationWrapper;

    @Before
    public void before() {
        validationWrapper = new ValidationWrapper(new EnumsTest(), "must enums");
    }

    @Test
    public void isValid() throws Exception {
        this.validationWrapper.assertNoViolations("a");
        this.validationWrapper.assertViolation("b");
    }

    enum E {
        A
    }


    static class EnumsTest {
        @Enums(enumType = E.class)
        private String a = "A";


        @Enums(enumType = E.class)
        private String b = "B";

    }
}