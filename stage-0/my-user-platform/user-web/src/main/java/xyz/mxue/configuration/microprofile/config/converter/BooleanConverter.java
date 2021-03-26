package xyz.mxue.configuration.microprofile.config.converter;

/**
 * @author mxuexxmy
 */
public class BooleanConverter extends AbstractConverter<Boolean>{
    @Override
    protected Boolean doConvert(String value) {
        return Boolean.parseBoolean(value);
    }
}
