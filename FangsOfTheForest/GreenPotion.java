public class GreenPotion {
    private int currentHealthBonus;
    private int maxHealthBonus;
    public GreenPotion(int c, int m){
        currentHealthBonus = c;
        maxHealthBonus = m;
    }

    public int getCurrentHealthBonus(){
        return currentHealthBonus;
    }

    public int getMaxHealthBonus(){
        return maxHealthBonus;
    }

    public void setMaxHealthBonus(int m){
        maxHealthBonus = m;
    }

    public void setCurrentHealthBonus(int c){
        currentHealthBonus = c;
    }

    public String toString(){
        return "Current Health Bonus: " + getCurrentHealthBonus() + "\nMax Health Bonus: " + getMaxHealthBonus();
    }
}