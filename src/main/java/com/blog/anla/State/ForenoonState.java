package com.blog.anla.State;
/**
 * 上午和中午抽象类
 * @author U-ANLA
 *
 */
public class ForenoonState extends State{

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 12){
			System.out.println("当前时间： "+w.getHour()+"点，上午工作");
		}else{
			w.setCurrent(new NoonState());
			w.writeProgram();
		}
	}

}
