package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.beans.TestBean;

@Component
public class TestDAO {
		//���� ������ ������ ��
		//���� ������ �� : JdbcTemplate
		//���⿡ jdbcTemplate�� �־���Ѵ�.
		@Autowired
		JdbcTemplate db;
		//insert
		public void insert_data(TestBean bean) {
			String sql = "insert into spring values(?,?, ?, ?)"; //?, ?�ȿ� get()�� ���ε��� �ȴ�
			db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername(), bean.getUserage());
		}
		
		
}
