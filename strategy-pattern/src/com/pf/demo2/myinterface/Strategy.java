package com.pf.demo2.myinterface;

/**
 * 
 * @author PF
 *
 */
public interface Strategy {
	
	/**
	 * 校验的方法
	 * @param param 传入的参数
	 * @return
	 */
	public boolean check(String param);
	
	/**
	 * 执行的操作
	 */
	public int doOperation(int num1,int num2);

}
