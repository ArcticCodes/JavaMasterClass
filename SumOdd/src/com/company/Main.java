package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(5));
        System.out.println(sumOdd(1,100));
    }

    public static boolean isOdd(int number){
        if (number > 0){
            if (number%2 == 1){
                return true;
            } else {
                return false;
            }
        } else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int total = 0;
        if (start > 0 && end > 0 && end > start){
            for (int i = start; i < end; i++){
                if (isOdd(i)){
                    total = total + i;
                }
            }
            return total;
        } else {
            return -1;
        }

    }
}
