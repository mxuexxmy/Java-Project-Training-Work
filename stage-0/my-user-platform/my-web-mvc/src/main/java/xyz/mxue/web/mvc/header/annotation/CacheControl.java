package xyz.mxue.web.mvc.header.annotation;

import java.lang.annotation.*;

/**
 * @author mxuexxmy
 * @date 3/3/2021$ 6:53 PM$
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheControl {
}
