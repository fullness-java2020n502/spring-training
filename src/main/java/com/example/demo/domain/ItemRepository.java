package com.example.demo.domain;

import java.util.List;

import com.example.demo.mybatis.Item;

/**
 * ビジネス視点のインターフェース *
 */
public interface ItemRepository {
	List<Item> findAll();
}
