package com.gusfot.pray.service;

import java.util.List;

import com.gusfot.pray.model.Group;
import com.gusfot.pray.model.Pray;
import com.gusfot.pray.model.User;

public interface GroupService {

	boolean regist(Group group);

	boolean modify(Group group);

	boolean remove(Integer groupId);

	Group get(Integer groupId);

	List<Group> getList();

	boolean addUserList(List<User> userList);

	boolean addUser(User user);

	boolean addPray(Pray pray);


}
