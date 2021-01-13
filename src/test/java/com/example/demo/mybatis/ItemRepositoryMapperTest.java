package com.example.demo.mybatis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ItemRepositoryMapperTest {
	//@Qualifier("itemRepositoryMybatis")
	@Autowired
	ItemRepositoryMapper repo;

	@Test
	void testFindAll() {
		for (Item i  : repo.findAll()) {
			System.out.println(i);
		}
	}
	@Test
	void testInsert() {
		Item item = new Item();
		item.setName("ボールペン");
		item.setPrice(120);
		item.setCategoryId(1);
		repo.insert(item);
		repo.findAll().forEach(System.out::println);
	}
}
