package com.kattis;

public class interfaceDemo {
    public static void main(String[] args) {

        E e=new E();
        e.move();

        }
    }
interface C{ void move();}
interface D{ void moveS();}

class E implements C,D {

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void moveS() {

    }
}





