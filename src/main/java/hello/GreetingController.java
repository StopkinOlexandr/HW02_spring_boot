package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

  @RequestMapping("/greeting")
  public String greeting(
      @RequestParam(value="name", required=false, defaultValue="World") String name,
      @RequestParam(value="second", required=false, defaultValue="of Spring BOOT") String second, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("second", second);
    return "greeting";
  }

}