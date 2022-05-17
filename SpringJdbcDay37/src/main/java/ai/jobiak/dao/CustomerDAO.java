package ai.jobiak.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAO {
	private JdbcTemplate mysqlTemplate;
	
	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}

	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}

	/*
	 * public int insertRow() { //return
	 * mysqlTemplate.update("insert into customer values(199,'michel stark',4000)");
	 * return
	 * mysqlTemplate.update("insert into customer values(200,'stark Andreson',2000)"
	 * );
	 * 
	 * }
	 */
	public void updateRow(String name,int custid) {
		mysqlTemplate.update("update customer set name='MitchelStark' where id=199",name,custid);
	}
}
