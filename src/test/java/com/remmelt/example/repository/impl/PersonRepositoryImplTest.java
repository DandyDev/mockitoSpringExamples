package com.remmelt.example.repository.impl;


import com.external.database.DatabaseAccess;
import org.junit.Assert;
import org.junit.Test;

import com.remmelt.example.model.Person;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Exercise 1
 * Implement the test in this class using Mockito.
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonRepositoryImplTest {

    @InjectMocks
	private PersonRepositoryImpl personRepository;

    @Mock
    private DatabaseAccess databaseAccess;

	@Test
	public void testThatWhenSavePersonIsCalledItCallsDatabaseAccessSavePerson() {
		personRepository.savePerson(new Person(1, "name", "email"));
        Mockito.verify(databaseAccess).savePerson(Mockito.any(Person.class));
	}

}
