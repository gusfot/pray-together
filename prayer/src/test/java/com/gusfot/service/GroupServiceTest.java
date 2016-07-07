package com.gusfot.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gusfot.model.Group;
import com.gusfot.model.Pray;
import com.gusfot.model.User;

public class GroupServiceTest {

	@Autowired
	GroupService groupService;
	private Object user;
	
	@Test
	public void testRegist() {
		Group group = new Group();
		boolean result = groupService.regist(group );
		
		assertTrue(result);
	}
	
	@Test
	public void testModify() {
		Group group = new Group();
		boolean result = groupService.modify(group );
		
		assertTrue(result);
	}
	
	@Test
	public void testRemove() {
		
		Integer groupId = null;
		boolean result = groupService.remove(groupId );
		
		assertTrue(result);
	}
	
	@Test
	public void testGet() {
		
		Integer groupId = null;
		Group result = groupService.get(groupId );
		
		assertTrue(result != null);
	}
	
	@Test
	public void testGetList() {
		
		Integer groupd = null;
		List<Group> result = groupService.getList( );
		
		assertTrue(result != null);
	}
	
	@Test
	public void testAddUser() {
		User user = new User();
		boolean result = groupService.addUser(user);
		
		assertTrue(result);
	}
	
	@Test
	public void testAddUserList() {
		List<User> userList = new ArrayList<>();
		boolean result = groupService.addUserList(userList);
		
		assertTrue(result);
	}
	
	@Test
	public void testAddPray() {
		Pray pray = new Pray();
		boolean result = groupService.addPray(pray);
		
		assertTrue(result);
	}
	
	
}
