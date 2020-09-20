package com.Miles.DopTask_1;

import java.util.Scanner;

public class CoinChange {

    public static int coins[] = {1,3,5};

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Input your N:");
        int N = cin.nextInt();

        if ((N>=1)&&(N<=10000))
            System.out.println(way(N,0));
        else
            System.out.println("Error input value");

    }

    public static int way(int amount, int currentCoin){

        if( amount == 0)
            return 1;

        if( amount < 0)
            return 0;

        int nWays = 0;
        for( int coin = currentCoin; coin < coins.length; coin++){
            nWays += way(amount - coins[coin],coin);
        }

        return nWays;
    }
}
