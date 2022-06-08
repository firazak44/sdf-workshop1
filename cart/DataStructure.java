package cart;
import java.util.*;
public class DataStructure {
    public static void main(String[] args){
        System.out.println("Data Structure");

        //Setting a numbered integer array as the list
        List<Integer> intList = new LinkedList<Integer>();
        
        //add series of array data
        intList.add(Integer.parseInt("12"));
        intList.add(10);
        intList.add(20);
        intList.add(0,50);

        //printout array data, priority from index 0
        System.out.println(intList);
        
        //printout a loop of array data and their index position
        for(int i=0; i < intList.size(); i++){
            System.out.printf("idx %d \n",i);
            System.out.printf("Val: %d \n", intList.get(i));
        }
    }
}
