package view;

import constants.Description;
public class OutputView {
    public void lottoCount(int payment) {
        int lottoCount = payment / 1000;
        System.out.printf(Description.LOTTO_COUNT.getMessage(), lottoCount);
    }
}
