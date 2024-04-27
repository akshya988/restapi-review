package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
    @Id
    private int bookid;
    private String bookName;
    private String author;
    private String published_date;

    
    
	
	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}




	public String getBookName() {
		return bookName;
	}




	public void setBookName(String bookName) {
		this.bookName = bookName;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public String getPublished_date() {
		return published_date;
	}




	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}




	public Login() {
    }
}
    
