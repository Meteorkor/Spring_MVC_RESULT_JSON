package com.meteor.model;


/*
 * JSON 을 출력하는데 MODEL이 되는 클래스 
 * 
*/
public class Book {

	String name;
	int pages;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	
	
	public Book(String book_name , int book_page){
		this.name = book_name;
		this.pages = book_page;
	}

	
	
	
}
