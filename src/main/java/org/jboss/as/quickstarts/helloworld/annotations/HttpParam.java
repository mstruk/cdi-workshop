package org.jboss.as.quickstarts.helloworld.annotations;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
* @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
*/
@Qualifier
@Target({TYPE, FIELD, METHOD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpParam {
    @Nonbinding String value() default "";
}
