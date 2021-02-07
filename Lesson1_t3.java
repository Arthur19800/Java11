package homework.lesson_1.task3;
///
public class Main {

    public static void main(String[] args) {
        float a = 2,b = 3,c = 4,d = 5;

        System.out.println("Result : "+ Calculate_exp(a,b,c,d));


    }
    public static float Calculate_exp(float a, float b,float c,float d)
    {
         return a*(b+(c/d));
    }

}
