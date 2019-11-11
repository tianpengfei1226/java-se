package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  PriorityValidRegion.java,v 1.0, 2019/1/28-18:07 tianpengfei Exp $
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PriorityValidRegion {
	ValidRegion value() default @ValidRegion;
}
