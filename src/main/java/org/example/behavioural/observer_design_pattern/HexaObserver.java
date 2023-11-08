package org.example.behavioural.observer_design_pattern;

/**
 * @TimeStamp 2023-11-08 21:27
 * @ProjectDetails design_patterns
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}