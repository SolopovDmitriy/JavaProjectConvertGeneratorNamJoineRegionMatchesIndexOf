package splitJoin;

public class Main {
    public static void main(String[] args) {
        String s = "Keep.calm.and.listen.to.ROCK";
        String[] words = s.split("\\.");
        String textWithSpaces = String.join(" ", words);
        System.out.println(textWithSpaces);
//        System.out.println("\\");
//        System.out.println("\\.");
    }
}
