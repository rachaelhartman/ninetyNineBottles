package ninetyninebottles;

public class BeerSong {

    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_of_Beer (){
        int numBottles = 99;
        for (int i = 99; i > 0; i--) {
            if (i > 2) {
                System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer,");
                numBottles = numBottles - 1;
                System.out.println("Take one down, pass it around, " + numBottles + " bottles of beer on the wall.");
            }
            if (i == 2) {
                System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer,");
                numBottles = numBottles - 1;
                System.out.println("Take one down, pass it around, " + numBottles + " bottle of beer on the wall.");
            }
            if (i == 1) {
                System.out.println(numBottles + " bottle of beer on the wall, " + numBottles + " bottle of beer,");
                numBottles = numBottles - 1;
                System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
            }
        }
    }
    
}
