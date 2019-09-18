package com.demo.eduardo.demo5.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.demo.eduardo.demo5.entity.SomeUser;

@Repository			// From Spring, indicates something which interacts with the database.
@Transactional		// Opens and closes the transactions automatically.
public class UserDaoService {

	
	@PersistenceContext		// EntityManager is just an interface to use the PersistenceContext. This annotation autowires the EntityManager
	private EntityManager entityManager;
	
	
	public long insert(SomeUser someUser) {
		entityManager.persist(someUser);	// Now the someUser user is managed by the EntityManager and tracked by the PersistenceContext.
		return someUser.getId();
	}
	
	
}
