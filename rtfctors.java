package com.company;

/**
 * Created by Benjamin R. on 24-07-2016.
 */
public class rtfctors {
    public static void main(String[] args) {
       // String input = JOptionPane.showInputDialog("Enter n");
        //int n = Integer.parseInt(input);
      for( int i = 1; i < 4 ; i++){
          System.out.println(i + " " + q(36, i));
      }
        System.exit(0);

    }


    public static int q(int n, int i) {
     if(n/i <= 0) return n; else
         return (int) (Math.sqrt(n)+i);
    }  }
