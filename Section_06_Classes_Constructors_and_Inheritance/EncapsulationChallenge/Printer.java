public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        fillToner(tonerLevel);
        this.duplex = duplex;
        numberOfPagesPrinted = 0;
    }

    public void fillToner(int amount) {
        if (amount > 0 && amount <= 100) {
            if (amount + tonerLevel <= 100) {
                tonerLevel += amount;
            }
        }
    }

    public void printPages(int pages) {
        if (duplex) {
            numberOfPagesPrinted += (pages / 2) + (pages % 2);
        } else {
            numberOfPagesPrinted += pages;
        }
    }

    public int getPagesPrinted() {
        return numberOfPagesPrinted;
    }
}


