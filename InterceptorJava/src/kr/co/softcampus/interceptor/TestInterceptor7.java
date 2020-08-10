package kr.co.softcampus.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor7 implements HandlerInterceptor{

	// Controller의 메서드가 호출되기전에 호출됨.
	//false를 반환하면 요청 처리에 대한 진행이 중단된다. 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("TestIncetceptor7 - preHandle");
		return true;
	}
	
	// Controller의 메서드가 호출되고 난 후  호출됨.
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("TestIncetceptor7 - postHandle");
	}
	
	// view처리까지 완료되면  호출됨.
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		 System.out.println("TestIncetceptor7 - afterCompletion");
	}
	
	
}
