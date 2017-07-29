package com.blog.anla.State;
/**
 * 中午状态
 * @author U-ANLA
 *
 */
public class NoonState extends State{

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 13){
			System.out.println("当前时间："+w.getHour()+"午饭，午休");
		}else{
			w.setCurrent(new AfternoonState());
			w.writeProgram();
		}
	}
	
}
