package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mybatis.ItemRepositoryMapper;

@Controller
@RequestMapping("home") // 「http://localhost:8080/home」のリクエストを受け取る
public class HomeController {

	@Autowired
	ItemRepositoryMapper mapper;

	@GetMapping // http://localhost:8080/home GET
	public String home(Model model) {
		model.addAttribute("message", "こんにちは！");
		model.addAttribute("itemList", mapper.findAll());
		return "home"; // viewのテンプレートを指定しています
	}
	@GetMapping("get") // http://localhost:8080/home/get GET
	public String get() {
		return "get";
	}
	@PostMapping("post") // http://localhost:8080/home/post POST
	public String post(@RequestParam String val1) {
		System.out.println("val1:"+val1);
		return "post";
	}
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:http://www.google.co.jp";
	}
}
