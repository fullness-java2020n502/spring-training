package com.example.demo.sample;

// 呼び出す側のクラス
public class Driver {
	public void doTask() {
		Hoge hoge = new Hoge("高橋");// 蜜結合な状態（疎結合じゃない）
	}
}
