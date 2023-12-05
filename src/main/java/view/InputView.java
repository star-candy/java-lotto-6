package view;

import constants.Description;
import exception.Payment;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public int callPayment () {
        int inputNumber = 0;
        try {
            System.out.println(Description.CALL_PAYMENT.getMessage());
            inputNumber = Integer.parseInt(Console.readLine());
            Payment payment = new Payment(inputNumber);
        } catch (IllegalArgumentException e) {
            System.out.println(Description.PAYMENT_EXCEPTION.getMessage());
            return callPayment();
        }
        System.out.println(inputNumber);
        return inputNumber;
    }
}
