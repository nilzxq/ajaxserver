package com.example;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/postJson")
	public ResultBean postJson(@RequestBody User user) {
		System.out.println("TestController.postJson()");
		return new ResultBean("postJson "+user.getName());
	}
	
	@GetMapping("/getCookie")
	public ResultBean getCookie(@CookieValue(value="cookie1") String cookie1) {
		System.err.println("TestController.getCookie()");
		return new ResultBean("getCookie "+cookie1);
	}
}
