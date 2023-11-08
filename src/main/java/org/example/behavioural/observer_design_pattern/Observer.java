package org.example.behavioural.observer_design_pattern;

/**
 * @TimeStamp 2023-11-08 21:26
 * @ProjectDetails design_patterns
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
