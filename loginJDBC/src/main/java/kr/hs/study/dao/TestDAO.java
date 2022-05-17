package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.beans.TestBean;

@Component
public class TestDAO {
		//실제 쿼리를 날리는 곳
		//쿼리 날리는 예 : JdbcTemplate
		//여기에 jdbcTemplate이 있어야한다.
		@Autowired
		JdbcTemplate db;
		//insert
		public void insert_data(TestBean bean) {
			String sql = "insert into spring values(?,?, ?, ?)"; //?, ?안에 get()가 바인딩이 된다
			db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername(), bean.getUserage());
		}
		
		
}
