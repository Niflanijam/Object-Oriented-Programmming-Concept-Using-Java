class Addition{

int num1;
int num2;

int add(){
  
   int addi;
   addi=num1+num2;
    return addi;
}

void setnum(int n1,int n2){

    num1=n1;
    num2=n2;

}

public static void main(String[] args){

    Addition A1 = new Addition();

    A1.setnum(12,13);
      int addition;
     addition=A1.add();

    System.out.println("addition is "+ addition);

}

}