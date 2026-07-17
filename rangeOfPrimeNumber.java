import java.util.Scanner;
class Main{
    public static void main(String[] args){
        System.out.println("Enter  a Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        for(int j = 1; j <= number; j++){
            int count = 0;
            for(int i = 1; i <= j; i++){
                
                if(j%i == 0){
                    count++;
                }
            }
            
            if(count == 2){
                System.out.print(j+" ");
            }
        }
        sc.close();
    }
}
