package Assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q06 
{
	public static void main(String[] args)
	{

		List<Item> ref = new ArrayList<Item>();
        ref.add(new Item(2, "DRONE", 560000));
        ref.add(new Item(5, "GO-PRO", 800000));
        ref.add(new Item(4, "GIMBAL", 200000));
        ref.add(new Item(9, "IWATCH", 650000));
        ref.add(new Item(3, "IPHONE 13 PRO MAX", 13400));

        Double avgprice = ref.stream().collect(Collectors.averagingDouble(i -> i.itemprice));
        System.out.println("AVERAGE PRICE OF THE ITEMS: " + avgprice);

        List<Float> itemsBelowAvg = ref.stream().filter(i -> i.itemprice < avgprice).map(p -> p.itemprice).collect(Collectors.toList());
        System.out.println("ITEMS WHO IS BELOW AVERAGE: ");

      
            System.out.println(itemsBelowAvg);
        

	}

} 


