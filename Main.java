//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VowelCounter vc = new VowelCounter("how are you?");
        System.out.println(vc.getVowelCount());
        vc = new VowelCounter("i am calling you");
        System.out.println(vc.getVowelCount());
        vc = new VowelCounter("www yyy zzz");
        System.out.println(vc.getVowelCount());
        vc = new VowelCounter("aeiou");
        System.out.println(vc.getVowelCount());

    }
}