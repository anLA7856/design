package com.blog.anla.Adapter;
/**
 * 客户端类
 * 对客户端来说，调用的是target的reqeust()方法
 * @author U-ANLA
 *
 */
public class User {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
