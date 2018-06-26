package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Order m = new Order();
		try {
			FileReader fr = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(in != null){
				String[] tokens = line.split("\t");
				int num = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int kcal = Integer.parseInt(tokens[3]);
				m.meals.add(new Meal(num, name, price, kcal));
				line = in.readLine();
			}
			
			m.on();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
