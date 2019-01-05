package test;

public class GradeDivide {
    public static void main (String[] args){
        int gradeCount = 50;

        if(gradeCount >= 90){
            System.out.println("A");
        }else if (gradeCount >= 80){
            System.out.println("B");
        }else if (gradeCount >= 70){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }

}
