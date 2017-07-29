package com.blog.anla.State;
/**
 * 晚上状态
 * @author U-ANLA
 *
 */
public class EveningState extends State{
	@Override
	public void writeProgram(Work w) {
		if(w.isFinish()){
			w.setCurrent(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour() < 21){
				System.out.println("当前时间："+w.getHour()+"加班好累");
			}else{
				w.setCurrent(new SleepingState());
				w.writeProgram();
			}
		}
	}
	
}
