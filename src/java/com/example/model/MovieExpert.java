/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomi
 */
package com.example.model;

import static java.lang.System.in;
import java.util.*;

public class MovieExpert {
   public List getTypes(String type) {

     List types = new ArrayList();

     if (type.equals("Thriller")) {
       //types.add("Knock Knock");
       //types.add("The Visit");
     }
     else if (type.equals("Comedy")) {
       types.add("latte");
       types.add("cappuccino");
       types.add("frappuccino");
     }
     else if (type.equals("Adventure")) {
       types.add("espresso");
       types.add("double espresso");
     }
     else {
       types.add("Vending Machine");
     }
     return(types);
   }
}
