package Polymorphism;
public class Holden extends Car {
    public Holden(int cylinders, String name){
        super(cylinders,name);
    }

    public String startEngine(){
        return ("Holden Engine "+getName());
    }

    public String accelerate(){
        return ("Holden Car "+getName()+" is accelerating");
    }

    public String brake(){
        return ("Holden Car "+getName()+" is braking");
    }
}