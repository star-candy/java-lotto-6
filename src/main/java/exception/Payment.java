package exception;

import constants.Description;

public class Payment {
    private final int payment;
    public Payment(int payment) {
        this.payment = payment;
        exceptionManager();
    }

    private void exceptionManager() {
        amountException();
        changesException();
    }

    private void amountException() {
        if (payment < 1000) {
            System.out.println(Description.PAYMENT_AMOUNT_EXCEPTION.getMessage());
            throw new IllegalArgumentException();
        }
    }

    private void changesException() {
        if (payment % 1000 != 0) {
            System.out.println(Description.CHANGES_EXCEPTION.getMessage());
            throw new IllegalArgumentException();
        }
    }
}
