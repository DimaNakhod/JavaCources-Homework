package runner;

import storage.PrimeStorage;
import tread.PrimesFinderThread;

public class Runner {

    private int FromIndex;
    private int ToIndex;
    private int ThreadCounter;
    private Thread [] FinderThreads;
    private PrimeStorage storage;

    public Runner(int fromIndex, int toIndex, int ThreadCounter, PrimeStorage storage) {
        this.FromIndex = fromIndex;
        this. ToIndex = toIndex;
        this. ThreadCounter = ThreadCounter;
        this.storage = storage;
        intervalSeparatorForThreads();
    }

    public void StartThread(){
        for (Thread thread : FinderThreads){
            thread.start();
        }
    }

    public void WaitForThreadsCompletion() throws InterruptedException {
        for (Thread thread : FinderThreads){
            thread.join();
        }
    }

    public void intervalSeparatorForThreads() {
        int period = (ToIndex - FromIndex) / ThreadCounter;
        FinderThreads = new Thread[ThreadCounter];
        int tFrom = FromIndex;
        int tTo = FromIndex;
        for (int i = 0; i < ThreadCounter; i++) {
            if (isFirstThread(i)) {
                tTo += period;
            } else if (isLastThread(i)) {
                tFrom += period;
                tTo = ToIndex;
            } else {
                tFrom += period;
                tTo += period;
            }
            FinderThreads[i] = new Thread(new PrimesFinderThread(tFrom +1, tTo, storage));
        }
    }
    private boolean isFirstThread(int index) {
        return index == 0;
    }

    private boolean isLastThread(int index) {
        return index == this.ThreadCounter - 1;
    }
}
