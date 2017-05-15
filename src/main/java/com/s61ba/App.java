package com.s61ba;

import com.s61ba.service.UserService;
import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  private UserService userService = new UserService();

  {
    get("/message/userid", () -> "Hello World!");

    {
      post("/message/new", (req, rsp)  -> {
        JsonObject jsonObject = JSONSerializer.toJSON(req.body().toString());  //fromJson(req.body().toString(), JsonObject.class);
        rsp.send(userService.postMessage(jsonObject.get("userid").getAsInt(), jsonObject.get("message").getAsString()));
      });
    }
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
