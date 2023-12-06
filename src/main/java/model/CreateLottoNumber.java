package model;

import camp.nextstep.edu.missionutils.Randoms;
import exception.Lotto;
import java.util.ArrayList;
import java.util.List;

public class CreateLottoNumber {
    public List<List<Integer>> createLottoNumber(int payment) {
        int lottoCount = payment / 1000;
        List<List<Integer>> lottoLists = new ArrayList<>();
        try {
            for (int i = 0; i < lottoCount; i++) {
                List<Integer> lottoList = Randoms.pickUniqueNumbersInRange(1, 45, 6);
                new Lotto(lottoList);
                lottoLists.add(lottoList);
            }
        } catch (IllegalArgumentException e) {
            return createLottoNumber(payment);
        }
        return lottoLists;
    }
}
