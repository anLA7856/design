package com.blog.anla.State;
/**
 * 睡觉状态
 * @author U-ANLA
 *
 */
public class SleepingState extends State{

	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间"+w.getHour()+"点，睡觉了！");
	}
	
}
