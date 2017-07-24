package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.ssh.ssh;

@Controller
@RequestMapping(value="/q")
public class ThisController {

	ssh SSH=new ssh();

	@RequestMapping(value = "/qq")
	public String  delete(@RequestParam(value = "para") String para){
		String ip="192.168.1.254";
		String username="root";
		String pwd="1234";
		int port=22;
		String cmd="sleep 20;ls;";
		SSH.exec(ip,username,pwd,port,cmd);
		
		return "redirect:/user/userList";
	}
	
	
	
	
	
	
	
}
