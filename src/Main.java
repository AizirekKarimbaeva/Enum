import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String week = sc.nextLine();
        AptaKundor a= AptaKundor.valueOf(week.toUpperCase());
        switch (a){
            case MONDAY-> System.out.println(a.getTranslation()+": Java");
            case TUESDAY-> System.out.println(a.getTranslation()+": Lesson English");
            case WENDESDAY-> System.out.println(a.getTranslation()+": Softskills");
            case THURSDAY-> System.out.println(a.getTranslation()+": Java practice");
            case FRIDAY-> System.out.println(a.getTranslation()+": English");
            case SATYDAY-> System.out.println(a.getTranslation()+": Exam");
            case SUNDAY-> System.out.println(a.getTranslation()+": Dem aluu kunu");
        }
    }
}