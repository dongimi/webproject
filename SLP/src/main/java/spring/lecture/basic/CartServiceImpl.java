package spring.lecture.basic;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO dao;
	
	@Override
	public List<Map<String, Object>> cartlist(Map<String,Object> map) {
		return dao.cartlist(map);
	}

}
