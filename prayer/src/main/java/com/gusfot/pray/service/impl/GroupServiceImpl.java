package com.gusfot.pray.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gusfot.pray.model.Group;
import com.gusfot.pray.model.Pray;
import com.gusfot.pray.model.User;
import com.gusfot.pray.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Override
	public boolean regist(Group group) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify(Group group) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Integer groupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Group get(Integer groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUserList(List<User> userList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPray(Pray pray) {
		// TODO Auto-generated method stub
		return false;
	}

}
