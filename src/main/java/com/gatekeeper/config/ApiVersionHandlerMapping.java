package com.gatekeeper.config;

import com.gatekeeper.annotations.ApiVersion;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import java.lang.reflect.Method;

public class ApiVersionHandlerMapping extends RequestMappingHandlerMapping {

    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo mappingInfo = super.getMappingForMethod(method, handlerType);
        if (mappingInfo == null) return null;

        ApiVersion version = AnnotationUtils.findAnnotation(handlerType, ApiVersion.class);
        if (version == null) {
            version = AnnotationUtils.findAnnotation(method, ApiVersion.class);
        }

        if (version != null) {
            String versionPrefix = "/v" + version.value();  // converts 1.1 to /v1.1
            RequestMappingInfo versionInfo = RequestMappingInfo
                    .paths(versionPrefix)
                    .build();
            return versionInfo.combine(mappingInfo);
        }

        return mappingInfo;
    }
}
