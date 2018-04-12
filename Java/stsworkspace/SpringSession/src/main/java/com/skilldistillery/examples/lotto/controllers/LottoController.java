package com.skilldistillery.examples.lotto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.examples.lotto.service.Hopper;

@Controller
@SessionAttributes("lottoHistory")
public class LottoController {
  @Autowired
  private Hopper hopper;
  
  @ModelAttribute("lottoHistory")
  private List<List<String>> initHistory(){
    return new ArrayList<>();
  }

  @RequestMapping("lotto.do")
  public String welcome() {
    return "WEB-INF/form.jsp";
  }

  @RequestMapping("GetNumbers.do")
  public ModelAndView getNumbers(@RequestParam(value="howmany", defaultValue="6") int count, 
      @ModelAttribute("lottoHistory") List<List<String>> history) {
    hopper.reset();

    List<String> nums = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      nums.add(hopper.drawBall().getValue());
    }

    ModelAndView mv = new ModelAndView();
    mv.addObject("listOfNumbers", nums);
    
    // history is already available
    history.add(nums);
    
    mv.setViewName("WEB-INF/form.jsp");
    return mv;
  }
  
  @RequestMapping("clearHistory.do")
  public String clearLottoHistory(SessionStatus sessionStatus) {
    
    // remove the lottoHistory from session
    sessionStatus.setComplete();
    return "redirect:lotto.do";
  }
}
