package Assignment4;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {
	public static void main(String[] args) {
		List<Integer>slist=Arrays.asList(34,65,87,78,98);
		Integer j= slist.stream().max(Integer::compare).get();
		System.out.println("max number of list is "+j);
	}

}
