class MainCharacter extends Character{
    private int points;
    public MainCharacter(String n, int d, int m, int c, int p){
        super(n, d, m, c);
        points = p;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int p){
        points = p;
    }

    public String toString(){
        return "Name: " + getName() + " \nDammage Dealt: " + getDamageDealt() + " \nMax Health: " + getMaxHealth() + " \nCurrent Health: " + getCurrentHealth() + " \nPoints: " + getPoints();
    }
}