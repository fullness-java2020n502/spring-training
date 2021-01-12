package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.di.Calculator;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// アプリケーション全体のインスタンス（コンテキスト）を変数に入れる
		ApplicationContext context = SpringApplication.run(Application.class, args);
		// コンテキストからApplicationクラスを呼び出しrunメソッドを実行
		context.getBean(Application.class).run();
	}
	//@Qualifier("subCalc")
	@Autowired
	Calculator calculator; // インターフェース依存にすることによりさまざまな箇所を
	// 「選択可能（プラッガブル）」にできる！！！！
	public void run() {
		System.out.println("計算結果:"+calculator.calc(10, 20));
	}
}
