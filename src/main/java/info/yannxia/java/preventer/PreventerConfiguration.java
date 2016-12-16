package info.yannxia.java.preventer;

import javax.validation.*;
import java.io.InputStream;

/**
 * Created by yann on 2016/12/16.
 */
public class PreventerConfiguration implements Configuration<PreventerConfiguration> {
    @Override
    public PreventerConfiguration ignoreXmlConfiguration() {
        return null;
    }

    @Override
    public PreventerConfiguration messageInterpolator(MessageInterpolator interpolator) {
        return null;
    }

    @Override
    public PreventerConfiguration traversableResolver(TraversableResolver resolver) {
        return null;
    }

    @Override
    public PreventerConfiguration constraintValidatorFactory(ConstraintValidatorFactory constraintValidatorFactory) {
        return null;
    }

    @Override
    public PreventerConfiguration parameterNameProvider(ParameterNameProvider parameterNameProvider) {
        return null;
    }

    @Override
    public PreventerConfiguration addMapping(InputStream stream) {
        return null;
    }

    @Override
    public PreventerConfiguration addProperty(String name, String value) {
        return null;
    }

    @Override
    public MessageInterpolator getDefaultMessageInterpolator() {
        return null;
    }

    @Override
    public TraversableResolver getDefaultTraversableResolver() {
        return null;
    }

    @Override
    public ConstraintValidatorFactory getDefaultConstraintValidatorFactory() {
        return null;
    }

    @Override
    public ParameterNameProvider getDefaultParameterNameProvider() {
        return null;
    }

    @Override
    public BootstrapConfiguration getBootstrapConfiguration() {
        return null;
    }

    @Override
    public ValidatorFactory buildValidatorFactory() {
        return null;
    }
}
