package com.yash.PracticeDemos;

import java.util.ArrayList;
import java.util.List;

public class CarArrayTest {

	public static void main(String[] args) {
		
		List<CarArrayListExample> list = new ArrayList<CarArrayListExample>();
		CarArrayListExample c1 = new CarArrayListExample(450, "bmw","black");
		CarArrayListExample c2 = new CarArrayListExample(550, "ferrari","white");
		CarArrayListExample c3 = new CarArrayListExample(600, "audi","yellow");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		for(CarArrayListExample c:list) {
		System.out.println(c.car_Speed+" "+c.car_Name+" "+c.car_color);
		}
	}

}
