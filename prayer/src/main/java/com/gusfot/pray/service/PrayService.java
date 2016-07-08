package com.gusfot.pray.service;

import java.util.List;

import com.gusfot.pray.model.Pray;

/**
 * 기도 Service
 * @author gusfot
 *
 */
public interface PrayService {
	
	/**
	 * 기도를 등록한다. 
	 * @param pray
	 * @return
	 */
	boolean regist(Pray pray);
	
	/**
	 * 기도목록을 조회한다.
	 * @return
	 */
	List<Pray> getList();
	
	/**
	 * 기도 단건을 조회한다.
	 * @param prayId
	 * @return
	 */
	Pray get(Integer prayId);
	
	/**
	 * 기도를 수정한다.
	 * @param pray
	 * @return
	 */
	boolean modify(Pray pray);
	
	/**
	 * 기도를 등록한다.
	 * @param prayId
	 * @return
	 */
	boolean remove(Integer prayId);
	
	
}
