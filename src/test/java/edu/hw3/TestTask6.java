package edu.hw3;

import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockMarket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask6 {
    @Test
    @DisplayName("Stocks")
    void testCipher() {
        // given

        StockMarket market = new StockMarket();

        Stock stock1 = new Stock("AAPL", 150.32);
        Stock stock2 = new Stock("GOOGL", 2975.12);
        Stock stock3 = new Stock("MSFT", 350.55);

        market.add(stock1);
        market.add(stock2);
        market.add(stock3);

        //Contact res =
        // then

        assertThat(market.mostValuableStock()).isEqualTo(stock2);
    }
}
