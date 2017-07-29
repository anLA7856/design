package com.blog.anla.State;
/**
 * 下班状态
 * @author U-ANLA
 *
 */
public class RestState extends State{
	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间"+w.getHour()+"，下班回家！");
	}

}
