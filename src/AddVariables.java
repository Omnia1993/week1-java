import java.util.Scanner;

public class AddVariables {
    public static void main(String[] args) {

       byte age=25;
        String name="omnia";
        char initial='e';
      String phoneNum= "571-466-3165";
      String address= "605 del paso st";
      int  myHeight=170;
        System.out.println("hi , my name is "+name+ " initial is "+initial+
                " I am "+age+"years old "+"my myHeight "+myHeight+ ", I located at "+address+" ,my phone num is "+phoneNum);

        int num1=8,num2=10, num3=2,sum;
        sum=num1+num2+num3;
        double avg;
        avg=sum/3;

      double ran=  Math.random();
        System.out.println(ran);

        System.out.println("The Average of the number="+avg);
        Scanner scanner=new Scanner(System.in);
        System.out.println("you name please?");
        String namme=scanner.next();




    }
}
