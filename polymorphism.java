class polymorphism{


public void display( String name){

System.out.println("this is nifla"+ name);


}


public void display(int age){



System.out.println("my age is 24" +age);


}


public static void main(String[] args){

polymorphism obj = new polymorphism(); 


obj.display("nifla");
obj.display(11);







}}