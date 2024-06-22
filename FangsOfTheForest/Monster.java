class Monster extends Character{
    private String monsterType;

    public Monster(){
        super("None", 0, 0, 0);
    }

    public Monster(String n, int d, int m, int c, String t){
        super(n, d, m, c);
        monsterType = t;
    }

    public String getMonsterType(){
        return monsterType;
    }

    public void setMonsterType(String t){
        monsterType = t;
    }

    public String toString(){
        return "Name: " + getName() + "\nDamage Dealt: " + getDamageDealt() + "\nCurrent Health: " + getCurrentHealth() + "\nMaximum Health: " + getMaxHealth() + "\nMonster Type: " + getMonsterType();
    }
}