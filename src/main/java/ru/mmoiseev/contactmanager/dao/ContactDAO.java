package ru.mmoiseev.contactmanager.dao;


import ru.mmoiseev.contactmanager.domain.Contact;

import java.util.List;

public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
