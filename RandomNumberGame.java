import java.util.Random; 

public class RandomNumberGame {
    
    public static void main() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100) + 1;
        System.out.println("The generated random number is: " + randomNumber);
        if (randomNumber > 50) {
            System.out.println("That is a high number! You are lucky!");
        } else {
            System.out.println("That is a low number! Better luck next time!");
        }
    }
}
