package exeption;

public class InvalidStemLengthException extends Exception{

    private int MinLengthOfStem;
    private int MaxLengthOfStem;

    public InvalidStemLengthException(int stemMinLength, int stemMaxLength) {
        this.MinLengthOfStem = stemMinLength;
        this.MaxLengthOfStem = stemMaxLength;
    }

    @Override
    public String getMessage() {
        return "Invalid stem`s lengths for finding: min: " + MinLengthOfStem + ", max: " + MaxLengthOfStem;
    }

    public int getMinLengthOfStem() { return MinLengthOfStem; }

    public void setMinLengthOfStem(int stemMinLength) {
        this.MinLengthOfStem = stemMinLength;
    }

    public int getMaxLengthOfStem() {
        return MaxLengthOfStem;
    }

    public void setMaxLengthOfStem(int stemMaxLength) {
        this.MaxLengthOfStem = stemMaxLength;
    }
}
