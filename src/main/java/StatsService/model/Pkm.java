package StatsService.model;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ramin on 11/28/2016.
 */
public class Pkm {
    @Id @NotNull
    private int dexNumber;
    @NotNull
    private String name;
    @NotNull @Size(min=3, max=3)
    private HashMap<String,Integer> stats;
    @NotNull @Size(min=1, max=2)
    private List<Type> types;
    @NotNull @Size(min=1)
    private List<String> quickMoves;
    @NotNull @Size(min=1)
    private List<String> chargeMoves;
    @NotNull
    private String familyId;
    @NotNull
    private BuddySize buddySize;

    public Pkm() {
    }

    public Pkm(int dexNumber, String name, HashMap<String, Integer> stats, List<Type> types, List<String> quickMoves, List<String> chargeMoves, String familyId, BuddySize buddySize) {

        this.dexNumber = dexNumber;
        this.name = name;
        this.stats = stats;
        this.types = types;
        this.quickMoves = quickMoves;
        this.chargeMoves = chargeMoves;
        this.familyId = familyId;
        this.buddySize = buddySize;
    }

    public int getDexNumber() {
        return dexNumber;
    }

    public void setDexNumber(int dexNumber) {
        this.dexNumber = dexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<String, Integer> stats) {
        this.stats = stats;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<String> getQuickMoves() {
        return quickMoves;
    }

    public void setQuickMoves(List<String> quickMoves) {
        this.quickMoves = quickMoves;
    }

    public List<String> getChargeMoves() {
        return chargeMoves;
    }

    public void setChargeMoves(List<String> chargeMoves) {
        this.chargeMoves = chargeMoves;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public BuddySize getBuddySize() {
        return buddySize;
    }

    public void setBuddySize(BuddySize buddySize) {
        this.buddySize = buddySize;
    }

    @Override
    public String toString() {
        return "Pkm{" +
                "dexNumber=" + dexNumber +
                ", name='" + name + '\'' +
                ", stats=" + stats +
                ", types=" + types +
                ", quickMoves=" + quickMoves +
                ", chargeMoves=" + chargeMoves +
                ", familyId='" + familyId + '\'' +
                ", buddySize=" + buddySize +
                '}';
    }
}

//class Stats {
//    private int baseAttack;
//    private int baseDefense;
//    private int baseStamina;
//
//    public int getBaseAttack() {
//        return baseAttack;
//    }
//
//    public void setBaseAttack(int baseAttack) {
//        this.baseAttack = baseAttack;
//    }
//
//    public int getBaseDefense() {
//        return baseDefense;
//    }
//
//    public void setBaseDefense(int baseDefense) {
//        this.baseDefense = baseDefense;
//    }
//
//    public int getBaseStamina() {
//        return baseStamina;
//    }
//
//    public void setBaseStamina(int baseStamina) {
//        this.baseStamina = baseStamina;
//    }
//
//    @Override
//    public String toString() {
//        return "Stats{" +
//                "baseAttack=" + baseAttack +
//                ", baseDefense=" + baseDefense +
//                ", baseStamina=" + baseStamina +
//                '}';
//    }
//}

//{"dexNumber":107,"name":"HITMONCHAN","types":["FIGHTING"],"stats":{"baseStamina":100,"baseAttack":138,"baseDefense":204},"quickMoves":["BULLET PUNCH", "ROCK SMASH"],"chargeMoves":["FIRE_PUNCH","ICE_PUNCH","THUNDER_PUNCH","BRICK_BREAK"],"familyId":"FAMILY_HITMONCHAN","buddySize":"BIG"}