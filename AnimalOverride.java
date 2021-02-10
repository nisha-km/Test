package assignment4;

class Animal{
	public void sound(){
		System.out.println("Animal is making a sound");   
	}
}


class Horse extends Animal{

	@Override
	public void sound() {
		System.out.println("Neigh");
	}

}
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("Meow");
	}

}
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Bow");
	}

}
public class AnimalOverride {

	public static void main(String[] args) {
		Animal an=new Dog();
		Animal an1=new Horse();
		Animal an2=new Cat();
		an.sound();
		an1.sound();
		an2.sound();


	}

}
