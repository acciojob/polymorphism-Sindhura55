package com.driver;

public class Main {
    public static void main(String[] args){
        Product p=new Product();
        p.product(2,5);
        p.product(2, 6, 7);
        p.product(22.05,55.07);
    }
public static class Product{
        public static int product(int x,int y){
            return x*y;
        }
        public  static int product(int x,int y,int z){
            return x*y*z;
        }
        public static  double product(double x,double y){
            return x*y;
        }
}
}