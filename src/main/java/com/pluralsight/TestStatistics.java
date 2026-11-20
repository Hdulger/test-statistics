package com.pluralsight;


import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        double[] randomNums={2.1, 3, 1, 4, 8, 10, 12.3, 5, 4, 10};
        double average=0;
        double highScore=0;
        double lowScore=randomNums[0];
        int medianNumberS=randomNums.length/2;
        double medianNumber= Arrays.binarySearch(randomNums, medianNumberS);




        double total=0;
        double tempHighest=randomNums[0];
        for(int i=0; i<randomNums.length; i++){

            if(randomNums[i]>tempHighest){
                tempHighest=randomNums[i];
                highScore=tempHighest;
            }
            if(randomNums[i]<lowScore){
                lowScore=randomNums[i];

            }
            total+=randomNums[i];
        }
        System.out.println("Total="+total);
        average=total/randomNums.length;
        System.out.println("Average "+average);
        System.out.println("HighScore: "+highScore);
        System.out.println("Lowest Score: "+lowScore);
        System.out.println("median number"+medianNumber);

    }
}
