class Boxvolume{

double width;
double height;
double depth;

double volumBox()
{

   return height*width*depth;
  
}


public static void main(String[] args){


    Boxvolume BOX3 = new Boxvolume();

    BOX3.width=10;
    BOX3.depth=5;
    BOX3.height=5;

    double vol;

    vol=BOX3.volumBox();

    System.out.println("volume is " + vol);
}


}