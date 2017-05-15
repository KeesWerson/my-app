package com.s61ba;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.s61ba.service.UserService;
import org.jooby.Jooby;
import org.jooby.json.Gzon;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  private UserService userService = new UserService();

  {
    use(new Gzon());

    get("/message/userid", () -> "Hello World!");

    post("/message/new", (req, rsp)  -> {
      Gson gson = require(Gson.class);
      JsonObject jsonObject = gson.fromJson(req.body().value(), JsonObject.class);  //fromJson(req.body().toString(), JsonObject.class);
      rsp.send(userService.postMessage(jsonObject.get("userid").getAsInt(), jsonObject.get("message").getAsString()));
    });

    post("/user/new", (req, rsp)  -> {
      Gson gson = require(Gson.class);
      JsonObject jsonObject = gson.fromJson(req.body().value(), JsonObject.class);  //fromJson(req.body().toString(), JsonObject.class);
      rsp.send(userService.newUser(jsonObject.get("username").getAsString(), jsonObject.get("password").getAsString()));
    });
  }

  /*{
    post("/message/new", () -> userService.postMessage(0,"0"));
  }*/

  /*{
    post("/message/new", req -> {
      userService.postMessage(0,"0");
    });
  }*/

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
