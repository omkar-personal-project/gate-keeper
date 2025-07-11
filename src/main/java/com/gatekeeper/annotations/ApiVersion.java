package com.gatekeeper.annotations;

import java.lang.annotation.*;

/**
 * Annotation to mark controller or handler with an API version like 1 or 1.1.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiVersion {
    String value();
}
