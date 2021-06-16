package iudx.aaa.server.token;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

/**
 * Structures the JsonObject required for test cases.
 */
public class RequestPayload {
  
  public static JsonObject validPayload = new JsonObject().put("clientId", "0343dab6-aa61-4024-a6ff-3b52e8d488f4")
      .put("clientSecret","test-client")
      .put("itemId", "item-1")
      .put("itemType", "ResourceGroup")
      .put("role", "provider")
      .put("roleList", new JsonArray("[\"delegate\",\"provider\"]"));
  
  public static JsonObject invalidClientId = validPayload.copy().put("clientId", "0343dab6-aa61-4024-a6ff-3b52e8d488f1");
  public static JsonObject invalidClientSecret = validPayload.copy().put("clientSecret", "0343dab6-aa61-4024-a6ff-3b52e8d488f1");
  public static JsonObject undefinedRole = validPayload.copy().put("role", "dev");
}

