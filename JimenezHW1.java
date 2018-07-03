import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
import java.util.stream.IntStream;

public class JimenezHW1 {

    public static void main(String[] args) {
        int indexa = 0;
        int indexb = 0;

        int[] myArray;
        myArray = new int[24];

        for (int i = 0; i < 24; i++) {

            myArray[i] = i+1;
        }


        System.out.println("Task 3");
        while (indexa < myArray.length) {

             if (myArray[indexa] % 2 == 0) {


               System.out.print(myArray[indexa] + " ");
              }
                   indexa++;

        }
         System.out.println("\n"+"Task 4");

          for(int i=0; i < myArray.length; i++){

              if(myArray[i] % 5 != 0 ) {
                continue;
            }
                if(myArray[i] == 15){
                  continue;
                }
            System.out.print(myArray[i] + " " );
          }

        System.out.println("\n" +"Task 5");
// i wasnt sure how to actually do this one and im sure its wrong but it prints the right thing
          while(indexb < myArray.length){
                if (indexb != 4) {
                    char print = '#';
                    switch (print) {
                        case ' ':
                            System.out.print(myArray[indexb] + " ");

                            break;
                        case '#':
                            System.out.print(myArray[indexb] + " # ");
                            break;
                    }
                }
              indexb++;
          }

        System.out.println("\n" +"Task 6");
        int sum =0;
        int indexc = 0;


        do {
             sum += myArray[indexc];
              indexc++;

        }while (indexc < myArray.length);
            System.out.print("The sum of all values in myArray equals " + sum);


            System.out.println("\n" +"Task 7");

        for(int i = (myArray.length - 1); i >= 0; i--) {
                if (i%6 == 0 && i<myArray.length){
                    System.out.println();
                }
            System.out.print(myArray[i] + " ");
            //got an extra blank line not sure why
        }
        System.out.println("\n" +"Task 8");

    
        int indexd=0;
       int add = 0;

             while(indexd < myArray.length+4 ) {
                 if (indexd%4 == 0 && indexd<myArray.length){
                     System.out.println();
                 }
                System.out.print(myArray[indexd] +" ");
                 add += myArray[indexd];

                 if (myArray[indexd]% 4 == 0){
                     System.out.print("="+ add);
                        add=0;
                 }
                indexd++;

         }

        }

    }


