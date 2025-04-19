class Box{

double width;
double height;
double depth;
}

class Boxnew{


    public static void main(String[] args){
        Box newBox = new Box();
        double volume;

        
        newBox.width=10;
        newBox.height=12;
        newBox.depth=15;

        volume=newBox.width*newBox.depth*newBox.height;
       
        System.out.println("Volume is " + volume);






    }
}










