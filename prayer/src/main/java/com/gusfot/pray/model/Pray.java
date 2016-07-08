package com.gusfot.pray.model;

import java.util.Date;

public class Pray {
	
	/**
	 * 기도 ID
	 */
	private Integer proayId;
	
	/**
	 * 기도 제
	 */
	private String title;
	
	/**
	 * 기도 내용 
	 */
	private String content;
	
	/**
	 * 등록시간 
	 */
	private Date regTime;
	
	/**
	 * 기도등록자Id 
	 */
	private Integer userId;
	
	/**
	 * 목표날짜 
	 */
	private Date targetDate;
	
	/**
	 * 성취여부 
	 */
	private boolean isAchieved;
	
	/**
	 * 기도가 응답된 시간 
	 */
	private Date achievedTime;
}
