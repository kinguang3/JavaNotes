import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password:");
        String s = input.next();
        judge(s);
    }

    public static void judge(String pas) {
        int int_num = 0;
        int char_num = 0;
        if(pas.length() < 8){
            System.out.println("Invalid Password");
            return;
        }
        for (int i = 0; i < pas.length(); i++) {
            if(pas.charAt(i) >= '0' && pas.charAt(i) <= '9'){
                int_num++;
            }
            if((pas.charAt(i) >= 'a' && pas.charAt(i) <= 'z') || (pas.charAt(i) >= 'A' && pas.charAt(i) <= 'Z')){
                char_num++;
            }
        }
        if(char_num == 0 || int_num == 0){
            System.out.println("Invalid Password");
            return;
        }
        if(int_num < 2){
            System.out.println("Invalid Password");
            return;
        }
        System.out.println("Valid Password");
    }
}
