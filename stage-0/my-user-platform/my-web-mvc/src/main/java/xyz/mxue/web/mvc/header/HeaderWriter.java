package xyz.mxue.web.mvc.header;

import java.lang.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * @author mxuexxmy
 */
public interface HeaderWriter {

    void writer(Map<String, List<String >> headers, String... headerValues);
}
