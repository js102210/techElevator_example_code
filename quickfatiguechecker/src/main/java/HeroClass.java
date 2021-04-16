import java.util.ArrayList;


public enum HeroClass {
    //each class contains an amount dealt/healed by hero power, and a display name
    DEMON_HUNTER( 0, 1, "Demon Hunter"),
    DRUID(1, 1, "Druid"),
    HUNTER(0, 2, "Hunter"),
    MAGE(0, 1, "Mage"),
    PALADIN(0, 0, "Paladin"),
    PRIEST(0, 2, "Priest"),
    ROGUE(0, 1, "Rogue"),
    SHAMAN(0, 0, "Shaman"),
    WARLOCK(0, 0, "Warlock"),
    WARRIOR(2, 0, "Warrior"),
    INVALID(0,0,"Invalid");

   private final int damageHealedPerTurn;
   private final int damageDealtPerTurn;
   private final String displayName;
   //list allows for "aliases" to be added as valid class inputs if relevant
   private final ArrayList<String> identifiers;


    HeroClass(int damageHealedPerTurn, int damageDealtPerTurn, String displayName) {

        this.damageHealedPerTurn = damageHealedPerTurn;
        this.damageDealtPerTurn = damageDealtPerTurn;
        this.displayName = displayName;
        this.identifiers = new ArrayList<String>();
        this.identifiers.add(this.normalizeClassName(displayName));

    }

    public ArrayList<String> getIdentifiers() {
        return this.identifiers;
    }

    public int getDamageHealedPerTurn(){
        return this.damageHealedPerTurn;
    }

    public int getDamageDealtPerTurn() {
        return this.damageDealtPerTurn;
    }

    public String getDisplayName(){return this.displayName;}

    private String normalizeClassName(String input) {
      return input.toLowerCase().replaceAll("\\s", "");

    }

    public boolean isClass(String input) {
        input = this.normalizeClassName(input);

        return this.identifiers.contains(input);
    }


    @Override
    public String toString() {
        return this.displayName;
    }

}
