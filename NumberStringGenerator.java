public class NumberStringGenerator {
    private String numberString;
    private int bigNumCount;

    public NumberStringGenerator(int numberCount) {
        for (int i = 0; i < numberCount; i++) {
            numberString += generateRandomNumber();
            numberString += "_";
        }
        return numberString;
    }

    public String getNumberString() {
        return numberString;
    }

    public int getBigNumCount() {
        return bigNumCount;
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
