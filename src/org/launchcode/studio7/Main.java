package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD bandAlbum = new CD("The Weeknd",1000.00,"Newest Album including 13 new hits", "CD", 4000);
        DVD movie = new DVD("Office Space",10.00,"Hit comedy classic about people in a office work enivorment", "DVD",10000);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        bandAlbum.spinDisc();
        bandAlbum.eject();

        movie.spinDisc();
        movie.eject();

    }
}
