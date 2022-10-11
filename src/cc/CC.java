package cc;

import java.util.Scanner;

public class CC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_guy guy = new Bank_guy(0, "joe", "fazer", 15829, 5);
        guy.list_to_null();
        while (true) {
            String choice = sc.next();
            switch (choice) {
                case "import":
                    System.out.println("how much?");
                    float importation = sc.nextFloat();
                    guy.imporation(importation);
                    guy.movements(0, importation, guy.getTot_money());
                    break;
                case "withdraw":
                    System.out.println("how much?");
                    float withdraw = sc.nextFloat();
                    if (guy.withdraw(withdraw)) {
                        System.out.println("the withdraw happened succesfully");
                        guy.movements(withdraw, 0, guy.getTot_money());
                    } else {
                        System.out.println("i am sorry but you don't have that much money");
                    }
                    break;
                case "show":
                    System.out.println(guy.getTot_money());
                    break;
                case "moves":
                    guy.show_moves();
            }
        }
    }
}