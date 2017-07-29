package com.blog.anla.State;
/**
 * 下午状态
 * @author U-ANLA
 *
 */
public class AfternoonState extends State{
	@Override
	public void writeProgram(Work w) {
		if(w.getHour() > 17){
			System.out.println("当前时间"+w.getHour()+"点，继续加班");
		}else{
			w.setCurrent(new EveningState());
			w.writeProgram();
		}
	}
	
}
