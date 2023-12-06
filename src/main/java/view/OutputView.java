package view;

import constants.Description;
import java.util.List;

public class OutputView {
    public void lottoCount(int payment) {
        int lottoCount = payment / 1000;
        System.out.printf(Description.LOTTO_COUNT.getMessage(), lottoCount);
    }

    public void lottoStatic(List<Integer> winningStatics) {
        System.out.printf(Description.WINNING_STATICS.getMessage(),
                winningStatics.get(0), winningStatics.get(1), winningStatics.get(2), winningStatics.get(3));
    }
}
