package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exercise03")
public class Exercise03Controller {
	/**
	 * フォーム画面表示用のハンドラメソッド
	 */
	@GetMapping
	public String form() {
		return "exercise03/enter";
	}

	@PostMapping
	public String result(ValueForm form) {
		System.out.println("form:"+form);
		return "exercise03/result";
	}
//	@PostMapping
//	public String register(ValueForm form) {
//		return "exercise03/register";
//	}
}
