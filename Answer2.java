import java.util.Scanner;
static void filereader(Scanner numbers) {
    int sum = 0;          
    while(numbers.hasNextInt()) {
        int nextInt = numbers.nextInt();
        System.out.println(nextInt);
        sum += nextInt;
    }
}