package xyz.mxue.configuration.microprofile.config.converter;

/**
 * @author mxuexxmy
 */
public class ShortConverter extends AbstractConverter<Short> {
    @Override
    protected Short doConvert(String value) {
        return Short.valueOf(value);
    }
}
