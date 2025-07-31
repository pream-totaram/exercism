class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
  @Override
  boolean isVulnerable() {
    return false;
  }

  @Override
  int getDamagePoints(Fighter fighter) {
    return fighter.isVulnerable() ? 10 : 6;
  }

  @Override
  public String toString() {
      return "Fighter is a Warrior";
  }
  
}

class Wizard extends Fighter {
  private boolean wizardIsVulnerable = true;
  private int damagePoints = 3;
  public void prepareSpell() {
    this.wizardIsVulnerable = false;
    this.damagePoints = 12;
  }

  @Override
  boolean isVulnerable() {
      return wizardIsVulnerable;
  }
  
  @Override
  int getDamagePoints(Fighter fighter) {
      return this.damagePoints;
  }

  @Override
  public String toString() {
      return "Fighter is a Wizard";
  }
}
