package main;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
 
public class ArrayListBasics {
    
    // Complete the functionality of the function below
    public static  List<String> convertArrayToList(String[] inputArray) {
        List<String> arrayToList = new ArrayList<>();
        for(String x:inputArray) {
        	arrayToList.add(x);
        }
        return arrayToList;
        
        // Create a new array list 


        // Iterate inputArray using For-Each and add the elements to array list. Hint: Use add() method to add elements to array list

        // return the List with elements
    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);
        System.out.println(arraylist);
    
    }
}


