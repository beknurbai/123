package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] names={"Nurjigit","Baiislam","Emirhan"};
        for (int i = 0; i <4 ; i++) {
if (i==4)
    continue;


      switch (i) {
          case 1:
              System.out.println("доброе утро , " + names[0]);
              break;
          case 2:
              System.out.println("добрый день , " + names[1]);
              break;
          case 3:
              System.out.println("добрый вечер , " + names[2]);
              break;
      }
              }
      }
    }

