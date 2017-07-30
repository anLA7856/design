package com.blog.anla.Flyweight;
/**
 * 所有具体襄垣类的超类，通过这个接口，
 * Flyweight可以接受并作用于外部状态。
 * @author U-ANLA
 *
 */
public abstract class Flyweight {
	public abstract void operation(int extrinsicstate);
}
