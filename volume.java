class volume{


double depth;
double width;
double height;

public void volume(){
   System.out.print("Volume is ");
    System.out.println(depth*width*height);
    
}



public static void main(String[] args){


volume volum1 = new volume();

volum1.width=10;
volum1.height=10;
volum1.depth=12;

volum1.volume();



}




}