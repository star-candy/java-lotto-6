package lotto;

import controller.LottoManager;

public class Application {
    public static void main(String[] args) {
        LottoManager lottoManager = new LottoManager();
        lottoManager.lottoStart();
    }
}
