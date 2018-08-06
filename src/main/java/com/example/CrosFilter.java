package com.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
* @author zxq
* @version date：2018年8月5日 下午7:23:35 
* 类说明 
*/
public class CrosFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

	  HttpServletResponse res=(HttpServletResponse) arg1;
	  HttpServletRequest req=(HttpServletRequest)arg0;
	  
	  String origin=req.getHeader("Origin");
	  
	  if(!org.springframework.util.StringUtils.isEmpty(origin)) {
		  //带cookie的时候，origin必须是全匹配，不能使用*
		  res.addHeader("Access-Control-Allow-Origin",origin);
	  }
	  //带cookie的时候，origin必须是全匹配，不能使用*
	 // res.addHeader("Access-Control-Allow-Origin","http://localhost:8081");
	  res.addHeader("Access-Control-Allow-Methods","*");
	  
	  String headers=req.getHeader("Access-Control-Request-Headers");
	  //支持所有自定义头
	  if(!org.springframework.util.StringUtils.isEmpty(headers)) {
		  
		 // res.addHeader("Access-Control-Allow-Headers","Content-type,x-header1,x-header2");
		  res.addHeader("Access-Control-Allow-Headers",headers);
	  }
	 
	  res.addHeader("Access-Control-Max-Age","3600");
	  //enable cookie
	  res.addHeader("Access-Control-Allow-Credentials","true");
	 
	  arg2.doFilter(arg0,arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
