package com.demo.eduardo.demo5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.demo.eduardo.demo5.entity.SomeUser;
import com.demo.eduardo.demo5.service.UserDaoService;

// Command line runner is something like the .profile in Linux (but for Spring), in the sense that
// it runs when the Spring application starts up. We'll use it to create a user and insert it in the DB.
@Component		// To get this managed by Spring
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private UserDaoService userDaoService;
	
	// Logging stuff
	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		SomeUser someUser = new SomeUser("Ed Lozano", "Developer");
		long newSomeUserId = userDaoService.insert(someUser);
		log.info("New user is created: " +someUser);
	}
}
