public abstract class Console implements IConsole {
    // I keep the details for one console sales record in these variables.
    private final String consoleType;
    private final String storeName;
    private final int totalSales;

    // I receive the sales details and check them before I save them.
    protected Console(String consoleType, String storeName, int totalSales) {
        if (consoleType == null || consoleType.isBlank()) {
            throw new IllegalArgumentException("Console type cannot be blank.");
        }
        if (storeName == null || storeName.isBlank()) {
            throw new IllegalArgumentException("Store name cannot be blank.");
        }
        if (totalSales < 0) {
            throw new IllegalArgumentException("Total sales cannot be negative.");
        }
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // I return the type of console that was sold.
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // I return the name of the store.
    @Override
    public String getStore() {
        return storeName;
    }

    // I return the total sales amount.
    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
