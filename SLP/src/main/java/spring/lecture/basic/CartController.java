package spring.lecture.basic;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	@Autowired
	private CartService service;
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView cart(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartlist", service.cartlist(map));
		mav.setViewName("/cart");		
		return mav;}
	
}
