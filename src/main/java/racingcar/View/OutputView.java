package racingcar.View;

public class OutputView {

    private static final String GET_CAR_NAMES_MSG
            = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String GET_TRY_COUNTS_MSG
            = "시도할 회수는 몇회인가요?";
    private static final String RACE_PROGRESS_MSG
            = "실행 결과";
    private static final String FINAL_WINNER_MSG
            = "최종 우승자 : ";

    public static void printGetCarNamesMsg() {
        System.out.println(GET_CAR_NAMES_MSG);
    }

    public static void printGetTryCountMsg() {
        System.out.println(GET_TRY_COUNTS_MSG);
    }

    public static void printRaceProgressMsg() {
        System.out.println(RACE_PROGRESS_MSG);
    }

    public static void printFinalWinnerMsg() {
        System.out.println(FINAL_WINNER_MSG);
    }

    public static void printRaceProgress() {

    }

    public static void printFinalWinner() {

    }
}
