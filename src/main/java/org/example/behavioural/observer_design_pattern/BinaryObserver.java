package org.example.behavioural.observer_design_pattern;

/**
 * @TimeStamp 2023-11-08 21:26
 * @ProjectDetails design_patterns
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}