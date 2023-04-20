package org.launchcode.studio7;

public abstract class BaseDisc {
    String name;
    Double capacity;
    String contents;
    String discType;
    Integer rpm;

    public BaseDisc(String name, Double capacity, String contents, String discType, Integer rpm) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.rpm = rpm;
    }


}
