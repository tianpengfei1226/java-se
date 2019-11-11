package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  ValidRegion.java,v 1.0, 2019/1/28-17:42 tianpengfei Exp $
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidRegion {
	String name() default "";
	int order() default 0;
}
