package jsonp;

import javax.json.JsonObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JsonBuilderTest {

  @Test
  public void testCreationOfJson() {

    JsonObject json = new JsonBuilder().buildPurchaseOrder();

    Assertions.assertEquals(
        "{\"credit_card\":{\"number\":\"1357\",\"expiry_date\":\"10/13\",\"control_number\":\"234\",\"type\":\"Visa\"}}",
        json.toString()
    );
  }
}