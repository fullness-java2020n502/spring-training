package com.example.demo.mybatis;

import lombok.Data;

@Data
public class Item {
	private Integer id;
	private String name;
	private Integer price;
	private Integer categoryId;
}
