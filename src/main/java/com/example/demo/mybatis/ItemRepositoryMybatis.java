package com.example.demo.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ItemRepository;

@Repository
public class ItemRepositoryMybatis implements ItemRepository{
	@Autowired
	ItemRepositoryMapper mapper;
	public List<Item> findAll(){
		return mapper.findAll();
	}
}
