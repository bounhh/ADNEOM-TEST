package fr.adneom;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PartitionUtilsTest {
	
	@Test
	public void partitionTest_NormalCase() {
		
		List<Integer> entryList = Arrays.asList(1, 2, 3, 4, 5);
		
		List<List<Integer>> expectedList = PartitionUtils.partition(entryList, 2);
		
		assertTrue(expectedList.size() == 3);		
	}
	
	@Test
	public void partitionTest_WheneEmptyList() {
		
		List<Integer> entryList = Collections.emptyList();
		
		List<List<Integer>> expectedList = PartitionUtils.partition(entryList, 2);
		
		assertTrue(expectedList.size() == 1);		
	}

}
