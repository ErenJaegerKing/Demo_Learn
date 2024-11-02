package designPatterns.strategy;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyB());
        salesMan.SalesManShow();
        Arrays.sort(new int[]{1,2,3});
    }
}
