package org.example.behavioural.strategy_design_pattern;

/**
 * @TimeStamp 2023-11-08 18:26
 * @ProjectDetails design_patterns
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}