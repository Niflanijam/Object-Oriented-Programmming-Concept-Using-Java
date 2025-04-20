class Constructor{


String name1;


Constructor( String name){

    System.out.println("my name is " + name);
}

Constructor(){

 name1="NILA";

}


public static void main(String[] args){

Constructor c1 = new Constructor("NIFLA");
Constructor c2 = new Constructor();




System.out.println(c2.name1);






}



}