package org.example.behavioural.observer_design_pattern;

/**
 * @TimeStamp 2023-11-08 21:27
 * @ProjectDetails design_patterns
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}