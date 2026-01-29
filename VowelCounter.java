public class VowelCounter {
    private int vowelCount;
    private String Str;
    }

    public VowelCounter(int vowelCount, String str){

        for (int i = 0; i < str.length() ; i++) {
            String letter  = str.substring(i, i+1);
            if (isVowel(letter))

        }
    }

    public int getVowelCount() {
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
