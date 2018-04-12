package mypackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	// Add a method to your controller class with an @RequestMapping annotation set
	// to the action you specified in your HTML file in step 6. The method should
	// return a ModelAndView object and have parameters that match the request
	// parameters from the HTML. Use the @RequestParam annotation to match request
	// parameters with method parameters. The name of the method can be anything.
	// Again, use ⌘ + shift + o to import the necessary dependencies.

	@RequestMapping("route.do")
	public ModelAndView myMethod(@RequestParam("data") String string) {
		String allCaps = string.toUpperCase();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view.jsp");
		mv.addObject("result", allCaps);
		return mv;

	}
}
