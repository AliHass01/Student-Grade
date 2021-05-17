import java.util.Scanner;

public class Stusents {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("the grade of the QS: ");
        double sumq=0;
        for (int i=1; i<=3; i++){
            double q=input.nextDouble();
            if (q>5||q<0){
                System.out.println("The value is invalid");
            }else
                sumq+=q;
        }
        double totalQ=sumq*(25/15.0);

        System.out.println("enter MT:");
        double MT=input.nextDouble();
        double sumMT=0;
        if (MT<30 ||MT>=0){
            sumMT+=MT;
        }else
            System.out.println("The value is invalid");
        double totalMT=sumMT*(35.0/30);


        System.out.println("Final grade:");
        double F=input.nextDouble();
        double sumF=0;
        if (F>70||F<0){
            System.out.println("The value is invalid");
        }else {
            sumF += F;
        }
        double totalF = sumF * (40 / 70.0);


        double totalGEADE=totalF+totalMT+totalQ;
        System.out.println("The grade from 100 is :"+totalGEADE);
    }
}
