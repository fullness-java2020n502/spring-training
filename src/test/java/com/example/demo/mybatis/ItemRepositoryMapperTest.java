package com.example.demo.mybatis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.domain.ItemRepository;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ItemRepositoryMapperTest {

	@Qualifier("itemRepositoryJpa")
	@Autowired
	ItemRepository repo;

	@Test
	void testFindAll() {
		for (Item i  : repo.findAll()) {
			System.out.println(i);
		}
	}
}
