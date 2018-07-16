package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author zxq
* @version date：2018年7月16日 下午9:42:56 
* 类说明 
*/
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/get1")
	private ResultBean get1() {
		System.out.println("TestController.get1()");
		return new ResultBean("get1 ok");
	}
}
