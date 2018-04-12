package com.skilldistillery.hellosts.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
  @Autowired
  HelloDAO dao;
  @RequestMapping("hello.do")
  public ModelAndView hello() {
    ModelAndView mv = new ModelAndView("WEB-INF/hello.jsp");
    mv.addObject("data", dao.getHello());
    return mv;
  }
}