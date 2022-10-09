package spring.lecture.basic;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired 
	private SqlSessionTemplate sqltemplate;
	
	public int create(Map<String, Object> map) {
		return sqltemplate.insert("member.create", map);
	}
	
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return sqltemplate.selectOne("member.select_detail",map);
	}

	public void update(Map<String, Object> map) {
		sqltemplate.update("member.update",map);
	}
	
	public List<Map<String, Object>> list(){
		return sqltemplate.selectList("member.list");
	}
	
	public int delete(Map<String, Object> map) {
		return sqltemplate.delete("member.delete",map);
	}

//	public List<Map<String, Object>> cartlist(Map<String, Object> map) {
//		return sqltemplate.selectList("member.cartlist", map);
//	}


	
}
