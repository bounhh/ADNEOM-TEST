package fr.adneom;
import java.util.*;

public class PartitionUtils {

    public static List<List<Integer>> partition(List<Integer> entryList, Integer size){    	
    	
    	List<List<Integer>> result = new ArrayList<>();
    	
    	if(size > entryList.size() || entryList.size() == 0) {
    		result.add(entryList);
    		return result;
    	}
    	
        for(int i=0; i<entryList.size(); i = i + size) {
        	if( i+ size > entryList.size()) {        		
        		result.add(entryList.subList(i, entryList.size()));
        		break;
        	}

        	result.add(entryList.subList(i, i + size));
        	
        }

        return result;
    }
}
