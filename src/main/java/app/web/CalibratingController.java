package app.web;

import lib.product.VolPoint;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@EnableAutoConfiguration
public class CalibratingController {

    @RequestMapping("/vol/{symbol}")
    @ResponseBody
    public VolPoint getHistoricalVol(@PathVariable String symbol) {
        double ivol = Math.random() * 50;
        return new VolPoint(symbol, ivol, 2000d, new Date());
    }
}
