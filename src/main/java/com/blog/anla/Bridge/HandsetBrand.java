package com.blog.anla.Bridge;
/**
 * 手机品牌抽象类
 * @author U-ANLA
 *
 */
public abstract class HandsetBrand {
	protected HandsetSoft soft;
	
	public void setHandsetSoft(HandsetSoft soft){
		this.soft = soft;
	}
	
	public abstract void Run();
}
