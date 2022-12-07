package guru.springframwork.spring5jokesappv2.controller;

import guru.springframwork.spring5jokesappv2.services.JockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JockController {

    private final JockService jockService;
    @Autowired
    public JockController(JockService jockService) {
        this.jockService = jockService;
    }

    @RequestMapping({"/",""})
    public String getJock(Model model){
        model.addAttribute("jock",jockService.getJoke());

        return "index";
    }
}
