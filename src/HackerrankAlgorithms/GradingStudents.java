package HackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    // Se a diferença entre a nota e o próximo múltiplo de 5 for menor que 3, volta a nota para o próximo múltiplo de 5
    // Se a nota for maior que 38, volta a nota para 38
    
    public static List<Integer> gradingStudents(List<Integer> grades){
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) < 38){
                continue;
            } else if(grades.get(i) > 38 && grades.get(i) % 5 > 2){
                grades.set(i, grades.get(i) + (5 - (grades.get(i) % 5)));
            } 
        }

        return grades;
    }
    
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33, 58);

        System.out.println(gradingStudents(grades));
    }
}
