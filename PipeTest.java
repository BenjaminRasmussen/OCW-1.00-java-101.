package com.company2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class PipeTest {
    public static void main(String[] args) {
        Pipe[] pipes= new Pipe[3];			// Array
        pipes[0]= new Pipe(0.25, 7);
        pipes[1]= new Pipe(0.15, 3);
        pipes[2]= new Pipe(0.27, 1);
        Arrays.sort(pipes);					// Built-in sort
    //    for (Pipe p: pipes)
      //      System.out.println(p);
        System.out.println();
        ArrayList<Pipe> pipes2= new ArrayList<Pipe>();
        pipes2.add(new Pipe(0.5, 4));
        pipes2.add(new Pipe(0.4, 5));
        pipes2.add(new Pipe(0.3, 8));
        Collections.sort(pipes2);			// Built-in sort
       // for (Pipe p: pipes2)
       //     System.out.println(p);

        getSmallestToBiggest(pipes);

        }


    private static void getSmallestToBiggest(Pipe[] a) {
        Pipe result;

        for(int j=0; j<Math.pow(2,a.length); j++){
            result = a[j];
            int i = j-1;
            while(i > 0 && a[i].getNumberOfPipes() > result.size()){
                a[i+1] = a[i];
                i = i- 1;
                result.add(a[i + 1]);

            }System.out.println(result);

        }

    }
}
