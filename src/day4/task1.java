package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        String[] arr = {"white", "yellow", "black", "pink", "green", "purple", "red"};
        ArrayList<String> colors = new ArrayList<String>();
        Collections.addAll(colors, arr);  //from "colors" to "arr"
        colors.remove(2);
        colors.add("orange");   //automatically adds it to the end of list

        colors.add(0, "green");
        for(String current:colors){
            System.out.println(current);
        }
        System.out.println();
        List<String> colorsSublist = colors.subList(2,5); //sublist w values 2-5 from "colors"
        for(String current:colorsSublist) {
            System.out.println(current);
        }







    }


}
