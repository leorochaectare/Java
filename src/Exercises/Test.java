package Exercises;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       ArrayList<String> nomes = new ArrayList<String>();
       
       nomes.add("Seu Madruga");
       nomes.add("Chaves");
       nomes.add("Dona Florinda");
       nomes.add("Seu Barriga");
       nomes.add("Professor Linguica");
       
       System.out.println(nomes);
       
       nomes.add(2, "Bruxa do 71");
       System.out.println(nomes);
    }
}
