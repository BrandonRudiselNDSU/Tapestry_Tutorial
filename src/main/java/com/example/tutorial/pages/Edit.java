package com.example.tutorial.pages;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.example.tutorial.entities.Address;

public class Edit {
	@Inject
	private Session session;
	
	public List<Address> getAddresses() {
		return session.createCriteria(Address.class).list();
	}
	
	public void setAddresses() {
		System.out.println("asd;lfkjads;lfkjasd;lfjas;ldfjl;asdjf");
	}
}
