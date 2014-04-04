package com.redblitzkrieg.contactmanager.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.redblitzkrieg.contactmanager.domain.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(contact);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Contact> listContact() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

	@Override
	public void removeContact(Integer id) {
		// TODO Auto-generated method stub
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}
	}

}
