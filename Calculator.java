
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {




    public static String sum (double num1 , double num2 ) {

        double sum = num1 + num2 ;
        return(num1 + " + " + num2 + " = " +  sum );

    }

    public static String sub (double num1 , double num2 ) {

        double sub = num1 - num2 ;
        return(num1 + " - " + num2 + " = " +  sub );
    }

    public static String mul (double num1 , double num2 ) {

        double mul = num1 * num2 ;
        return(num1 + " * " + num2 + " = " +  mul );

    }

    public static String dev (double num1 , double num2 ) {

        double dev = num1 / num2 ;
        return(num1 + " / " + num2 + " = " +  dev );

    }


    public static String mod (double num1 , double num2 ) {

        double mod = num1 % num2 ;
        return(num1 + " % " + num2 + " = " +  mod );

    }

    public static String min (double num1 , double num2 ) {

        if(num1<num2) {
            return("the minimum number " + num1);
        }else if(num2<num1) {
            return("the minimum number " + num2);
        }else {
            return("both numbers are equal");
        }

    }

    public static String max (double num1 , double num2 ) {

        if(num1>num2) {
            return("the maximum number " + num1);
        }else if(num2>num1) {
            return("the maximum number " + num2);
        }else {
            return("both numbers are equal");
        }

    }


    public static String avg (double num1 , double num2 ) {

        double avg = (num1+num2) / 2 ;
        return("the average equal " + avg);

    }






    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("please enter number 1");
        try{
            double num1 = input.nextDouble();
            System.out.println("please enter number 2");
            double num2 = input.nextDouble();


            String result = "" ;

            boolean exit = false  ;

            while(exit==false) {



                System.out.println(
                        "Welcome to the Calculator!\n" +

                                "Enter 1 to addition the numbers\n"

                                + "Enter 2 to subtraction the numbers\n"

                                + "Enter 3 to multiplication the numbers\n"

                                + "Enter 4 to division the numbers\n"

                                + "Enter 5 to modulus the numbers\n"

                                + "Enter 6 to find minimum number\n"

                                + "Enter 7 to find maximum number\n"

                                + "Enter 8 to find the average of numbers\n"

                                + "Enter 9 to print the last result in calculator\n"

                                + "Enter 10 to print the list of all results in calculator\n"
                                + "Enter 11 to exit from the calculator ");


                int num = input.nextInt();


                if(num==1) {

                    result = sum(num1,num2);
                    System.out.println(result);


                }

                else if(num==2) {

                    result = sub(num1,num2);
                    System.out.println(result);


                }

                else if(num==3) {

                    result = mul(num1,num2);
                    System.out.println(result);


                }

                else if(num==4) {

                    result = dev(num1,num2);
                    System.out.println(result);

                }

                else if(num==5) {

                    result = mod(num1,num2);


                    System.out.println(result);


                }


                else if (num==6) {

                    result = min(num1,num2);


                    System.out.println(result);

                }


                else if (num==7) {

                    result = max(num1,num2);


                    System.out.println(result);

                }



                else if (num==8) {

                    result = avg(num1,num2);


                    System.out.println(result);


                }


                else if (num==9) {

                    System.out.println( " the last result in calculator is  " +  result );

                }



                else if (num==10) {

                    System.out.println("all results in calculator : ");

                    System.out.println(sum(num1,num2));
                    System.out.println(sub(num1,num2));
                    System.out.println(mul(num1,num2));
                    System.out.println(dev(num1,num2));
                    System.out.println(mod(num1,num2));
                    System.out.println(min(num1,num2));
                    System.out.println(max(num1,num2));
                    System.out.println(avg(num1,num2));

                }

                else if (num==11) {

                    System.out.println("thank you for using our calculator");
                    exit = true ;
                }

                else {
                    System.out.println("Please enter from 1 to 11");
                }


            }

        }catch(InputMismatchException e){
            System.out.println("Please enter a number !");
        }









    }

}
