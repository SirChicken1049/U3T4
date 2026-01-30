public class VowelCounter {
    private int vowelCount;
    private String str;

    public VowelCounter(String str){
    this.str = str;
        }

    public int getVowelCount() {
        for (int i = 0; i < str.length(); i++) {
            String Letter = str.substring(i, i+1);
            if (isVowel(Letter)){
                vowelCount++;
            }
        }
        return vowelCount;
    }
    public boolean isVowel(String c) {
        if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
            return true;
        }
        else{
            return false;
        }
    }

}
