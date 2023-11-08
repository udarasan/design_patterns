package org.example.behavioural.strategy_design_pattern;

/**
 * @TimeStamp 2023-11-08 18:28
 * @ProjectDetails design_patterns
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
