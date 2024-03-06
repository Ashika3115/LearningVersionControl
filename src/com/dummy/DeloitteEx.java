package com.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class DeloitteEx {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5);
		List<Integer> ans = new ArrayList<Integer>();

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < al.size(); i++) {
			if (hm.containsKey(al.get(i))) {
				Integer x = (Integer) hm.get(al.get(i));
				hm.put(al.get(i), x + 1);
			} else
				hm.put(al.get(i), 1);
		}

		for (Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			if (entry.getKey() == entry.getValue()) {
				ans.add((Integer) entry.getKey());
			}
		}

		System.out.println(ans.toString());

		List<Integer> words = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5);

		List<Integer> result = words.stream().collect(Collectors.groupingBy(x -> x, Collectors.summingInt(x -> 1)))
				.entrySet().stream().filter(entry -> entry.getKey().equals(entry.getValue())).map(Map.Entry::getKey)
				.toList();
		System.out.println(result.toString());

		int i = 0;
		int start = 0;
		int end = 0;
		for (int j = i - 1, k = i + 1; j >= start && k <= end; j--, k++) {

		}
	}

}
