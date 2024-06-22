import java.util.Scanner;
import java.util.Random;

public class Main
{
    static Scanner input = new Scanner(System.in);
    static MainCharacter player = new MainCharacter("John", 10, 150, 150, 12);
    static Monster wolf = new Monster("Wolf", 5, 20, 15, "Carnivor");
    static SilverSword sword = new SilverSword(20, 20);
    static GreenPotion potion = new GreenPotion(20, 40);
    static Werewolf werewolf = new Werewolf("Werewolf", 10, 60, 60, "Nightcrawler");

    static Random rand = new Random();

    public static void checkFightResults(){
        if (player.getCurrentHealth()>0){
            System.out.println("You won the fight.\n");
        } else {
            System.out.println("You lost the fight\n");
            System.exit(0);
        }
    }

    public static void wolfFight(){
        do {
            System.out.println("\nThe enemy attacks you and deals " + String.valueOf(wolf.getDamageDealt()) + " dammage. Your current health is " + String.valueOf(player.getCurrentHealth()-5) + " while the enemy's is " + String.valueOf(wolf.getCurrentHealth()));
            player.setCurrentHealth(player.getCurrentHealth()-wolf.getDamageDealt());
            System.out.println("\nYour turn. Attack to the <Left> or the <Right>?");
            String attackSide = input.nextLine();
            int dodgeDir = rand.nextInt(2);
            if (attackSide.toLowerCase().equals("left") && dodgeDir == 0){
                System.out.println("\nGot It.\n");
                wolf.setCurrentHealth(wolf.getCurrentHealth()-player.getDamageDealt());
            } else if (attackSide.toLowerCase().equals("right") && dodgeDir == 1){
                wolf.setCurrentHealth(wolf.getCurrentHealth()-player.getDamageDealt());
                System.out.println("\nGot it.\n");
            } else {
                System.out.println("\nMissed.\n");
            }
        } while (player.getCurrentHealth()>0 && wolf.getCurrentHealth()>0);
        checkFightResults();
        statCheck();
    }

    public static void statCheck(){
        if (player.getCurrentHealth()>player.getMaxHealth()){
            player.setCurrentHealth(player.getMaxHealth());
        }
        System.out.print("\n\nWould you like to check on your stats? (Y/N): ");
        String checkChoice01 = input.next();
        if (checkChoice01.toLowerCase().equals("y")){
            System.out.println(player.toString());
        } else {
            System.out.println("\n\nYou will get another opportunity to do so soon. ");
        }
    }

    public static void werewolfFight(){
        do {
            System.out.println("\n\nThe enemy attacks you and deals " + String.valueOf(werewolf.getDamageDealt()) + " dammage. Your current health is " + String.valueOf(player.getCurrentHealth()-werewolf.getDamageDealt()) + " while the enemy's is " + String.valueOf(werewolf.getCurrentHealth()));
            player.setCurrentHealth(player.getCurrentHealth()-werewolf.getDamageDealt());
            System.out.println("\n\nYour turn. Attack to the <Left> or the <Right>?");
            String attackSide = input.nextLine();
            int dodgeDir = rand.nextInt(2);
            if (attackSide.toLowerCase().equals("left") && dodgeDir == 0){
                System.out.println("\n\nGot It.\n");
                werewolf.setCurrentHealth(werewolf.getCurrentHealth()-player.getDamageDealt());
            } else if (attackSide.toLowerCase().equals("right") && dodgeDir == 1){
                werewolf.setCurrentHealth(werewolf.getCurrentHealth()-player.getDamageDealt());
                System.out.println("\n\nGot it.\n");
            } else {
                System.out.println("\n\nMissed.\n");
            }
        } while (player.getCurrentHealth()>0 && werewolf.getCurrentHealth()>0);
        checkFightResults();
        statCheck();
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to \"An Unexpected Hike\", you play as John, a teenager who got lost after he seperated from his friend group during a hike.\n");
        System.out.println("You woke up to the sound of a howl after what felt like mere minutes of sleep, although it was still night time, you decide to try to find your way back to your friends before they get too far.\n");
        System.out.println("You walk forward for a few minutes when you see something moving in the distance, you get closer and realize that it's a wolf, and to make things worse, it saw you.\n");
        System.out.println("*Quick tutorial*: The combat in this game is turn-based. The enemy will attack you with a chance to either hit or miss, but then you will have the opporunity to counter with an attack of your own, to do this you must anticipate wether the enemy is going to dodge left or right. Good luck and have fun :)\n");
        wolfFight();
        System.out.println("\n\nThis is where you encounter your first choice, do you:\n\na) take the left path, which seems to have more recent footprints, although you cannot figure out whose they are due to the rain from hours before\n\nb)take the path on the right, that being the overall more often used one\n\n");
        String pathChoice = input.next();
        switch (pathChoice){
            case "A": case "a": case "a)":
                System.out.print("\n\nYou notice a green shine at the top of a tree, and decide to climb up and find out what it is. Upon reaching the top, you find it to be a mysterious potion. You drink it.\n");
                System.out.println("\n\n------------------------------------\nNEW ITEM UNLOCKED: GREEN HEALTH POTION\n" + potion.toString());
                break;
            case "B": case "b": case "b)":
                System.out.print("\n\nYou see something shining in the distance so you decide to get closer. The more you walk, the more clear it is that you have just found a silver sword near an old corpse. You ask yourself \"What was able to kill this guy, was it wolves like the one I just fought?\" but you decide to pick it up and continue just in case.\n");
                System.out.println("\n\n------------------------------------\nNEW ITEM UNLOCKED: SILVER SWORD\n" + sword.toString());
                break;
            default:
                System.out.print("\n\nUnexpected Result.");
                System.exit(0);
        }    

        System.out.println("-------------------------------------------------\n\nHours later, you come across recent big steps, you assume that they're your friend Josh's steps since he wears size 13. You proceed to eagerly follow the steps, only to be met by a Werewolf. And not any werewolf, THE \"" + werewolf.getLegendName() + "\".");
        System.out.print("\n\nDo you want to equip your item? (Y/N): ");
        String itemChoice = input.next();
        switch (itemChoice.toLowerCase()){
            case "y":
                if (pathChoice.equals("B") || pathChoice.equals("b") || pathChoice.equals("b)")){
                    System.out.print("\n\nThe sword you just equipped increases your damage dealt by 20 but reduces your max health by 20.");
                    player.setDamageDealt(player.getDamageDealt()+sword.getDamageBonus());
                    player.setMaxHealth(player.getMaxHealth()-sword.getMaxHealthReduction());
                } else if (pathChoice.equals("A") || pathChoice.equals("a") || pathChoice.equals("a)")){
                    System.out.print("\n\nThe potion you just equipped increases your max health dealt by 40 and increases your current health by 40.");
                    player.setMaxHealth(player.getMaxHealth()+potion.getMaxHealthBonus());
                    player.setCurrentHealth(player.getCurrentHealth()+potion.getCurrentHealthBonus());
                }
                break;
            case "n":
                System.out.print("\n\nNo Items Currently Equipped. You should've said yes >:)");
                break;
        }

        statCheck();
        werewolfFight();

        System.out.print("The werewolf turns back into a human as he goes down, and as the sun rises and illuminates his corpse, you get a better view of him and realize... It's Josh.\n\nYou won the fight against the werewolf, but at what cost?\n\n\nTO BE CONTINUED...");



    }
}