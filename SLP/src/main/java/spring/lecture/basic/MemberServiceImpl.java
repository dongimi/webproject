package spring.lecture.basic;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO dao;

	@Override
	public boolean create(Map<String, Object> map) {
		int result = dao.create(map);		
		return result==1;
	}

	@Override
	public Map<String, Object> selectDetail(Map<String, Object> map) {
		return dao.selectDetail(map);
	}

	@Override
	public void update(Map<String, Object> map) {
		dao.update(map);
		
	}

	@Override
	public List<Map<String, Object>> list() {		
		return dao.list();
	}

	@Override
	public int delete(Map<String, Object> map) {		
		return dao.delete(map);
	}	
	
//	@Override
//	public List<Map<String, Object>> cartlist(Map<String,Object> map) {
//		return dao.cartlist(map);
//	}

}
