package com.example;
/** 
* @author zxq
* @version date：2018年7月16日 下午9:46:41 
* 类说明 
*/
public class ResultBean {
	
	private String data;

	public ResultBean(String data) {
		this.setData(data);
	}

	
	public String getData() {
		return data;
	}

	private void setData(String data) {
		this.data=data;
	}

}
