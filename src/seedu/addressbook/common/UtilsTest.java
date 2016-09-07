package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	//Method should return false if any object is not null
	@Test
	public void testIsAnyNull_NonNullObject(){
		String s =  "";
		boolean testResult = Utils.isAnyNull(s);
		assertFalse(testResult);
	}
	
	//Method should return true if one object is null
	@Test
	public void testIsAnyNull_NullObject(){
		String s = null;
		boolean testResult = Utils.isAnyNull(s);
		assertTrue(testResult);
	}
	

	@Test
	public void testIsAnyNull_SomeNull(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		Object nullObj = null;
		boolean testResult = Utils.isAnyNull(list,nullObj);
		assertTrue(testResult);
	}

	//Method should return true if elements are not unique
	@Test
	public void testElementsAreUnique_AllUnique() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		boolean testResult = Utils.elementsAreUnique(list);
		assertTrue(testResult);
	}
	
	//Method should return false if elements are unique
	@Test
	public void testElementsAreUnique_AllNotUnique(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		boolean testResult = Utils.elementsAreUnique(list);
		assertFalse(testResult);
	}
}
