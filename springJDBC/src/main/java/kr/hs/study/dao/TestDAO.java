package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	//���� ������ ������ ��
	//���� ������ �� : JdbcTemplate
	//���⿡ jdbcTemplate�� �־���Ѵ�.
	@Autowired
	JdbcTemplate db; //�� Ÿ���� bean�� ã�Ƽ� �� �ּҰ��� db�� �־��\
	
	//insert
	public void insert_data(TestBean bean) {
		String sql = "insert into test values(?,?)"; //?, ?�ȿ� get()�� ���ε��� �ȴ�
		db.update(sql, bean.getData1(), bean.getData2());
		
		
		
		
	}
	
}
