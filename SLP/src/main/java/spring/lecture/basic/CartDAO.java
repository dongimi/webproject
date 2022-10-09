package spring.lecture.basic;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAO {

	@Autowired
	private SqlSessionTemplate sqltemplate;
	
	public List<Map<String, Object>> cartlist(Map<String, Object> map) {
		return sqltemplate.selectList("cart.cartlist", map);
	}

}
