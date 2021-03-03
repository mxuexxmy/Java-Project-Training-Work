package xyz.mxue.web.mvc.header;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author mxuexxmy
 */
public class CacheControlHeaderWriter implements HeaderWriter{
    @Override
    public void writer(Map<String, List<String>> headers, String... headerValues) {
        headers.put("cache-control", Arrays.asList(headerValues));
    }
}
