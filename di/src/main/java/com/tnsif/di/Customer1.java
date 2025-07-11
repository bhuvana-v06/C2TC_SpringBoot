package com.tnsif.di;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;


@Component
@Scope(value="prototype")
public class Customer1 {
	
	private String cname;
	private int cid;
	
	public Customer1() {
		System.out.println("customer1 has been called");
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	void show() {
		System.out.println("THis is from customer1");
	}

}
