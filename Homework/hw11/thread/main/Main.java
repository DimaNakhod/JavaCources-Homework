package main;

import runner.Runner;
import storage.PrimeStorage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int FromNumber = scan.nextInt();
        int ToNumber = scan.nextInt();
        int NumberOfThreads = scan.nextInt();

        PrimeStorage storage = new PrimeStorage();
        Runner runner = new Runner(FromNumber,ToNumber,NumberOfThreads,storage);

        long start = System.currentTimeMillis();

        runner.StartThread();

        try{
            runner.WaitForThreadsCompletion();
        } catch (InterruptedException e){
        }

        long stop = System.currentTimeMillis();
        System.out.println("Time of searching: " + (stop-start));

        for(int Number : storage.getPrimes()){
            System.out.println(Number);
        }
    }
}
