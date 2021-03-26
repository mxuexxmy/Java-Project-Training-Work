package xyz.mxue.configuration.microprofile.config.converter;

/**
 * @author mxuexxmy
 */
public class StringConverter extends AbstractConverter<String> {

    @Override
    protected String doConvert(String value) throws IllegalArgumentException, NullPointerException{
        return value;
    }
}
