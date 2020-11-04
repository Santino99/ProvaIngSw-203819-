package it.unical.ProvaIntermedia;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil list;
	
	@BeforeClass
	public static void prepare() {
		list = new MyListUtil();
	}
	
	@Before
	public void init() {
		System.out.println("init test");
	}
	
	@Test
	public void ordineCrescenteWorks() {
		List<Integer> array = Arrays.asList(3,4,2,5,1,6);
		assertEquals(Arrays.asList(1,2,3,4,5,6), list.ordineCrescente(array));
	}
	
	@Test
	public void ordineDecrescenteWorks() {
		List<Integer> array = Arrays.asList(3,4,2,5,1,6);
		assertEquals(Arrays.asList(6,5,4,3,2,1), list.ordineDecrescente(array));
	}
}
