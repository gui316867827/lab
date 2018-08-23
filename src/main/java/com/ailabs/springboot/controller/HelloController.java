package com.ailabs.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ailabs.springboot.dao.BookRepository;
import com.ailabs.springboot.pojo.Book;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "您好";
	}
	
	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping("/readingList")
	public String readersBooks(@PathVariable("name") String name, Model moder){
		List<Book> findByName = bookRepository.findByName(name);
		moder.addAttribute("books", findByName);
		return "findByName";//返回视图名
	}
}
