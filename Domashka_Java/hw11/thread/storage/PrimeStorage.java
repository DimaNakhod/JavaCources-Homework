package storage;

import java.util.Arrays;

public class PrimeStorage {

    private int[] Primes;

    public PrimeStorage(){
        Primes = new int[0];
    }
    public synchronized void addPrimes(int[] PrimesToAdd) {
        int PreviousArrayLength = this.Primes.length;
        Primes = Arrays.copyOf(Primes ,PreviousArrayLength + PrimesToAdd.length);
        for(int Number : PrimesToAdd){
            Primes[PreviousArrayLength++] = Number;
        }
    }
    public int[] getPrimes() {
        return Primes;
    }

    public void setPrimes(int[] primes) {
        Primes = primes;
    }
}
