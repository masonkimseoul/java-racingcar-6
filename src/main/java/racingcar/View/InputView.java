package racingcar.View;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final int MINIMUM_TRY_COUNT = 1;

    public static String getCarNamesString() {
        String carNames = Console.readLine();

        if (carNames.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 한 글자 이상 입력하셔야 합니다.");
        }

        return carNames;
    }

    public static int getTryCount() {
        int tryCount;

        try {
            tryCount = Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }

        if (tryCount < MINIMUM_TRY_COUNT) {
            throw new IllegalArgumentException("시도 횟수는 " + MINIMUM_TRY_COUNT + "회 이상이어야 합니다.");
        }

        return tryCount;
    }
}
