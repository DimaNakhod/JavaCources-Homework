package tread;

import storage.PrimeStorage;

import java.util.Arrays;

public class PrimesFinderThread implements Runnable {

    private int[] Primes;
    private int FromFinder;
    private int ToFinder;
    private PrimeStorage storage;

    public PrimesFinderThread( int fromFinder, int toFinder, PrimeStorage storage) {
        this.Primes = new int [0];
        this.FromFinder = fromFinder;
        this.ToFinder = toFinder;
        this.storage = storage;
    }
    @Override
    public void run(){
        for(int i = FromFinder; i <ToFinder; i++){
            if(IsPrime(i)){
                int PreviousArrayLength = Primes.length;
                Primes = Arrays.copyOf(Primes,PreviousArrayLength + 1);
                Primes[PreviousArrayLength] = i;
            }
        }
        storage.addPrimes(Primes);
    }
    private boolean IsPrime(int Number){
        for (int i = 2; i <= Math.sqrt(Number); i++){
            if(Number % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public PrimeStorage getStorage() {
        return storage;
    }

    public void setStorage(PrimeStorage storage) {
        this.storage = storage;
    }
}
