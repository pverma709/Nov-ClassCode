package com.wbl.oops;

public class AnimalDemo {

	public static void main(String[] args){
		//object/instance of class
		System.out.println("this is start of main method");
		Animal animalObj1 = new Animal();
		animalObj1.breed = "pug";
		animalObj1.setName("punto");
		animalObj1.color = "white";
		animalObj1.displayDetails();
		
		System.out.println("this is end of main method");
		/*animalObj1.eat();
		
		Animal animalObj2 = new Animal();
		animalObj2.breed = "labrador";
		animalObj2.setName("rexy");
		animalObj2.setColor("white");
		animalObj2.displayDetails();
		animalObj2.eat();*/
		
	}

}
