package HackerrankAlgorithms;

import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PlusMinus {
	
	public static void plusMinus(List<Integer> arr){
		DecimalFormat df = new DecimalFormat("###,###,##0.000000");
		
		double countPositive = 0.00;
		double countNegative = 0.00;
		double countZero = 0.00;
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) > 0)
				countPositive++;
			else if (arr.get(i) < 0)
				countNegative++;
			else if (arr.get(i).equals(0))
				countZero++;
		}
		
		System.out.println(df.format(countPositive / arr.size()));
		System.out.println(df.format(countNegative / arr.size()));
		System.out.println(df.format(countZero / arr.size()));
	}
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(1);
		array.add(0);
		array.add(-1);
		array.add(-1);
		
		plusMinus(array);
		
	}
}
