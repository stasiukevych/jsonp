package jsonp;


import javax.json.Json;
import javax.json.JsonObject;

public class JsonBuilder {

  public JsonObject buildPurchaseOrder() {
    return Json.createObjectBuilder().add("credit_card",
        Json.createObjectBuilder()
            .add("number", "1357")
            .add("expiry_date", "10/13")
            .add("control_number", "234")
            .add("type", "Visa")
    ).build();
  }
}