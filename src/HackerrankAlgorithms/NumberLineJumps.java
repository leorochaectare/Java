package HackerrankAlgorithms;

public class NumberLineJumps {
    
    public static String kangaroo(int x1, int v1, int x2, int v2){
        int sum1 = x1;
        int sum2 = x2;
        
        for(int i = 0; i < 10000; i++){
            sum1 += v1;
            sum2 += v2;
            if(sum1 == sum2){
                return "YES";
            }     
        }

        return "NO";
    }
    
    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
