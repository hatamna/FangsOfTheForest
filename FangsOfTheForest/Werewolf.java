class Werewolf extends Monster {

  private String legendName;

  public Werewolf() {
    super("None", 0, 0, 0, "Legend");
  }

  public Werewolf(String n, int d, int m, int c, String l) {
    super(n, d, m, c, l);
    legendName = l;
  }

  public String getLegendName() {
    return legendName;
  }

  public void setLegendName(String l) {
    legendName = l;
  }

  public String toString() {
    return "Name: " + getName() + "\nDamage Dealt: " + getDamageDealt() + "\nCurrent Health: " + getCurrentHealth()
        + "\nMaximum Health: " + getMaxHealth() + "\nMonster Type: " + getMonsterType() + "\nLegend Name: "
        + getLegendName();
  }
}