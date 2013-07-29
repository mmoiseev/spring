package ru.mmoiseev.contactmanager.service;

import ru.mmoiseev.contactmanager.domain.Contact;

import java.util.List;

public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
