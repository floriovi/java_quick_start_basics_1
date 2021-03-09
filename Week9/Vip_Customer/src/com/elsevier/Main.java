package com.elsevier;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vince = new VipCustomer();
        System.out.println(vince.getName());
        VipCustomer vince2 = new VipCustomer("Tim Robbins", 38000.50);
        System.out.println(vince2.getEmailAddress());
    }
}
