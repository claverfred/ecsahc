

public class Answer3 {
    public static void main(String[] args) {
        int[][]  numbers =  {{1, 2, 3},{4, 5, 6}};
                            
    
        StringBuilder myString = new StringBuilder();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                myString.append(numbers[i][j]+",");
            }
        }
    
        System.out.println(myString);
    }
}
