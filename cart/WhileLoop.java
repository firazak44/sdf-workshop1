package cart;
import java.io.Console;
public class WhileLoop {
    public static void main(String[] args){
        Console cons = System.console();
        String input = "ABC";

        //waiting for input
        while (input.length() > 0){
            //request keying input after prompt
            input = cons.readLine("Please enter a text. Blank to end ");

            //keyed input received
            if(input.length() > 0){
                //input received set to lowercase, and printed out
                System.out.printf("--- %s\n", input.toLowerCase());
            }
        }
        //exit if blank input is keyed in
        System.out.println("Sayonara!");
    }
}
