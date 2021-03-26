package xyz.mxue.configuration.microprofile.config.converter;

/**
 * @author mxuexxmy
 */
public class LongConverter extends AbstractConverter<Long>{

    @Override
    protected Long doConvert(String value) {
        return Long.valueOf(value);
    }
}
