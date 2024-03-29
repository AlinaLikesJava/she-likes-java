package com.sda.she_likes_java.static_modifier;
public class WashMachine {
    private String brand;
    private String model;
    private int serialNumber;

    private static int numberOfCreatedMachines;
    public WashMachine(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberOfCreatedMachines++;
        serialNumber++;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void setNumberOfCreatedMachines(int numberOfCreatedMachines) {
        WashMachine.numberOfCreatedMachines = numberOfCreatedMachines;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNumberOfCreatedMachines() {
        return numberOfCreatedMachines;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public void increaseSerialNumber() {
        serialNumber++;
    }
    @Override
    public String toString() {
        return "WashMachine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}