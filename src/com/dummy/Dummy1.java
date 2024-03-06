package com.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dummy1 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("kiwi");
        System.out.println("List of fruit-" + fruit);
        
        List<Integer> li = fruit.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println(li.toString());
        
        List<List<Integer> > number = new ArrayList<>();
        
        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
       
        System.out.println("List of list-" + number);
        
        List<Integer> li2 = number.stream().flatMap(list ->list.stream()).collect(Collectors.toList());
        System.out.println(li2.toString());
        
        
        

        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Java 8
        List<String> result = Stream.of(array)  // Stream<String[]>
                .flatMap(Stream::of)  
                .filter(x-> !"a".equals(x))// Stream<String>
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }

        
	}

}
