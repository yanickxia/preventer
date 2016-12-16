package info.yannxia.java.preventer;

import javax.validation.Configuration;
import javax.validation.ValidatorFactory;
import javax.validation.spi.BootstrapState;
import javax.validation.spi.ConfigurationState;
import javax.validation.spi.ValidationProvider;

/**
 * Created by yann on 2016/12/16.
 */
public class PreventerValidationProvider implements ValidationProvider<PreventerConfiguration> {
    @Override
    public PreventerConfiguration createSpecializedConfiguration(BootstrapState state) {
        return null;
    }

    @Override
    public Configuration<?> createGenericConfiguration(BootstrapState state) {
        return null;
    }

    @Override
    public ValidatorFactory buildValidatorFactory(ConfigurationState configurationState) {
        return null;
    }
}
