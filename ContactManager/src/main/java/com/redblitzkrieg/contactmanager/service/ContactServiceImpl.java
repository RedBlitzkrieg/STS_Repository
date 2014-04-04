package com.redblitzkrieg.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.redblitzkrieg.contactmanager.dao.ContactDAO;
import com.redblitzkrieg.contactmanager.domain.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	@Transactional
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		contactDAO.addContact(contact);
	}

	@Override
	@Transactional
	public List<Contact> listContact() {
		// TODO Auto-generated method stub
		return contactDAO.listContact();
	}

	@Override
	@Transactional
	public void removeContact(Integer id) {
		// TODO Auto-generated method stub
		contactDAO.removeContact(id);
	}

}
