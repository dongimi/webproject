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
public class MemberController {
	@Autowired
	private MemberService service;
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("member/member");
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public ModelAndView create(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView();
		boolean isCreated =  service.create(map);
		if(isCreated) {
			System.out.println("success");
			mav.setViewName("redirect:/member");
		}
		else {
			System.out.println("faile");
			mav.setViewName("redirect:/member");
		}
		return mav;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String,Object> map ) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> detailMap =  service.selectDetail(map);
		mav.addObject("data",detailMap);
		mav.setViewName("/member/detail");		
		return mav;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> detailMap =  service.selectDetail(map);
		mav.addObject("data",detailMap);
		mav.setViewName("/member/update");
		return mav;
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		// �빐�떦 �궗�슜�옄媛� 留욌뒗吏� �씤利�		
		Map<String, Object> detailMap =  service.selectDetail(map);
		if(detailMap != null && detailMap.get("passwd").equals(map.get("passwd"))) {
			service.update(map);
//			mav.setViewName("redirect:/update?id="+map.get("id"));  // url �샇異�
//			mav.setViewName("/member/update"); // jsp �솕硫� �샇異�
			mav = this.update(map);   // 湲곗〈 get諛⑹떇�쓽 update �솕硫� �샇異�
			mav.addObject("message","蹂�寃쎈릺�뿀�뒿�땲�떎.");
		}else {
			mav = this.update(map);
			mav.addObject("message","�뙣�뒪�썙�뱶媛�<br> ���졇�뒿�땲�떎.");
		}
		return mav;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("/member/list");
		mav.addObject("memberlists", service.list());
		return mav;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		boolean isSuccessDelete =  (service.delete(map) == 1);
		if(isSuccessDelete) {
			mav.setViewName("redirect:/list");
		}else {
			mav = this.detail(map);
		}
		return mav;
	}
	
//	@RequestMapping(value = "/cart", method = RequestMethod.GET)
//	public ModelAndView cart(@RequestParam Map<String,Object> map) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("cartlist",service.cartlist(map));
//		mav.setViewName("/cart");		
//		return mav;
	
//		ModelAndView mav = new ModelAndView("/cart");
//		mav.addObject("cartlist", service.cartlist(map));
//		return mav;
//	}
	
	
}
