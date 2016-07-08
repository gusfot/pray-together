package com.gusfot.pray.model;

import java.util.Date;
import java.util.List;

public class Group {
	
	/**
	 * 기도방ID 
	 */
	private Integer groupId;
	
	/**
	 * 기도방이름 
	 */
	private String name;
	
	/**
	 * 기도방 참여자목록 
	 */
	private List<User> userList;
	
	/**
	 * 기도방 등록시간 
	 */
	private Date regTime;
	
	/**
	 * 기도방의 기도목록 
	 */
	private List<Pray> prayList;
}
