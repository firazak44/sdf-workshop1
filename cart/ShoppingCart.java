package cart;

import java.util.*;
import java.io.Console;

public class ShoppingCart {
    public static void main(String[] args){
        //Welcome msg
        System.out.println("Shopping cart");

        //Declare Variables//
        //Set numbered list for String input
        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        String input;
        int delIndex;
        boolean stop= false;

        //main loop
        while(!stop){
            //Waiting for keyed input
            input = cons.readLine("> ");
            //Printout keyed input
            System.out.printf("READ: %s\n", input);
            String[] terms = input.split(" ");
            String cmd = terms[0];

            //Switch to toggle between 3 cases (ie; list, add, delete)
            switch(cmd){   
                case "list":
                    if(cart.size()>0){
                        for(int i=0; i < cart.size(); i++){
                            //List printed out will start from 1. ---
                            System.out.printf("%d. %s\n", (i+1), cart.get(i));
                        }
                    }else{
                        System.out.println("Your cart is empty!");
                    }
                break;

                case "add":
                    for(int i=1; i < terms.length; i++){
                        boolean found = false;
                        for(int j=0; j < cart.size(); j++){
                            if(terms[i].equals(cart.get(j))){
                                found = true ;
                                break;
                            }
                        }
                        if(!found){
                            cart.add(terms[i]);
                            System.out.printf("Added %s to cart\n", terms[i]);
                        }
                    }
                break;

                case "del":
                    if(terms.length < 2){
                        System.out.println("Please provide and index in order to delete");
                    }else{
                        try{
                            delIndex = Integer.parseInt(terms[1]) - 1;
                            System.out.println(delIndex);
                            if(delIndex >= 0 && delIndex < cart.size()){
                                System.out.printf("Deleted %s from cart\n", cart.get(delIndex));
                                cart.remove(delIndex);
                            }else{
                                showIncorrectItemIndex();
                            }
                        }catch(NumberFormatException e){
                            showIncorrectItemIndex();
                        }
                    }
                break;
                //When finished with shopping, exit switch-case
                case "checkout":
                    stop = true;
                    break;
                default:
            }
        }
        //Show message if done with cart-shopping
        System.out.println("Thank you for shopping with us!");
    }
    //Show message if incorrect index is inputted
    private static void showIncorrectItemIndex() {
        System.out.println("Incorrect Item Index");
    }
}
