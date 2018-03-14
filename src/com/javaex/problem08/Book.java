package com.javaex.problem08;

public class Book {
    
   
	
	private int bookNo;
	private String title;
	private String author;
    private int stateCode;
 
   
   
   
	public Book(int bookNo,String title,String author) {
		
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
		
	}
	
	
	public void rent(int num) {
		
			stateCode=0;
			System.out.println(title+"이(가) 대여 됐습니다.");
	}
	
	
	public void print() {

		if(stateCode==1) {
			System.out.print("재고 있음");
			
		}
		else if(stateCode==0) {
			System.out.print("\"대여중\"");
		}
		
		
	}


	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}


}

