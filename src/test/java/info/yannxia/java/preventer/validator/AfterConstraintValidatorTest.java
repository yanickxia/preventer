package info.yannxia.java.preventer.validator;

import info.yannxia.java.preventer.constraints.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author yann
 * @since 2016/12/18.
 */
public class AfterConstraintValidatorTest {

    private ValidationWrapper<After> validationWrapper;

    @Before
    public void setUp() throws Exception {
        this.validationWrapper = new ValidationWrapper(new TestBean(), "must after");
    }

    @Test
    public void isValid() throws Exception {
        this.validationWrapper.assertNoViolations("date");
        this.validationWrapper.assertNoViolations("calendar");
        this.validationWrapper.assertNoViolations("localDate");
        this.validationWrapper.assertNoViolations("localDateTime");
        this.validationWrapper.assertViolation("errLocalDateTime");
    }

    static class TestBean {

        @After
        private Date date = new Date(2999, 12, 31);

        @After
        private Calendar calendar = new Calendar.Builder().setInstant(new Date(2999, 12, 31)).build();

        @After
        private LocalDate localDate = LocalDate.MAX;

        @After
        private LocalDateTime localDateTime = LocalDateTime.MAX;

        @After
        private LocalDateTime errLocalDateTime = LocalDateTime.MIN;

    }

}