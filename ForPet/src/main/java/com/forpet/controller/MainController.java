package com.forpet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forpet.model.vo.Vet;
import com.forpet.service.VetService;




@Controller
public class MainController {

	@Autowired
	private VetService service;
	
	List <Vet> vlist = new ArrayList();
	
	
	@RequestMapping("/main")
	public String mainPage() {
		return "main";
	}
	
	@RequestMapping("/main/defaultSection")
	public String defaultSection() {
		return "defaultSection";
	}
	
	@RequestMapping("/main/noticeAndEvent")
	public String noticeAndEvent() {
		return "notice/noticeAndEvent";
	}
	
	@RequestMapping("/main/search")
	public String searchpage(Model model)
	{
	
		List<Vet> list = service.VetList();
		model.addAttribute("list",list);
		//vlist ������
		System.out.println("mainClist"+list);
		return "/search/search";
	}
	
	@RequestMapping("/main/memberEnroll")
	public String memberEnroll() {
		return "member/memberEnroll";
	}
}
