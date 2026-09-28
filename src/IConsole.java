// I use this interface to list the details every console sales class must provide.
public interface IConsole {
    // I get the type of console that was sold.
    String getConsoleType();

    // I get the name of the store.
    String getStore();

    // I get the total amount of sales.
    int getTotalSales();
}
