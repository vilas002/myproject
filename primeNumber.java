import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("Enter  a Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Its a Prime Number "+number);
        }else{
 
           System.out.println("Not a Prime Number "+number);
        }
        sc.close();
    }
}
