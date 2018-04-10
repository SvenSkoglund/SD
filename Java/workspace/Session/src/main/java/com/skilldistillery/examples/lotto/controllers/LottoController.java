package com.skilldistillery.examples.lotto.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.examples.lotto.service.Hopper;

@Controller
public class LottoController {
  @Autowired
  private Hopper hopper;

  @RequestMapping("lotto.do")
  public String welcome() {
    return "WEB-INF/form.jsp";
  }

  @RequestMapping("GetNumbers.do")
  public ModelAndView getNumbers(@RequestParam(value="howmany", defaultValue="6") int count, HttpSession session) {
    hopper.reset();

    List<String> nums = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      nums.add(hopper.drawBall().getValue());
    }

    ModelAndView mv = new ModelAndView();
    mv.addObject("listOfNumbers", nums);
    
    // Check in session for history - session.getAttribute(key)
    List< List<String> > history = (List< List<String> >) session.getAttribute("lottoHistory");
    if(history == null) {
      history = new ArrayList<>();
      // Put history in session - session.setAttribute(key, value)
      session.setAttribute("lottoHistory", history);
    }
    history.add(nums);
    
    mv.setViewName("WEB-INF/form.jsp");
    return mv;
  }
}
