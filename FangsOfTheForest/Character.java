class Character {
    private String name;
    private int damageDealt;
    private int maxHealth;
    private int currentHealth;
    public Character(String n, int d, int m, int c){
        name = n;
        damageDealt = d;
        maxHealth = m;
        currentHealth = c;
    }

    public String getName(){
        return name;
    }

    public int getDamageDealt(){
        return damageDealt;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public int getCurrentHealth(){
        return currentHealth;
    }

    public void setName(String n){
        name = n;
    }

    public void setDamageDealt(int d){
        damageDealt = d;
    }

    public void setMaxHealth(int m){
        maxHealth = m;
    }

    public void setCurrentHealth(int c){
        currentHealth = c;
    }

    public String toString(){
        return "Name: " + getName() + " \nDammage Dealt: " + getDamageDealt() + " \nMax Health: " + getMaxHealth() + " \nCurrent Health: " + getCurrentHealth();
    }
}