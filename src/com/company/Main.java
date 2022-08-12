package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.deposit(20000.00);
        while (true) {
            try {
                user.withDraw(6000);
            } catch (LimitException e) {
                try {
                    user.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;
            }
        }
    }
}
