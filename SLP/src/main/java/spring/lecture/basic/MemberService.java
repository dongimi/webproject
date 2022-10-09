package spring.lecture.basic;

import java.util.List;
import java.util.Map;

public interface MemberService {
	public boolean create(Map<String, Object> map);
	public Map<String, Object> selectDetail(Map<String, Object> map);
	public void update(Map<String, Object> map);
	public List<Map<String, Object>> list();
	public int delete(Map<String, Object> map) ;
//	public List<Map<String, Object>> cartlist(Map<String, Object> map);
}
