package com.blog.anla.State;

/**
 * 工作类，此时没有了过长的分支判断语句。
 * @author U-ANLA
 *
 */
public class Work {
	private State current;
	
	public Work(){
		current = new ForenoonState();
	}
	
	private double hour;
	private boolean finish = false;

	public State getCurrent() {
		return current;
	}
	public void setCurrent(State current) {
		this.current = current;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void writeProgram(){
		current.writeProgram(this);
	}
	
}
