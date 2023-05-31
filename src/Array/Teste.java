package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import Array.objetos.Employee;

public class Teste {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "Seu Madruga", 10000.00);
		Employee employee2 = new Employee(2, "Seu Barriga", 20000.00);
		Employee employee3 = new Employee(3, "Chaves", 30000.00);
		Employee employee4 = new Employee(4, "Chiquinha", 40000.00);
		Employee employee5 = new Employee(5, "Quico", 50000.00);
		Employee employee6 = new Employee(1, "Seu Madruga", 10000.00);
		ArrayList<Employee> list = 
				new ArrayList<>(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6));
		
		Set<Employee> set = new HashSet<>(list);
		
		System.out.println(set.size());
	}
}
