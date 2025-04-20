class Parametor{


double width;
double height;
double depth;

Parametor(double d,double w,double h)
{
    depth=d;
    width=w;
    height=h;

}


double volume(){

    return width*height*depth;
}


public static void main(String[] args){


Parametor C3 = new Parametor(12,3,4);
double vol;
vol=C3.volume();
System.out.println("volume is " + vol);


}




}