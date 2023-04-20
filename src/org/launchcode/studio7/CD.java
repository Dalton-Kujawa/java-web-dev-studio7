package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, Double capacity, String contents, String discType, Integer rpm) {
        super(name, capacity, contents, discType, rpm);
    }

    @Override
    public void spinDisc() {
        System.out.println(
                         "Name: " + name +
                        "\nCapacity: " + capacity +
                        "\nDisc Type: " + discType +
                        "\nContents: " + contents
        );
    }

    @Override
    public void eject() {
        System.out.println(discType + " ejected successfully!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
