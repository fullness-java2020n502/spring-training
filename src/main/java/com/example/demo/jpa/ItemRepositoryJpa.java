package com.example.demo.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.ItemRepository;
import com.example.demo.mybatis.Item;
@Repository
public class ItemRepositoryJpa implements ItemRepository{

	@Override
	public List<Item> findAll() {
		// TODO JPAでのDBアクセス処理
		return null;
	}

}
