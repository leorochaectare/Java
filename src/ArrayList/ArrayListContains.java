package ArrayList;

import java.util.ArrayList;

import ArrayList.Objetos.Funcionarios;

public class ArrayListContains {
	public static void main(String[] args) {
		ArrayList<Funcionarios> list_funcionarios = new ArrayList<>();
		Funcionarios func1 = new Funcionarios(1, "Seu Madruga", 10000.00, "1980-01-01");
		Funcionarios func2 = new Funcionarios(2, "Chaves", 10000.00, "1980-01-01");
		Funcionarios func3 = new Funcionarios(3, "Dona Florinda", 10000.00, "1980-01-01");
		Funcionarios func4 = new Funcionarios(4, "Quico", 10000.00, "1980-01-01");
		Funcionarios func5 = new Funcionarios(5, "Bruxa do 71", 10000.00, "1980-01-01");
		Funcionarios func6 = new Funcionarios(6, "Professor Linguiça", 10000.00, "1980-01-01");
		list_funcionarios.add(func1);
		list_funcionarios.add(func2);
		list_funcionarios.add(func3);
		list_funcionarios.add(func4);
		list_funcionarios.add(func5);
		
		System.out.println(list_funcionarios);
		
		boolean contemFuncionario6 = list_funcionarios.contains(func6);
		boolean contemFuncionario5 = list_funcionarios.contains(func5);
		
				
		System.out.println(contemFuncionario5); // true
		System.out.println(contemFuncionario6); // false
		
				
		
	}
}
