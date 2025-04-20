class Animal{


    public void bark(){

        System.out.println("animals");
    }
}

class Dog extends Animal{


 public void bark(){

    System.out.println("dog can sleep");
}






public static void main(String[] args){


Dog d = new Dog();
Animal a = new Animal();

d.bark();
a.bark();





}
}

