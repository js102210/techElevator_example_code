public class Player {

    //instance variables
    private int hp;
    private int cards;
    private HeroClass heroClass;
    private int drawsToDie = 0;
    private int fatigueDamage = 0;

//getters and setters
    public int getFatigueDamage() {
        return this.fatigueDamage;
    }

    public int getHp() {
        return this.hp;
    }
    public int getCards() {
       return this.cards;
    }
    public HeroClass getHeroClass(){
        return this.heroClass;
    }
//a player is "in fatigue" if they have less than one card
    public boolean isInFatigue() {
        return this.cards < 1;
    }

    public int getDrawsToDie() {
        return this.drawsToDie;
    }
    //drawsToDie counts how many times a Player can Draw without dying. It will not increase once the player dies.
    public void incrementDrawsToDie(){
        if(!this.isDead()){ this.drawsToDie++;}
    }
    //each time a Player Draws, they increment fatigue damage if in fatigue, and decrement cards
    public void  drawCard() {
        if (this.isInFatigue()) {
           this.fatigueDamage++;
        }
        this.cards--;
    }

    public boolean isDead() {

        return this.hp < 1;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Player(int hp, int cards){
        this.hp = hp;
        this.cards = cards;

    }

    public void healDamage () {
        this.hp += heroClass.getDamageHealedPerTurn();
    }
    public void takeDamage (int damageTaken) {
        this.hp -= damageTaken;
    }




}
