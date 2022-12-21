package com.baeldung.boot.jsp.repository.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.boot.jsp.repository.BookRepository;
import com.baeldung.boot.jsp.repository.model.BookData;

@SpringBootTest
class DbJPABookRepositoryTest {
	
	@Autowired
	BookRepository bookRepository;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//bookRepository = new DbJPABookRepository();
	}

	@AfterEach
	void tearDown() throws Exception {
		//bookRepository = null;
	}
	
	@Test
	void findAll() {
		System.out.println("todos= "+ bookRepository.findAll());
		assertEquals(4, bookRepository.findAll().size());
	}

	@Test
	void testFindById() {
		System.out.println("findByID= "+ bookRepository.findById("9788467053302"));
		assertEquals("Cómo hacer que te pasen cosas buenas", bookRepository.findById("9788467053302").get().getName());
	}
	
	@Test
	void testAdd() {
		BookData mybook= new BookData("9788467053303", "Cómo hacer que te pasen cosas buenas","Marian Rojas Bustape");
		BookData savedBook = bookRepository.add(mybook);
		assertEquals("Marian Rojas Bustape", savedBook.getAuthor());
	}
	

}
