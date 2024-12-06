package AoC;

public class Main {
    public static void main(String[] args) {
        AoCContext context = new AoCContext();

        int day = 1;

        switch (day){
            case 1:
                context.setStrategy(new AoC.days.Day1());
                break;
            case 2:
                context.setStrategy(new AoC.days.Day2());
                break;
            case 3:
                context.setStrategy(new AoC.days.Day3());
                break;
            case 4:
                context.setStrategy(new AoC.days.Day4());
                break;
            case 5:
                context.setStrategy(new AoC.days.Day5());
                break;
            case 6:
                context.setStrategy(new AoC.days.Day6());
                break;
            case 7:
                context.setStrategy(new AoC.days.Day7());
                break;
            case 8:
                context.setStrategy(new AoC.days.Day8());
                break;
            case 9:
                context.setStrategy(new AoC.days.Day9());
                break;
            case 10:
                context.setStrategy(new AoC.days.Day10());
                break;
            case 11:
                context.setStrategy(new AoC.days.Day11());
                break;
            case 12:
                context.setStrategy(new AoC.days.Day12());
                break;
            case 13:
                context.setStrategy(new AoC.days.Day13());
                break;
            case 14:
                context.setStrategy(new AoC.days.Day14());
                break;
            case 15:
                context.setStrategy(new AoC.days.Day15());
                break;
            case 16:
                context.setStrategy(new AoC.days.Day16());
                break;
            case 17:
                context.setStrategy(new AoC.days.Day17());
                break;
            case 18:
                context.setStrategy(new AoC.days.Day18());
                break;
            case 19:
                context.setStrategy(new AoC.days.Day19());
                break;
            case 20:
                context.setStrategy(new AoC.days.Day20());
                break;
            case 21:
                context.setStrategy(new AoC.days.Day21());
                break;
            case 22:
                context.setStrategy(new AoC.days.Day22());
                break;
            case 23:
                context.setStrategy(new AoC.days.Day23());
                break;
            case 24:
                context.setStrategy(new AoC.days.Day24());
                break;
            default:
                System.out.println("Day not part of the advent of code");
                return;
        }

        System.out.println("Day " + day);
        System.out.println("Solution 1:\n" + context.solvePart1());
        System.out.println("Solution 2:\n" + context.solvePart2());
    }
}
