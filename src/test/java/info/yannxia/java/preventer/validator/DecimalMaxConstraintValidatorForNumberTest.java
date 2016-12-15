package info.yannxia.java.preventer.validator;

import org.junit.Before;
import org.junit.Test;

import javax.validation.constraints.DecimalMax;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by yann on 2016/12/15.
 */
public class DecimalMaxConstraintValidatorForNumberTest {

    private ValidationWrapper<DecimalMaxConstraintValidatorForNumberTestBean> validationWrapper;
    private DecimalMaxConstraintValidatorForNumberTestBean decimalMaxConstraintValidatorForNumberTestBean;

    @Before
    public void before() {
        decimalMaxConstraintValidatorForNumberTestBean = new DecimalMaxConstraintValidatorForNumberTestBean();
        validationWrapper = new ValidationWrapper<>(decimalMaxConstraintValidatorForNumberTestBean, null);
    }

    @Test
    public void isValid() throws Exception {
        validationWrapper.assertNoViolations("integer");
    }

}

class DecimalMaxConstraintValidatorForNumberTestBean {
    @DecimalMax(value = "30")
    private Integer integer;

    @DecimalMax(value = "30")
    private BigDecimal bigDecimal = new BigDecimal("29");

    @DecimalMax(value = "30")
    private BigInteger bigInteger = new BigInteger("29");

    @DecimalMax(value = "30")
    private Long aLong = 29L;

    @DecimalMax(value = "30")
    private Double aDouble = 29.00D;
}