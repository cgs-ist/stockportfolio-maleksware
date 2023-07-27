import java.util.*;

public class StockPortfolio {
    private Map<String, Integer> codeToNumberOwned;
    private Map<String, Stock> codeToStockInfo;

    public StockPortfolio() {
        this.codeToNumberOwned = new HashMap<>();
        this.codeToStockInfo = new HashMap<>();
    }

    public void addStock(Stock stock, int numberOwned) {
        this.codeToNumberOwned.put(stock.getCode(), numberOwned);
        this.codeToStockInfo.put(stock.getCode(), stock);
    }

    public void viewPortfolio() {
        System.out.println("Current stock portfolio:");
        for (Map.Entry<String, Integer> codePair : codeToNumberOwned.entrySet()) {
            Stock curStock = this.codeToStockInfo.get(codePair.getKey());
            System.out.print(codePair.getKey() + "(" + curStock.getName() + ", ");
            System.out.print(curStock.getPrice());
            System.out.print("): ");
            System.out.println(this.codeToNumberOwned.get(codePair.getKey()));
        }
    }
}
