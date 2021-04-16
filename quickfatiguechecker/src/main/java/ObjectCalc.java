public class ObjectCalc {
    public void calculateDrawsToDie(Player p1, Player p2) {
        //set turn count to 1 and have players TakeTurn until both are dead, increment turn count each time
        int turnCount = 1;


        while (!p1.isDead() || !p2.isDead()) {

            if (turnCount % 2 == 0) {
                takeTurn(p1, p2);
            } else {
                takeTurn(p2, p1);
            }
            turnCount++;

        }
    }

    private void takeTurn(Player player, Player opponent) {
        //turn consists of incrementing drawsToDie (metric for who's "ahead"), drawing a card, taking fatigue damage
        // (if applicable), then dealing and healing damage if still alive.
        player.incrementDrawsToDie();
        player.drawCard();
        //nothing in this program can cause a player to exit fatigue, as it doesn't handle anything that would add cards
        //however, such effects do exist, and if this app is ever to track them, will need to add a check that cards <= 0
        //before taking fatigue damage
        player.takeDamage(player.getFatigueDamage());
        if (!player.isDead()) {
            player.healDamage();
            opponent.takeDamage(player.getHeroClass().getDamageDealtPerTurn());
        }
    }

    public String checker(Player p1, Player p2, boolean isQuick) {
       //run calculateDrawsToDie() and reference values in Player objects. Print relevant string for isQuick/full prompts
        String result;
        calculateDrawsToDie(p1, p2);
        if (isQuick) {
            result = "Your draws to die: " + p1.getDrawsToDie() + " Opponent draws to die: " + p2.getDrawsToDie();
        } else {
            if (p1.getDrawsToDie() > p2.getDrawsToDie()) {
                result = "You are ahead in fatigue. You die to fatigue in " + p1.getDrawsToDie() + " draws. Your opponent dies to fatigue in " + p2.getDrawsToDie() + " draws";

            } else {
                result = "Your opponent is ahead in fatigue. Your opponent dies to fatigue in " + p2.getDrawsToDie() + " draws. You die to fatigue in " + p1.getDrawsToDie() + " draws.";
            }
        }
        return result;
    }

}



