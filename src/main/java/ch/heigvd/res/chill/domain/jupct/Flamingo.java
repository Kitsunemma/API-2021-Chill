package ch.heigvd.res.chill.domain.jupct;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Flamingo implements IProduct {

  public final static String NAME = "Flamingo";
  public final static BigDecimal PRICE = new BigDecimal(4.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}