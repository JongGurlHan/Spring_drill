package kr.co.softcampus.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {

	@GetMapping("/input_data")
	public String input_data() {	
		
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(@Valid DataBean1 dataBean1, BindingResult result) {			

	System.out.printf("data1 : %s\n", dataBean1.getData1());
	System.out.printf("data : %s\n", dataBean1.getData2());

//	System.out.printf("BindingResult : %s\n", result);
	//유효성 검사에서 위반된 부분이 있다면	
	if(result.hasErrors()) {
		//유효성 위반 결과를 모두 가져온다. 
		for(ObjectError obj : result.getAllErrors()) {
			System.out.printf("메시지 : %s\n", obj.getDefaultMessage());
			System.out.printf("code : %s\n", obj.getCode());
			System.out.printf("object name : %s\n", obj.getObjectName());
			System.out.println("-------------------------------------");
		}
	}	
	return "input_success";
	}
	
	
}
