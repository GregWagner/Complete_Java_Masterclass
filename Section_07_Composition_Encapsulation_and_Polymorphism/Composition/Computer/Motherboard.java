public class Motherboard {
    private String model;
    private String manfacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manfacturer, int ramSlots,
            int cardSlots, String bios) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loaded.");
    }

    public String getModel() {
        return model;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
