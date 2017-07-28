package com.blog.anla.Proxy;
/**
 * subject类，定义了realsubject和proxy的共用接口，
 * 这样就能在任何使用realsubject的地方都可以使用proxy
 * @author U-ANLA
 *
 */
public abstract class Subject {
	public abstract void request();
}
