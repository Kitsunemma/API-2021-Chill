package ch.heigvd.res.chill.domain.jupct;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonacoTest {

  @Test
  void thePriceAndNameForMonacoShouldBeCorrect() {
    Monaco beer = new Monaco();
    assertEquals(beer.getName(), Monaco.NAME);
    assertEquals(beer.getPrice(), Monaco.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMonaco() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jupct.Monaco";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PunkIPA.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}