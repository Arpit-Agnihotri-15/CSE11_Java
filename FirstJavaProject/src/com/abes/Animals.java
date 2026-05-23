package com.abes;

public class Animals {
	void sound() {
		System.out.println("Animal makes sounds.");
	}
}
class Cat extends Animals{
	void sound() {
		System.out.println("Cat meows");
	}
}
