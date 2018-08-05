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
	  res.addHeader("Access-Control-Allow-Origin","http://localhost:8081");
	  res.addHeader("Access-Control-Allow-Methods","GET");
	  arg2.doFilter(arg0,arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
