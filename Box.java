class Box{

double width;
double height;
double depth;
}

class Boxnew{


    public static void main(String[] args){
        Box newBox = new Box();
        Box newBox2 = new Box();

        double volume;
        

        
        newBox.width=10;
        newBox.height=12;
        newBox.depth=15;

        newBox2.width=5;
        newBox2.height=5;
        newBox2.depth=5;


        volume=newBox.width*newBox.depth*newBox.height;
        System.out.println("Volume is " + volume);

        volume=newBox2.width*newBox2.depth*newBox2.height;
       
        System.out.println("Volume is " + volume);






    }
}










