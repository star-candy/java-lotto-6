package view;

import constants.Description;
import exception.Payment;
import exception.Lotto;
import exception.BonusNumber;
import model.ModifyInput;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;


public class InputView {

    public int callPayment() {
        int inputNumber;
        try {
            System.out.println(Description.CALL_PAYMENT.getMessage());
            inputNumber = Integer.parseInt(Console.readLine());
            new Payment(inputNumber);
        } catch (IllegalArgumentException e) {
            System.out.println(Description.PAYMENT_EXCEPTION.getMessage());
            return callPayment();
        }
        System.out.println(inputNumber);
        return inputNumber;
    }

    public List<Integer> callWinningNumber() {
        String inputString;
        List<Integer> inputList = new ArrayList<>();
        try {
            System.out.println(Description.CALL_WINNINGNUMBER.getMessage());
            inputString = Console.readLine();
            ModifyInput modifyInput = new ModifyInput();
            inputList = modifyInput.inputToList(inputString);
            new Lotto(inputList);
        } catch (IllegalArgumentException e) {
            System.out.println(Description.WINNING_NUMBER_EXCEPTION.getMessage());
            return callWinningNumber();
        }
        System.out.println(inputString);
        return inputList;
    }

    public int callBonusNumber() {
        int inputBonus = 0;
        try {
            System.out.println(Description.CALL_BONUSNUMBER.getMessage());
            inputBonus = Integer.parseInt(Console.readLine());
            new BonusNumber(inputBonus);

        } catch (IllegalArgumentException e) {
            System.out.println(Description.BONUS_EXCEPTION.getMessage());
            return callBonusNumber();
        }
        return inputBonus;
    }

}
