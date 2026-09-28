// I use this class to store console sales details and print a report.
public class ConsoleSales extends Console {
    // I pass the sales details to the Console class to store them.
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // I print the console type, store name, and total sales amount.
    public void printReport() {
        System.out.println("         Console Sales Report                 ");
        System.out.println("**********************************************");
        System.out.println("Console type: " + getConsoleType());
        System.out.println("Store name:   " + getStore());
        System.out.println("Total Sales:  " + getTotalSales());
    }
}
