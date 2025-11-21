package org.example;

public interface IVehicle {
    void start();  // Abstract method

    // Default method (Concrete method in interface)
    default void honk() {
        System.out.println("Vehicle is honking!");
    }


}
