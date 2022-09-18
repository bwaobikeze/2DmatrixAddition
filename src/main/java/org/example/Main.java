package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        long startTime=System.currentTimeMillis();
        ArrayList<Integer>DifferntSizes=new ArrayList<>(Arrays.asList(100,200,400,800,1600,3200,6400,12800,25600,51200));
        for(int i=0; i<DifferntSizes.size();i++) {
            System.out.println();
            System.out.println("Interation For Size: "+DifferntSizes.get(i));
            matrixAddtion(DifferntSizes.get(i));
            matrixAddtionVersion2(DifferntSizes.get(i));
        }
    }
   static void matrixAddtion(int sizeOfMatrix){
        int[][] firstMatrix=new int[sizeOfMatrix][sizeOfMatrix];
        int[][] secondMatrix=new int[sizeOfMatrix][sizeOfMatrix];
        int [][] resultMatrix=new int[sizeOfMatrix][sizeOfMatrix];
        long startExcution= System.currentTimeMillis();
        //First matrix intialize to 1
        for(int FirstMatrixPointer=1; FirstMatrixPointer<firstMatrix.length;FirstMatrixPointer++){
            for(int FirstMatrixSecondPointer=1; FirstMatrixSecondPointer<firstMatrix.length;FirstMatrixSecondPointer++){
                firstMatrix[FirstMatrixPointer][FirstMatrixSecondPointer]=1;
            }
        }
        //Second matrix intialize to 1
        for(int SecondMatrixPointer=1; SecondMatrixPointer<secondMatrix.length;SecondMatrixPointer++){
            for(int SecondMatrixSecondPointer=1; SecondMatrixSecondPointer<secondMatrix.length;SecondMatrixSecondPointer++){
                secondMatrix[SecondMatrixPointer][SecondMatrixSecondPointer]=1;
            }
        }
        for(int ResultMatrixPointer=1; ResultMatrixPointer<resultMatrix.length;ResultMatrixPointer++){
            for(int ResultMatrixSecondPointer=1; ResultMatrixSecondPointer<secondMatrix.length;ResultMatrixSecondPointer++){
                resultMatrix[ResultMatrixPointer][ResultMatrixSecondPointer]=firstMatrix[ResultMatrixPointer][ResultMatrixSecondPointer]+secondMatrix[ResultMatrixPointer][ResultMatrixSecondPointer];
            }
        }
        long endExucution=System.currentTimeMillis();
        long totalTimeOfExcution=endExucution-startExcution;
       System.out.println("Excucution For Version 1 Size: "+sizeOfMatrix);
       System.out.println("Excucution Time For Version 1 in Miliseconds: "+totalTimeOfExcution+"ms");
       System.out.println();
    }

    static void matrixAddtionVersion2(int sizeOfMatrix){
           int[][] firstMatrix=new int[sizeOfMatrix][sizeOfMatrix];
        int[][] secondMatrix=new int[sizeOfMatrix][sizeOfMatrix];
        int [][] resultMatrix=new int[sizeOfMatrix][sizeOfMatrix];
        long startExcution= System.currentTimeMillis();
        //First matrix intialize to 1
        for(int FirstMatrixSecondPointer=1; FirstMatrixSecondPointer<firstMatrix.length;FirstMatrixSecondPointer++) {

            for (int FirstMatrixPointer = 1; FirstMatrixPointer < firstMatrix.length; FirstMatrixPointer++) {

                firstMatrix[FirstMatrixPointer][FirstMatrixSecondPointer] = 1;

            }
        }
        //Second matrix intialize to 1
        for(int SecondMatrixSecondPointer=1; SecondMatrixSecondPointer<secondMatrix.length;SecondMatrixSecondPointer++) {

            for (int SecondMatrixPointer = 1; SecondMatrixPointer < secondMatrix.length; SecondMatrixPointer++) {

                secondMatrix[SecondMatrixPointer][SecondMatrixSecondPointer] = 1;
            }
        }
        for(int ResultMatrixPointer=1; ResultMatrixPointer<resultMatrix.length;ResultMatrixPointer++){
            for(int ResultMatrixSecondPointer=1; ResultMatrixSecondPointer<secondMatrix.length;ResultMatrixSecondPointer++){
                resultMatrix[ResultMatrixPointer][ResultMatrixSecondPointer]=firstMatrix[ResultMatrixPointer][ResultMatrixSecondPointer]+secondMatrix[ResultMatrixPointer][ResultMatrixSecondPointer];
            }
        }
        long endExucution=System.currentTimeMillis();
        long totalTimeOfExcution=endExucution-startExcution;
        System.out.println("Excucution For Version 2 Size: "+sizeOfMatrix);
        System.out.println("Excucution Time For Version 2 in Miliseconds: "+totalTimeOfExcution+"ms");
    }
}