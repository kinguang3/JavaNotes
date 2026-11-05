import java.util.Scanner;
public class InputNumber {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num = 1;
    double sum = 0;
    int neg = 0;
    int pos = 0;
    int flag = 0;
    System.out.print("Enter an integer, the input ends if it is 0:");
    while(num != 0){
        num = input.nextInt();
        if(num < 0){
            neg++;
        }
        else if(num > 0){
            pos++;
        }
        if(num == 0 & (neg + pos) <= 0){
            flag = 1;
            break;
        }
        sum += num;
    }
    if(flag == 1){
        System.err.print("No numbers are except 0");
    }
    else{
        double avg = sum / (neg + pos);
        System.out.println("The number of positives:" + pos);
        System.out.println("The number of negitives:" + neg);
        System.out.println("The total is: " + sum);
        System.out.println("The average is: " + avg);
    }

}

}
