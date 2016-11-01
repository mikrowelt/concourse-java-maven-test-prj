package de.bitkings.nitram509;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @RequestMapping(path = "test1")
  @ResponseBody
  public String get() {
    return "Hello World 1";
  }

}
