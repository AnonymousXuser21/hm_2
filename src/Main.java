import java.util.Random;

public class Main {

    public static String returnMethod(int age, int temperature){

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            return "Можно идти гулять";
        }

        else if (age < 20 && temperature >= 0 && temperature <= 28){
            return  "Можно идти гулять";
        }

        else if (age > 45){

            if (temperature >= -10 && temperature <= 25){
                return  "Можно идти гулять";
            }

        }

        return "Оставайтесь дома";

    }


    public static void main(String[] args) {

        System.out.println(returnMethod(21, 28));
        System.out.println(returnMethod(11, 24));
        System.out.println(returnMethod(60, 11));
        System.out.println(returnMethod(56, -17));
        System.out.println(returnMethod(9, 14));

        System.out.println(returnMethod(generateRandomAge(), 15));
    }

    public static int generateRandomAge(){
        int randomNumberSaver;
        Random random = new Random();
        randomNumberSaver = random.nextInt(100);
        return randomNumberSaver;
    }


}