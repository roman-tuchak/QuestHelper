package com.tuchak.questhelper;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("/upload")
public class UploadController {

    @RequestMapping (method = RequestMethod.GET)
    public ModelAndView getPage() {
        return new ModelAndView("");
    }
}
