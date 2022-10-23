package com.shahbazyan.phonebook.repository;

import com.shahbazyan.phonebook.models.Contacts;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contacts, Long> {



}
