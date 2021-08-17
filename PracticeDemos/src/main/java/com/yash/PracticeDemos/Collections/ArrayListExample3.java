package com.yash.PracticeDemos.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample3 {

	public static void main(String[] args) {
		List<String> tvShows = new ArrayList<>();
		tvShows.add("Silicon Valley");
		tvShows.add("Game Of Thrones");
		tvShows.add("Money Heist");
		tvShows.add("The Witcher");

		for(String t:tvShows) {
			System.out.println(t);
		}

		System.out.println("iterate using iterator()");

		Iterator<String> tvShowIterator = tvShows.iterator();
		while(tvShowIterator.hasNext()) {
			String tvShow = tvShowIterator.next();
			System.out.println(tvShow);
		}

		System.out.println("\n Iterate using a listIterator()");

		ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
		while (tvShowListIterator.hasPrevious()) {
			String tvShow = tvShowListIterator.previous();
			System.out.println(tvShow);
		}

	}

}
