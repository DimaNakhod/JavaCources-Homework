package hillel.constants.runner;

import hillel.constants.sevice.impl.VideoLibrary;

public class Runner {
    public static void main(String[] args) {
        VideoLibrary videoLibrary = new VideoLibrary();
        System.out.println(videoLibrary.findFilmsForCurrentAndPreviousYear());
    }
}
