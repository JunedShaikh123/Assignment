package Assignment7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q07

{
	public static void main(String[] args) {
		
		List<Item>aslist=new ArrayList<Item>();
		aslist.add(new Item(1,"pen",1200));
		aslist.add(new Item(2,"tablet",1500));
		aslist.add(new Item(3,"phone",8900));
		List<Float>check=aslist.stream().filter(w->w.price%2==0).map(w->w.price).collect(Collectors.toList());
		System.out.println("even number are: "+check);
		
		
	}

}