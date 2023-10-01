package jsonp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.json.Json;
import javax.json.stream.JsonParser;

public class JsonCustomParser {

  public void parsePurchaseOrderAndReturnEmail(String path)
      throws FileNotFoundException {
    JsonParser parser = Json.createParser(new FileReader(path));
    while (parser.hasNext()) {
      parser.next();
      System.out.println(parser.getValue().toString());
    }
  }
}