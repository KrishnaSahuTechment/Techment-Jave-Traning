package com.techment.test18august.program7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SplitAray {

 
 public static void main(String[] args)
 {
    
     List<String> list = new ArrayList<String>();
     list.add("Krishna");
     list.add("Kumar");
     list.add("Sahu");
     list.add("Developer");
     list.add("Aman");
     list.add("Karan");
     list.add("Kiran");
     list.add("Shiva");
     list.add("Mahendra");
     list.add("Ram");
     list.add("Laxman");
     

    
     List[] lists = split(list);

     System.out.println(lists[0]);
     System.out.println(lists[1]);
 }
 
 
 public static List[] split(List<String> list)
 {
     int midIndex = (((list.size()) / 2) - 1);

     List<List<String> > twolists = new ArrayList<>(list.stream().collect(Collectors.partitioningBy(s -> list.indexOf(s) > midIndex)).values());

     // return an array containing both lists
     return new List[] { twolists.get(0), twolists.get(1) };
 }
}