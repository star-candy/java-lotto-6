package exception;

import constants.Description;

public class BonusNumber {
    private final int bonusNumber;
    public BonusNumber(int bonusNumber) {
        this.bonusNumber = bonusNumber;
        validateLength();
    }
    private void validateLength() {
        if(bonusNumber < 1 || bonusNumber > 45) {
            System.out.println(Description.NUMBER_LENGTH_EXCEPTION.getMessage());
            throw new IllegalArgumentException();
        }
    }
}
