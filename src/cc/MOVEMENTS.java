package cc;

public class MOVEMENTS {
    private float withdraw;
    private float importation;
    private float tot_money;

    public MOVEMENTS(float withdraw, float importation, float tot_money) {
        this.withdraw = withdraw;
        this.importation = importation;
        this.tot_money = tot_money;
    }

    public float getWithdraw() {
        return withdraw;
    }

    public float getImportation() {
        return importation;
    }

    public float getTot_money() {
        return tot_money;
    }
}
