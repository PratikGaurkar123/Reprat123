package Methods;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Repeat1{
	
	public static void main(String[] args) {
	

HashMap<String,Integer>map=new HashMap<String, Integer>();

map.put("pratik", 1);
map.put("Pratik", 1);
map.put("suraj", 2);
map.put("suraj", 3);


		
		
Set<String> value = map.keySet();
for (String string : value) {
	System.out.println(string);
	
}


Collection<Integer> value1 = map.values();

for (Integer integer : value1) {
	System.out.println(integer);
}
}
	
}




