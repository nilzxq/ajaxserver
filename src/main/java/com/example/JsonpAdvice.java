package com.example;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/** 
* @author zxq
* @version date：2018年7月17日 下午2:27:56 
* 类说明 
*/
@ControllerAdvice
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice{

	public JsonpAdvice() {
		super("callback");
	}
}
