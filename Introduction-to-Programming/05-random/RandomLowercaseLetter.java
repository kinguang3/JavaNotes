public class RandomLowercaseLetter {
    public static void main(String[] args) {
        char res = (char)(Math.random() * 26 + 'a');
        System.out.println(res);
    }
}
