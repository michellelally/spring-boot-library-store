package com.sales.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOANS")
public class Loan {
	@Id
	@GeneratedValue
	@Column(name="LID")
	private Long lid;
	
	@ManyToOne
	@JoinColumn(name="BID", unique=true)
	private Book book;

	@ManyToOne
	@JoinColumn(name="CID")
	private Customer cust;
	
	
	@Column(name="DUEDATE")
	private String dueDate;


	public Long getLid() {
		return lid;
	}


	public void setLid(Long lid) {
		this.lid = lid;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public Customer getCust() {
		return cust;
	}


	public void setCust(Customer cust) {
		this.cust = cust;
	}


	public String getDueDate() {
		return dueDate;
	}


	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}
