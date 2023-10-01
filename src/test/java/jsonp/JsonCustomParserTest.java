package jsonp;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;

class JsonCustomParserTest {

  @Test
  public void testParserOfJson() throws FileNotFoundException {
    new JsonCustomParser().parsePurchaseOrderAndReturnEmail("src/test/resources/credit_card.json");
  }
}