package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CalculatorController {

    @GetMapping("/showUI")
    public ModelAndView showUI() {
        return new ModelAndView("showUI");
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(@RequestParam String action, String number1, String number2) {
        float result = 0;
        String warning ="";
        if (action == null) action = "";
        switch (action) {
            case "add": {
                result = Float.parseFloat(number1) + Float.parseFloat(number2);
                break;
            }
            case "sub": {
                result = Float.parseFloat(number1) - Float.parseFloat(number2);
                break;
            }
            case "mul": {
                result = Float.parseFloat(number1) * Float.parseFloat(number2);
                break;
            }
            case "div": {
                if (!number2.equals("0")) {
                    result = Float.parseFloat(number1) / Float.parseFloat(number2);
                }else {
                    warning = "Can not div to 0, please check again";
                }
                break;
            }
        }
        ModelAndView modelAndView = new ModelAndView("showUI");
        modelAndView.addObject("result", result);
        modelAndView.addObject("warning", warning);
        return modelAndView;
    }
}
