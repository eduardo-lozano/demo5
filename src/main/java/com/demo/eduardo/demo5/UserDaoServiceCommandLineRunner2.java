package com.demo.eduardo.demo5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.demo.eduardo.demo5.entity.SomeUser;
import com.demo.eduardo.demo5.service.SomeUserRepositoryInterface;

// We use an extension of the interface JpaRepository instead of using a UserDaoService.
@Component
public class UserDaoServiceCommandLineRunner2 implements CommandLineRunner {
	
	@Autowired
	private SomeUserRepositoryInterface someUserRepositoryInterface;
	
	// Logging stuff
	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner2.class);
	
	@Override
	public void run(String... args) throws Exception {
		SomeUser someUser = new SomeUser("Some other guy", "Not a developer");
		someUserRepositoryInterface.save(someUser);
		log.info("New user is created by extending JpaRepository interface: " +someUser);
	}
}
