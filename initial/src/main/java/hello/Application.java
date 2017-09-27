package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World!!";
  }

  @RequestMapping("/debris")
  public String debis() {
    return "Debris algo!!";
  }

  @RequestMapping("/req")
  public String getAttr(@RequestParam String someAttr) {
    return "ciao-" + someAttr;
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}