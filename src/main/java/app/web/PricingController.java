package app.web;


import lib.calc.BlackScholesInput;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class PricingController {

    @RequestMapping("/pricing")
    @ResponseBody
    public String pricing(@RequestBody BlackScholesInput input) {

        return String.format("%s : %.2f", input.toString(), Math.random()*100);
    }
}
