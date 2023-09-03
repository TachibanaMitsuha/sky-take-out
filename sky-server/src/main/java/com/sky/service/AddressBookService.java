package com.sky.service;

import com.sky.entity.AddressBook;

import java.util.List;

/**
 * @author makise
 * @version 1.0
 */
public interface AddressBookService {
    List<AddressBook> list(AddressBook addressBook);

    void save(AddressBook addressBook);

    AddressBook getById(Long id);

    void update(AddressBook addressBook);

    void setDefault(AddressBook addressBook);

    void deleteById(Long id);
}
