package co.eju.dbprj.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.eju.dbprj.DataSource;

public class DevServiceImple extends DataSource {
	private PreparedStatement psmt;
	private ResultSet rs;
	
//	public List<DevVO> selectList()
//	DevVO vo;
//	List<DevVO> list = new ArrayList<DevVO>();
	
//	return list;
	
	public void selectList() {
		String sql = "select * from dev";//시퀄을 먼저 만듬
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); //select구문은 무조건 executequery 
			
			while(rs.next()) { //돌아온 결과가 존재하면
				System.out.println(rs.getInt("id")); //컬럼 명 데이터타입
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("address"));
				System.out.println(rs.getInt("age"));
			}
		} catch(SQLException e) {
			
		} //finally {
			//x  if(rs != null) r.close();
			//if(psmt != null) psmt.close();
		//}
	}

}
