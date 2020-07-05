/**
 * 
 */
package com.likki.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.likki.bank.restcontroller.LoginRestController;

/**
 * @author KV
 *
 */
@SpringBootTest
public class SmokeTest {

	@Autowired
	LoginRestController loginResrController;
	
	@Test
	public void contexLoads() throws Exception {
		assertThat(loginResrController).isNotNull();
	}
}
