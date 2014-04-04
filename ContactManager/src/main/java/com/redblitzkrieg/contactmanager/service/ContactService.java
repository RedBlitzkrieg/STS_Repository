package com.redblitzkrieg.contactmanager.service;

import java.util.List;

import com.redblitzkrieg.contactmanager.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);
	
	public List<Contact> listContact();
	
	public void removeContact(Integer id);
}
