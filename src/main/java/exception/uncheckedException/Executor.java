package exception.uncheckedException;

public class Executor {
    public static void main(String[] args) {

        String[] greetings= new String[5];//Array is static data structure and I have array with 5 elements
        greetings[0]="Zdravo";
        greetings[1]="Hello";
        greetings[2]="Bonjour";
        greetings[3]="Hallo";
        greetings[4]="Ciao";
        greetings[5]="Hej"; //Here I have one element more than defined in the array.For this reason, exception will appear.

        for(int i=0;i< greetings.length;i++){
            System.out.println(greetings);
        }
    }
}
