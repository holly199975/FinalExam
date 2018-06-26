package com.exam;

public class Meal {
	int num;
	String name;
	int price;
	int kcal;
	public Meal(int num,String name,int price,int kcal){
		this.num = num;
		this.name = name;
		this.price = price;
		this.kcal = kcal;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

}
