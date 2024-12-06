package gernotluidolt;

import gernotluidolt.DayStrategy;

public class AoCContext {
    private DayStrategy strategy;

    public void setStrategy(DayStrategy strategy) {
        this.strategy = strategy;
    }

    public String solvePart1() {
        return strategy.solvePart1();
    }

    public String solvePart2() {
        return strategy.solvePart2();
    }
}
