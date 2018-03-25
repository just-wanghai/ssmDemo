package cn.smbms.tools;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSessionFactory factory = null;
	
	static {
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			if(factory == null) {
				factory = new SqlSessionFactoryBuilder().build(inputStream);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		SqlSession session = null;
		if(session == null) {
			session = factory.openSession();
		}
		return session;
	}
	
	public static void closeSession(SqlSession session) {
		if(session != null) { 
			session.close();
		}
	}
}
