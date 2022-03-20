package com.kattis;

import java.util.*;

public class Cetvrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listA=new ArrayList<>();
        List<Integer> listB=new ArrayList<>();

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if(j%2==0){
                    listA.add(sc.nextInt());
                }else {
                    listB.add(sc.nextInt());
                }
            }
        }

        Map<Integer,Integer> mapA=new HashMap<>();
        Map<Integer,Integer> mapB=new HashMap<>();

        for(int i=0;i<3;i++){

            if(mapA.containsKey(listA.get(i))){
                mapA.put(listA.get(i),mapA.get(listA.get(i))+1);
            }
            else {
                mapA.put(listA.get(i),1);
            }
        }

        for(int i=0;i<3;i++){

            if(mapB.containsKey(listB.get(i))){
                mapB.put(listB.get(i),mapB.get(listB.get(i))+1);
            }
            else {
                mapB.put(listB.get(i),1);
            }
        }

        System.out.println(Collections.min(mapA.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey()+
        " "+ Collections.min(mapB.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey());

    }
}
