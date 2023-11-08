package org.example.creational.singleton_design_pattern;

/**
 * @TimeStamp 2023-11-08 15:50
 * @ProjectDetails design_patterns
 */
public class SingletonObject {
    private static SingletonObject instance=new SingletonObject();
    private SingletonObject(){

    }
    public static SingletonObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hellow Singleton Example Method!!");
    }
}
