package Assignments2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMarks {
	public static void main(String[] args) {
		
		List<Integer>slist=Arrays.asList(34,87,87,78,78);
		List<Integer>DM=slist.stream().distinct().sorted().collect(Collectors.toList());

	}

}
