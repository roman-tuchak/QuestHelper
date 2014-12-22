package com.tuchak.questhelper;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("/upload")
public class UploadController {

    @RequestMapping (method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView mav = new ModelAndView("upload");
        mav.addObject("name", "unknown user");
        System.out.println("Without name. GET only.");
        return mav;
    }

    @RequestMapping (params = "name", method = RequestMethod.GET)
    public String getWithParam(@RequestParam String name, Model mod) {
        mod.addAttribute("name", name);

        System.out.println(name);
        return "namedUpload";
    }
}
