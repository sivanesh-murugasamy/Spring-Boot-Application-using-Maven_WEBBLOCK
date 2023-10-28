package com.newf.heilo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Control {
    @RequestMapping("/table")
    public java.lang.String table(@ModelAttribute("frm") Forms frm){
      return "table";}

    @RequestMapping("/login")
    public java.lang.String registerform(@ModelAttribute("frm") Forms frm){
      return "reg";
    }
    @RequestMapping("/RegisterSucc")
    public java.lang.String RegisterSucc(@ModelAttribute("frm") Forms frm)
    {
      return "rec";
    }

     @RequestMapping("/index")
    public java.lang.String index(@ModelAttribute("frm") Forms frm){
      return "index";
    }

       @RequestMapping("/aboutus")
    public java.lang.String aboutus(@ModelAttribute("frm") Forms frm){
      return "aboutus";
    }

       @RequestMapping("/blockedurl")
    public java.lang.String blockedurl(@ModelAttribute("frm") Forms frm){
      return "urlhist";
    }
    
}
