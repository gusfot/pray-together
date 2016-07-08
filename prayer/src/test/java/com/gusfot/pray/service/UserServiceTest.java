package com.gusfot.pray.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gusfot.pray.model.User;
import com.gusfot.pray.service.UserService;

public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testRegist() {
		User user = new User();
		boolean result = userService.regist(user );
		
		assertTrue(result);
	}
	
	@Test
	public void testModify() {
		User user = new User();
		boolean result = userService.modify(user );
		
		assertTrue(result);
	}
	
	@Test
	public void testRemove() {
		
		Integer userId = null;
		boolean result = userService.remove(userId );
		
		assertTrue(result);
	}
	
	@Test
	public void testGet() {
		
		Integer userId = null;
		User result = userService.get(userId );
		
		assertTrue(result != null);
	}
	
	@Test
	public void testGetList() {
		
		Integer prayId = null;
		List<User> result = userService.getList( );
		
		assertTrue(result != null);
	}
	
	
}
