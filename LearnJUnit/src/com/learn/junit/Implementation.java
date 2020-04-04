package com.learn.junit;

public class Implementation {
	
    static int discount;

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public static int FindPayable(int price)
	{
		return price*(100 - discount)/100;
	}
	
}
