package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class armystrengthhard {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCase= sc.nextInt();
        List<Integer> list= new ArrayList<>();


        for(int i=0;i<testCase;i++){
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            int sum=0;
            for(int j=0;j<list.get(0);j++){
                sum+=sc.nextInt();
            }
            int gsum=0;
            for(int m=0;m<list.get(1);m++){
                gsum+=sc.nextInt();
            }
            if(sum>=gsum){
                System.out.println("Godzilla");
            }
            else if(gsum>sum){
                System.out.println("MechaGodzilla");
            }
            else {
                System.out.println("uncertain");
            }
            list.clear();
        }
    }
}
