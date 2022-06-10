package exception.checkedException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ExecutorChecked {
    public static void main(String[] args) {

        List<String> listOfGreetings = new ArrayList<>();
        listOfGreetings.add("Zdravo");
        listOfGreetings.add("Hello");
        listOfGreetings.add("Bonjour");
        listOfGreetings.add("Hallo");
        listOfGreetings.add("Ciao");
        listOfGreetings.add("Hej");

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter("ListOfGreetings.txt");
            printWriter = new PrintWriter(fileWriter);

            for(int i=0;i<listOfGreetings.size();i++){
                String greeting= listOfGreetings.get(i);
                System.out.println(greeting);
                printWriter.println(greeting);
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }finally {
            if(printWriter!=null){
                printWriter.close();
            }
        }
    }
}
