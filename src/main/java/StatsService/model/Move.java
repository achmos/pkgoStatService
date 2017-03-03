package StatsService.model;

/**
 * Created by Ramin on 11/28/2016.
 */
public class Move {
    private String name;
    private int power;
    private MoveType moveType;

    private double accuracyChance;
    private double criticalChance; //charge moves only...
    private double staminaLossScalar;
    private int trainerLevelMin;
    private int trainerLevelMax;
    private int energyDelta;

    //following variables in milliseconds
    private int duration;
    private int damageWindowStart;
    private int damageWindowEnd;

    public Move(String name, int power, MoveType moveType, double accuracyChance, double criticalChance, double staminaLossScalar, int trainerLevelMin, int trainerLevelMax, int energyDelta, int duration, int damageWindowStart, int damageWindowEnd) {
        this.name = name;
        this.power = power;
        this.moveType = moveType;
        this.accuracyChance = accuracyChance;
        this.criticalChance = criticalChance;
        this.staminaLossScalar = staminaLossScalar;
        this.trainerLevelMin = trainerLevelMin;
        this.trainerLevelMax = trainerLevelMax;
        this.energyDelta = energyDelta;
        this.duration = duration;
        this.damageWindowStart = damageWindowStart;
        this.damageWindowEnd = damageWindowEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public double getAccuracyChance() {
        return accuracyChance;
    }

    public void setAccuracyChance(double accuracyChance) {
        this.accuracyChance = accuracyChance;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public double getStaminaLossScalar() {
        return staminaLossScalar;
    }

    public void setStaminaLossScalar(double staminaLossScalar) {
        this.staminaLossScalar = staminaLossScalar;
    }

    public int getTrainerLevelMin() {
        return trainerLevelMin;
    }

    public void setTrainerLevelMin(int trainerLevelMin) {
        this.trainerLevelMin = trainerLevelMin;
    }

    public int getTrainerLevelMax() {
        return trainerLevelMax;
    }

    public void setTrainerLevelMax(int trainerLevelMax) {
        this.trainerLevelMax = trainerLevelMax;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDamageWindowStart() {
        return damageWindowStart;
    }

    public void setDamageWindowStart(int damageWindowStart) {
        this.damageWindowStart = damageWindowStart;
    }

    public int getDamageWindowEnd() {
        return damageWindowEnd;
    }

    public void setDamageWindowEnd(int damageWindowEnd) {
        this.damageWindowEnd = damageWindowEnd;
    }

    public int getEnergyDelta() {
        return energyDelta;
    }

    public void setEnergyDelta(int energyDelta) {
        this.energyDelta = energyDelta;
    }

    enum MoveType {
        QUICK,
        CHARGE;
    }
}