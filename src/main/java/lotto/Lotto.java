package lotto;

import java.util.List;
import java.util.function.Function;

enum LottoGrade{
    A("6개 일치 (2,000,000,000원)", x -> x * 2000000000L),
    B("5개 일치, 보너스 볼 일치 (30,000,000원)", x -> x * 30000000L),
    C("5개 일치 (1,5000,000원)", x -> x * 1500000L),
    D("4개 일치 (50,000원)", x -> x * 50000L),
    E("3개 일치 (5,000원)", x -> x * 5000L);

    private String printText;
    private Function<Integer, Long> expression;

    LottoGrade(String text, Function<Integer, Long> expression){
        this.printText = text;
        this.expression = expression;
    }

    public String toString(int count){
        return printText + " - " + count;
    }

    public long calcBenefit(int count){
        return expression.apply(count);
    }
}

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
}
