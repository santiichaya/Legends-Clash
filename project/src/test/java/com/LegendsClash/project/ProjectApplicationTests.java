package com.LegendsClash.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	void contextLoads() {
	}

	@Test
	void testPasswordHashing() {
		String rawPassword = "password123";
		String encoded = passwordEncoder.encode(rawPassword);

		assertNotEquals(rawPassword, encoded);
		assertTrue(passwordEncoder.matches(rawPassword, encoded));
	}
}