package com.baeldung.boot.jsp.repository.impl;

import java.beans.JavaBean;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Component;

import com.baeldung.boot.jsp.repository.BookRepository;
import com.baeldung.boot.jsp.repository.JpaFullRepository;
import com.baeldung.boot.jsp.repository.model.BookData;

@Component
public class DbJPABookRepository implements BookRepository {
	
	@Autowired
	private JpaFullRepository jpafr;

	@Override
	public Collection<BookData> findAll() {
		return jpafr.findAll();
	}

	@Override
	public Optional<BookData> findById(String isbn) {
		return jpafr.findById(isbn);
	}

	@Override
	public BookData add(BookData book) {
		return jpafr.save(book);
	}

	
}
