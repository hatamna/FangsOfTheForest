public class SilverSword {
    private int damageBonus;
    private int maxHealthReduction;
    public SilverSword(int d, int m){
        damageBonus = d;
        maxHealthReduction = m;
    }

    public int getDamageBonus(){
        return damageBonus;
    }

    public int getMaxHealthReduction(){
        return maxHealthReduction;
    }

    public void setDamageBonus(int d){
        damageBonus = d;
    }

    public void setMaxHealthReduction(int m){
        maxHealthReduction = m;
    }

    public String toString(){
        return "Damage Bonus: " + getDamageBonus() + "\nMax Health Reduction: " + getMaxHealthReduction();
    }
}