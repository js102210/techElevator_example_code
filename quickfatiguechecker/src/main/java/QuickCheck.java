

import java.util.Scanner;

public class QuickCheck {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        //prompt user for inputs
        System.out.println("-----Note that calculations assume you (p1) are the active player and that you have already used your hero power this turn (if you're going to)-----");
        System.out.println("For full prompts (recommended for first use), just press enter (without typing anything)");
        System.out.println("Enter p1 hp, p1 cards, p2 hp, p2 cards (separated by spaces):  ");
        String numbers = input.nextLine();
        String[] numbersArray = numbers.split(" ");
        // if full inputs are not provided, quick version is aborted and full prompts are delivered
        boolean isQuick = !(numbersArray.length < 4);
        System.out.println("Enter Your Class and your opponent's Class separated by a / (ex: Warrior/Druid)" );
        //set both player's classes to INVALID and take input
        String classes = input.nextLine();
        String[] classArray = classes.split("/");
        String p1ClassString = classArray[0].toLowerCase();
        HeroClass p1Class = HeroClass.INVALID;
        String p2ClassString = classArray[1].toLowerCase();
        HeroClass p2Class = HeroClass.INVALID;
        // read input and compare to HeroClass names, if they don't match a hero class (case and space insensitive),
        // they will remain INVALID and program aborts with error message
        for (HeroClass entry : HeroClass.values()) {
            if (entry.isClass(p1ClassString)){
                p1Class = entry;
            }
            if (entry.isClass(p2ClassString)){
                p2Class = entry;
            }
        }
        //create player objects, set hp and cards to 0, set class to result of array check above
        Player p1 = new Player(0, 0);
        Player p2 = new Player(0, 0);
        p1.setHeroClass(p1Class);
        p2.setHeroClass(p2Class);
        String result = "Please ensure hero classes for both players are spelled correctly.";

        if(p1.getHeroClass() != HeroClass.INVALID && p2.getHeroClass() != HeroClass.INVALID) {
            int p1Health;
            int p1Cards;
            int p2Health;
            int p2Cards;
            //check to see if user selected quick version or full prompts
            if (!isQuick) {
                //prompt user for relevant values, parse to ints
                System.out.println("How much hp do you have (including armor)? : ");
                String response = input.nextLine();
                p1Health = Integer.parseInt(response);
                System.out.println("How many cards do you have left in draw pile? : ");
                response = input.nextLine();
                p1Cards = Integer.parseInt(response);
                System.out.println("How much hp does your opponent have (including armor)? : ");
                response = input.nextLine();
                p2Health = Integer.parseInt(response);
                System.out.println("How many cards does your opponent have left in draw pile? : ");
                response = input.nextLine();
                p2Cards = Integer.parseInt(response);

                // set Player hp and cards per user input
                p1.setHp(p1Health);
                p1.setCards(p1Cards);

                p2.setHp(p2Health);
                p2.setCards(p2Cards);
            } else {

                //reference int[] (populated by user input) to set hp and cards for Players
                p1.setHp(Integer.parseInt(numbersArray[0]));
                p1.setCards(Integer.parseInt(numbersArray[1]));

                p2.setHp(Integer.parseInt(numbersArray[2]));
                p2.setCards(Integer.parseInt(numbersArray[3]));

            }
                //run checker with Player values, reference isQuick for relevant output, print result
                result = new ObjectCalc().checker(p1, p2, isQuick);

        }
        System.out.println(result);

    }

}
