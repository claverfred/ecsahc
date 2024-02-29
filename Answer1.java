

public class Answer1 {
    public static void popSnap(int n){
        for(int i=0;i<=n;i++){
            if(i%3==0){
                System.out.print("Pop"+" ,");//prints if the number is divisible by 3.
            }else if(i%5==0){
                System.out.print("Snap"+" ,");//prints if the number is divisible by 5.
            }else if(i%3==0 && i%5==0){//prints if the number is divisible by 3 and 5.  
            System.out.print("PopSnap"+" ,");//the number.
        }else{
            System.out.print(i);//otherwise, prints the number.
        }
        }
    }
    public static void main(String[] args){
     popSnap(100);//calling the method.
    }
    
}
 