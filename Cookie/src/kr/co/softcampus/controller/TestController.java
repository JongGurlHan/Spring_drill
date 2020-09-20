package kr.co.softcampus.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/save_cookie")
	public String save_cookie(HttpServletResponse response) {
		
		try {
			String data1 = URLEncoder.encode("문자열1", "UTF-8");
			String data2 = URLEncoder.encode("문자열2", "UTF-8");
			
			Cookie cookie1 = new Cookie("cookie1", data1);
			Cookie cookie2 = new Cookie("cookie2", data2);
			
			cookie1.setMaxAge(365 * 24 * 60* 60);
			cookie2.setMaxAge(365 * 24 * 60* 60);
		
			//브라우저에 보낼 응답결과가 데이터에 담기고 응답결과가 브라우저에 전달됨
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "save_cookie";
	}

	@GetMapping("/load_cookie")
	public String load_cookie() {
		return "load_cookie";
	}

	@GetMapping("/load_cookie2")
	public String load_cookie2(@CookieValue("cookie1") String cookie1,
							   @CookieValue("cookie2") String cookie2) {
		
		System.out.printf("coookie1 : %s\n", cookie1);
		System.out.printf("coookie2 : %s\n", cookie2);
		
		return "load_cookie2";
	}
}
