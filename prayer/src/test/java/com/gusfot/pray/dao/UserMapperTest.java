package com.gusfot.pray.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gusfot.pray.model.User;
import com.gusfot.pray.model.UserExample;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {// "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml" })
public class UserMapperTest {

	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testSelectByPrimaryKey() {
		Integer userId = 1;
		User user = userMapper.selectByPrimaryKey(userId );
	
		assertTrue(userId == user.getUserId());
	}
	
	@Test
	public void testInsertSelective() {
		User record = new User();
		int result = userMapper.insertSelective(record );
		assertTrue(result == 1);
	}
	
	@Test
	public void testUpdateByPrimaryKeySelective() {
		User record = new User();
		int result = userMapper.updateByPrimaryKeySelective(record);
		assertTrue(result == 1);
	}
	
	@Test
	public void testUpdateByPrimaryKeySelective1() {
		UserExample example = new UserExample();
		List<User> result = userMapper.selectByExample(example );
		assertTrue(result != null);
	}
}
