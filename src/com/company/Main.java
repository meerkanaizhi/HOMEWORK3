package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String[] names = new String[3];
        names[0] = "Mery";
        names[1] = "Kate";
        names[2] = "Sirius";

        String[] namesNew = Arrays.copyOf(names, names.length + 1);
        namesNew[3] = "Lili";

/*        System.out.println(namesNew.length);
        System.out.println(namesNew[0]);*/

        for (int i = 0; i < namesNew.length; i++) {// i = i+ 1
            switch (i) {
                case 0:
                    System.out.println("Доброе утро " + namesNew[i]);
                    break;
                case 1:
                    System.out.println("Добрый день " + namesNew[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер " + namesNew[2]);
                    break;
                case 3:
                    System.out.println(" Четвертый массив " +namesNew[3]);
                    break;
                default:
                    System.out.println("Здравствуйте " + namesNew[0] + namesNew[1] + namesNew[2]);
            }
        }
    }
    /*
             switch(names[]) {
                 case names[0]:
                    System.out.println("Доброе утро");
                case names[1]:
                    System.out.println("Добрый день");
                case names[2]:
                    System.out.println("Добрый вечер");
             }
        }
    */
}