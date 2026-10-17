package com.kodewala.Inhiritance2;

class Animal   //Heirarcial Inhirtance
{
	public void sound() {
		System.out.println("Animal.sound()");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog.sound()");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("Cat.sound()");
	}
}

public class AnimalApp{
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
	}
}



