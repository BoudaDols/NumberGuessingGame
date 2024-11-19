import java.util.Scanner;

class NumberGuessingGame{

   public static void main(String[] args){
      int difficultyChoice = 0;
      int randomNumber = (int) (Math.random() * 100 + 1);
      int chances = 0;
      int attempts = 0;
      int guess = 0;
      Scanner scanner = new Scanner(System.in);
      Difficulty difficulty = new Difficulty();


      System.out.println("Welcome to the Number Guessing Game!\n" + //
                  "I'm thinking of a number between 1 and 100.");

      
      System.out.println("Please select the difficulty level:");
      System.out.println("1. Easy (10 chances)");
      System.out.println("2. Medium (5 chances)");
      System.out.println("3. Hard (3 chances)");

      System.out.println("Enter your choice: ");

      difficultyChoice = scanner.nextInt();

      while(!difficulty.checkChoice(difficultyChoice)){
         System.out.println("Bad choice. Try another number.");
         difficultyChoice = scanner.nextInt();
      }

      switch (difficultyChoice) {
         case 1:
            System.out.println("Great! You have selected the Easy difficulty level.");
            chances = 10;
            break;
         case 2:
            System.out.println("Great! You have selected the Medium difficulty level.");
            chances = 5;
            break;
         case 3:
            System.out.println("Great! You have selected the Hard difficulty level.");
            chances = 3;
            break;
         default:
            System.out.println("Bad choice. Try another number.");
      }


      do{
         System.out.println("Enter your guess: ");
         guess = scanner.nextInt();
         attempts++;

         if(guess==randomNumber){
            System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts.");
         }else if(guess<randomNumber){
            System.out.println("Incorrect! The number is more than "+guess+".");
         }else if(guess>randomNumber){
            System.out.println("Incorrect! The number is less than "+guess+".");
         }
      }while(guess!=randomNumber && attempts<chances);


      scanner.close();


   }
}