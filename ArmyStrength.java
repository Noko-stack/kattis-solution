package com.kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArmyStrength {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            List<Integer> G = new ArrayList<>();
            List<Integer> M = new ArrayList<>();
            int Ga = sc.nextInt();
            int Ma = sc.nextInt();

            for(int j=0;j<Ga;j++)G.add(sc.nextInt());
            for(int j=0;j<Ma;j++)M.add(sc.nextInt());
            Collections.sort(M);
            Collections.sort(G);
            int m=0,g=0;
            while(m<M.size()&&g<G.size()){

                if(G.get(g)>=M.get(m))m++;
                else g++;
            }
            if(m==M.size()&&g==G.size())System.out.println("uncertain");
            else if(m==M.size())System.out.println("Godzilla");
            else System.out.println("MechaGodzilla");

        }
    }
}
