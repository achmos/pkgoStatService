package StatsService.model;

/**
 * Created by Ramin on 12/6/2016.
 */
public enum PkmStatType {
    BASE_ATTACK("baseAttack"),
    BASE_DEFENSE("baseDefense"),
    BASE_STAMINA("baseStamina");

    private String name;

    PkmStatType(String str) {
        this.name = str;
    }

    public String getName() {
        return name;
    }
}
