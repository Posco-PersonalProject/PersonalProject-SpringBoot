package Pack.util;

import org.apache.ibatis.session.SqlSession;

public interface Delegate {
	public Object delegate(SqlSession session);
}