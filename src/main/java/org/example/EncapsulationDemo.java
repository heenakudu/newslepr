package org.example;

public class EncapsulationDemo implements IVehicle{
    @Override
   public void start(){
        System.out.println("dggfggf");
    }
}

class implementhg{
public static void main(String[] args){
    EncapsulationDemo demo=new EncapsulationDemo();
    demo.honk();
    demo.start();
}}
