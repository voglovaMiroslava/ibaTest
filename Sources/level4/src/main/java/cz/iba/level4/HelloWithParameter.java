package cz.iba.level4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Miroslava Voglova
 */
@Controller
public class HelloWithParameter {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String navigate() {
        return "redirect:/hello";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView multiHello(@RequestParam(required = false) String x) {
        Integer repet = 1;
        try {
            repet = Integer.parseUnsignedInt(x);
        } catch (NumberFormatException ex) {
        }

        ModelAndView model = new ModelAndView("multipleHello");
        model.addObject("repet", repet);
        return model;

    }

}
