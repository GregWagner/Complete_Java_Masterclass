public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.printf("Initial page count %d%n", printer.getPagesPrinted());

        printer.printPages(3);
        System.out.printf("Page count %d%n", printer.getPagesPrinted());

    }
}
