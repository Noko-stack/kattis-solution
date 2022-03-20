package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopSticker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> inputs=new ArrayList<>();

        for(int i=0;i<4;i++){
            inputs.add(scanner.nextInt());
        }
        if(inputs.get(0)-inputs.get(2)>=2&&inputs.get(1)-inputs.get(3)>=2){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
