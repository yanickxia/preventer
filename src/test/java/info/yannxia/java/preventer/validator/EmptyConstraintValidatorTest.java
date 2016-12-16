package info.yannxia.java.preventer.validator;

import info.yannxia.java.preventer.constraints.Empty;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yann on 2016/12/16.
 */
public class EmptyConstraintValidatorTest {

    private ValidationWrapper<EmptyTest> validationWrapper;

    @Before
    public void before() {
        EmptyTest emptyTest = new EmptyTest();
        validationWrapper = new ValidationWrapper<>(emptyTest, "must empty");
    }

    @Test
    public void isValid() throws Exception {
        validationWrapper.assertViolation("notEmptyStringList");
        validationWrapper.assertNoViolations("emptyStringList");
    }

}

class EmptyTest {
    @Empty
    private List<String> emptyStringList = Collections.emptyList();

    @Empty
    private List<String> notEmptyStringList = Collections.singletonList("123");
}