package kr.co.softcampus.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softcampus.beans.DataBean;

//@RestController같은경우, return 하는 값 자체가 응답경과가 된다. 
@RestController
public class RestTestController {
	
	//list내부안에 있는 객체들의 구조를 파악해서 json문서로 만들어준다. 
	 @GetMapping("/test2")
	 public ResponseEntity<ArrayList<DataBean>> test2() {
		 
		 DataBean bean1 = new DataBean("문자열1", 100, 11.11, false);		 
		 DataBean bean2 = new DataBean("문자열2", 200, 22.22, true);		 
		 DataBean bean3 = new DataBean("문자열3", 300, 33.33, false);		 
		 
		 ArrayList<DataBean> list = new ArrayList<DataBean>();
		 list.add(bean1);
		 list.add(bean2);
		 list.add(bean3);
		 
		 // HttpStatus.OK: 브라우저로 "내가 보내는 응답결과가 정상적인 data야"라는것을 알려주기 위해서  
		 ResponseEntity<ArrayList<DataBean>> entry = new ResponseEntity<ArrayList<DataBean>>(list, HttpStatus.OK);
		 		
		 
		 return entry;
	 }
}








