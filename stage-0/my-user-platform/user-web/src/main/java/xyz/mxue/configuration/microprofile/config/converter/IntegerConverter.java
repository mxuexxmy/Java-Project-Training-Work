package xyz.mxue.configuration.microprofile.config.converter;

/**
 * @author mxuexxmy
 */
public class IntegerConverter extends AbstractConverter<Integer>{

    @Override
    protected Integer doConvert(String value) {
        return Integer.valueOf(value);
    }
}
