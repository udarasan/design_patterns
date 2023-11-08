package org.example.creational.singleton_design_pattern;

/**
 * @TimeStamp 2023-11-08 15:52
 * @ProjectDetails design_patterns
 */
public class SingletonDemo {
    public static void main(String[] args) {

        //SingletonObject object1=new SingletonObject();

        SingletonObject object2= SingletonObject.getInstance();
        object2.showMessage();
    }
}
