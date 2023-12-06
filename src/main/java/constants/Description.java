package constants;

public enum Description {
    CALL_PAYMENT("구입금액을 입력해 주세요."),//printf 사용시 \n으로 줄바꿈 필요
    LOTTO_COUNT("%d개를 구매했습니다.\n"),
    CALL_WINNINGNUMBER("당첨 번호를 입력해 주세요."),
    CALL_BONUSNUMBER("보너스 번호를 입력해 주세요."),
    WINNING_STATICS("""
            당첨 통계
            ---
            3개 일치 (5,000원) - %d개
            4개 일치 (50,000원) -%d개
            5개 일치 (1,500,000원) - %d개5개 일치, 보너스 볼 일치 (30,000,000원) - %d개
            6개 일치 (2,000,000,000원) - %d개
            
            """),
    TOTAL_RETURN("총 수익률은 %.1f%%입니다."),
    BONUS_EXCEPTION("[ERROR] 보너스 번호는 1개의 숫자여야 합니다."),
    PAYMENT_EXCEPTION("[ERROR] 구입금액에는 숫자가 입력되어야 합니다. 다시 입력해주세요."),
    PAYMENT_AMOUNT_EXCEPTION("[ERROR] 구입금액은 1000원 이상이어야 합니다."),
    CHANGES_EXCEPTION("[ERROR] 1000원 단위로 구입하실 수 있습니다."),
    WINNING_NUMBER_EXCEPTION("[ERROR] 입력된 번호에 오류가 있습니다 다시 입력해주세요."),
    NUMBER_SPLIT_EXCEPTION("[ERROR] 쉼표로 구분되는 숫자가 입력되어야 합니다."),
    NUMBER_SIZE_EXCEPTION("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다."),
    NUMBER_LENGTH_EXCEPTION("[ERROR] 로또 번호는 6자리의 숫자여야 합니다."),
    NUMBER_DUPLICATE_EXCEPTION("[ERROR] 로또 번호는 중복 될 수 없습니다.");

    private final String message;

    Description(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
