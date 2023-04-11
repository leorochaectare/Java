package Others.java;

import java.util.LinkedList;

import Others.java.objetos.NumeroNota;

public class TestandoLinkedList {
	public static void main(String[] args) {
		NumeroNota numeroNota = new NumeroNota();
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
//		list.add(9);
		
		System.out.println("Tamanho da lista: " + list.size());
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(list.size() <= i ? null : list.get(i));
//		}
		
		numeroNota.setNumero_nota_1(list.size() < 1 ? null : list.get(0));
		numeroNota.setNumero_nota_2(list.size() < 2 ? null : list.get(1));
		numeroNota.setNumero_nota_3(list.size() < 3 ? null : list.get(2));
		numeroNota.setNumero_nota_4(list.size() < 4 ? null : list.get(3));
		numeroNota.setNumero_nota_5(list.size() < 5 ? null : list.get(4));
		numeroNota.setNumero_nota_6(list.size() < 6 ? null : list.get(5));
		numeroNota.setNumero_nota_7(list.size() < 7 ? null : list.get(6));
		numeroNota.setNumero_nota_8(list.size() < 8 ? null : list.get(7));
		numeroNota.setNumero_nota_9(list.size() < 9 ? null : list.get(8));
		numeroNota.setNumero_nota_10(list.size() < 10 ? null : list.get(9));
		
		System.out.println(numeroNota.getNumero_nota_1());
		System.out.println(numeroNota.getNumero_nota_2());
		System.out.println(numeroNota.getNumero_nota_3());
		System.out.println(numeroNota.getNumero_nota_4());
		System.out.println(numeroNota.getNumero_nota_5());
		System.out.println(numeroNota.getNumero_nota_6());
		System.out.println(numeroNota.getNumero_nota_7());
		System.out.println(numeroNota.getNumero_nota_8());
		System.out.println(numeroNota.getNumero_nota_9());
		System.out.println(numeroNota.getNumero_nota_10());
		
		
	}
}
