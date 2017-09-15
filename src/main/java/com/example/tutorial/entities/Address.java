package com.example.tutorial.entities;

import org.apache.tapestry5.beaneditor.Validate;

import com.example.tutorial.data.Honorific;

public class Address 
{
	public Honorific honorific; 
	@Validate("required")
	public String firstName;
	@Validate("required")
	public String lastname;
	@Validate("required")
	public String street1;
	public String street2;
	@Validate("required")
	public String city;
	@Validate("required")
	public String state;
	@Validate("required,regexp=^\\d{5}(-\\d{4})?$")
	public String zip;
	public String email;
	public String phone;
}
