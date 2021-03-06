package com.gusfot.pray.service;

import java.util.List;

import com.gusfot.pray.model.User;

public interface UserService {

	boolean regist(User user);

	boolean modify(User user);

	boolean remove(Integer userId);

	User get(Integer userId);

	List<User> getList();

}
