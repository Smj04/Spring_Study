package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	//실제 쿼리를 날리는 곳
	//쿼리 날리는 예 : JdbcTemplate
	//여기에 jdbcTemplate이 있어야한다.
	@Autowired
	JdbcTemplate db; //이 타입의 bean을 찾아서 그 주소값을 db에 넣어라\
	
	//insert
	public void insert_data(TestBean bean) {
		String sql = "insert into test values(?,?)"; //?, ?안에 get()가 바인딩이 된다
		db.update(sql, bean.getData1(), bean.getData2());
		
		
		
		
	}
	
}
