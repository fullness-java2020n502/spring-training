package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring Bootの実行起点を表すアノテーション
@SpringBootApplication
public class Application {
	// mainメソッドを実装する
	public static void main(String[] args) {
		// spring bootの起動
		SpringApplication.run(Application.class, args);
		//System.out.print("hello");
	}

}
