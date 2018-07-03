/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImperialUnits;

import jimenezfinalexam.Location;

/**
 *
 * @author 15129131
 */
public class ImperialWalkerUnit {
     private String WUID;
    private ImperialBattleGroup BattleGroup;
  private Location Position;
    public ImperialWalkerUnit(String WUID, ImperialBattleGroup BattleGroup, Location Position) {
        this.WUID = WUID;
        this.BattleGroup = BattleGroup;
        this.Position = Position;
    }

    public String getWUID() {
        return WUID;
    }

    public void setWUID(String WUID) {
        this.WUID = WUID;
    }

    public ImperialBattleGroup getBattleGroup() {
        return BattleGroup;
    }

    public void setBattleGroup(ImperialBattleGroup BattleGroup) {
        this.BattleGroup = BattleGroup;
    }

    public Location getPosition() {
        return Position;
    }

    public void setPosition(Location Position) {
        this.Position = Position;
    }
  
}
