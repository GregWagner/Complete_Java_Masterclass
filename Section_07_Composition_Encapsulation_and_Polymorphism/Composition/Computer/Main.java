public class Main {
    public static void main(String[] args) {
        Dimensions dimension = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimension);
        Monitor theMoniter = new Monitor("27 inch Beast", "Acer", 27,
                new Resolution(2540, 1880));
        Motherboard theMotherBoard = new Motherboard("BJ-200", 
                "Asus", 4, 6, "2.44");

        PC thePC = new PC(theCase, theMoniter, theMotherBoard);

        thePC.powerUp();
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
    }
}
