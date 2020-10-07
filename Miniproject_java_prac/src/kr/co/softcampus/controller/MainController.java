package kr.co.softcampus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.ContentBean;
import kr.co.softcampus.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@GetMapping("/main")
	public String main() {
		
		ArrayList<List<ContentBean>> list = new ArrayList<List<ContentBean>>();
		List<ContentBean>list1 = mainService.getMainList(1);
		
		
		
		return "main";
	}
}
