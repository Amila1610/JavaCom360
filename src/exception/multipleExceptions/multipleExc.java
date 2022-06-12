package exception.multipleExceptions;

import java.util.Scanner;

public class multipleExc {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int one= sc.nextInt();
            int two= sc.nextInt();
            int div=one/two;

            String [] greetings= {"Hello", "Ciao", "Zdravo"};
            greetings[4]="Bonjour";
        }catch (ArithmeticException | IndexOutOfBoundsException ex){
           System.err.println(ex);
        }

    }
}
