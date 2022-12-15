package testrunners;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        System.out.println();
    }


    public static String randomEmail(){
        Random rand = new Random();
        int n = rand.nextInt(50);
        String email = "email" + n +"@email.com";
        System.out.println(email);
        return email;
    }
}
