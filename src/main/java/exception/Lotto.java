package exception;

import java.util.HashSet;
import java.util.List;
import constants.Description;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
        validateSize();
        validateLength();
        validateDuplicate();

    }

    private void validateSize() {
        if (numbers.size() != 6) {
            System.out.println(Description.NUMBER_SIZE_EXCEPTION.getMessage());
            throw new IllegalArgumentException();
        }
    }

    private void validateLength() {
        for(int index : numbers) {
            if(index > 45 || index < 1) {
                System.out.println(Description.NUMBER_LENGTH_EXCEPTION.getMessage());
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateDuplicate() {
        Set<Integer> uniqueSet = new HashSet<>();
        for (Integer value : numbers) {
            if (!uniqueSet.add(value)) {
                System.out.println(Description.NUMBER_DUPLICATE_EXCEPTION.getMessage());
                throw new IllegalArgumentException();
            }
        }
    }
}
