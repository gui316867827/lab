package com.ailabs.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ailabs.springboot.pojo.Book;

/**
 * 继承JpaRepository执行常用持久化操作方法
 */
public interface BookRepository extends JpaRepository<Book, Long>{
	List<Book> findByName(String name);
}
