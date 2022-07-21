package HackerrankAlgorithms;

import java.util.List;
import java.util.ArrayList;

public class BirthdayCakeCandles {
    
    public static int birthdayCakeCandles(List<Integer> candles){
        int count = 0;
        int biggerValue = 0;
        List<Integer> biggerList = new ArrayList<>();

        for(int i = 0; i < candles.size(); i++){
            if(candles.get(i) > biggerValue){
                biggerValue = candles.get(i);
                biggerList.add(biggerValue);
            }
        }

        for(int i = 0; i < candles.size(); i++){
            if(candles.get(i) == biggerValue){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();

        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(3);

        System.out.println(birthdayCakeCandles(candles));
    }
}
