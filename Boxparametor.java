class Boxparametor{


double width;
double depth;
double height;

double myvolume(){

    return height*width*depth;
}

void setnumber(double w, double d,double h){

    depth=d;
    width=w;
    height=h;
}



public static void main(String[] args){

Boxparametor BOX4 = new Boxparametor();
BOX4.setnumber(14,2,4);

double vol;
vol=BOX4.myvolume();

System.out.print("volume is " + vol);


}


}