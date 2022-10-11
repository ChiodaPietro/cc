package cc;

public class Bank_guy {
    private float tot_money;
    private String name, surname;
    private int code_number;
    private MOVEMENTS[] movements;

    public Bank_guy(float tot_money, String name, String surname, int code_number, int mov_num) {
        this.tot_money = tot_money;
        this.name = name;
        this.surname = surname;
        this.code_number = code_number;
        this.movements = new MOVEMENTS[mov_num];
    }

    public void list_to_null() {
        for (int i = 0; i < movements.length; i++) {
            this.movements[i] = null;
        }
    }

    public boolean withdraw(float tot_withdraw) {
        if (tot_withdraw < tot_money) {
            tot_money = tot_money - tot_withdraw;
            return true;
        }
        return false;
    }

    public boolean imporation(float tot_import) {
        this.tot_money = this.tot_money + tot_import;
        return true;
    }

    public float getTot_money() {
        return tot_money;
    }

    public void movements(float withdraw, float imporation, float tot_money) {
        for (int i = movements.length - 2; i >= 0; i--) {
            movements[i+1] = movements[i ];
        }
        movements[0] = new MOVEMENTS(withdraw, imporation, tot_money);
    }

    public void show_moves() {
        for (int i = 0; i < movements.length; i++) {
            if (movements[i] != null) {
                System.out.println("imported in that moment: " + movements[i].getImportation() + " withdrawed in that movement: " + movements[i].getWithdraw() + " total money in that movement: " + movements[i].getTot_money());
            }
        }
    }


}