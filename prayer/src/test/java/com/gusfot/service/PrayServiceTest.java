package com.gusfot.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gusfot.pray.model.Pray;
import com.gusfot.pray.service.PrayService;

public class PrayServiceTest {

	@Autowired
	private PrayService prayService;
	
	@Test
	public void testRegist() {
		Pray pray = new Pray();
		boolean result = prayService.regist(pray );
		
		assertTrue(result);
	}
	
	@Test
	public void testModify() {
		Pray pray = new Pray();
		boolean result = prayService.modify(pray );
		
		assertTrue(result);
	}
	
	@Test
	public void testRemove() {
		
		Integer prayId = null;
		boolean result = prayService.remove(prayId );
		
		assertTrue(result);
	}
	
	@Test
	public void testGet() {
		
		Integer prayId = null;
		Pray result = prayService.get(prayId );
		
		assertTrue(result != null);
	}
	
	@Test
	public void testGetList() {
		
		Integer prayId = null;
		List<Pray> result = prayService.getList( );
		
		assertTrue(result != null);
	}
}
