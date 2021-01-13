package com.example.demo.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * Mapperインターフェース
 */
@Mapper // ①
public interface ItemRepositoryMapper {
	// ②全件取得用の抽象メソッド
	//@Select("select id,name,price,category_id as categoryId from item") // ③
	List<Item> findAll();
	void insert(Item item);// 1件追加
}
