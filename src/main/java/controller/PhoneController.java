package controller;

import model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/phone")
public class PhoneController {

    @GetMapping("")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("phone", new PhoneNumber());
        return modelAndView;
    }

    @PostMapping("/validatePhone")
    public ModelAndView checkValidation(@Validated @ModelAttribute("phone") PhoneNumber phoneNumber, BindingResult bindingResult) {
        ModelAndView modelAndView;
//        new PhoneNumber().validate(phoneNumber, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            modelAndView = new ModelAndView("index");
        } else {
            modelAndView = new ModelAndView("result");
        }
        return modelAndView;
    }

}
