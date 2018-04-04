package design.pattern.prototype;

import java.util.HashMap;


public class DBUtilsCache {

	private static HashMap<String, DBUtils> map = new HashMap<String, DBUtils>();
	
	public static DBUtils getDBUtils(String type) {
		DBUtils cacheDBUtil = map.get(type);
		if (cacheDBUtil == null) {
			DBUtils du = DBUtilsCache.getByType(type);
			map.put(type, du);
			cacheDBUtil = map.get(type);
		}
		return (DBUtils) cacheDBUtil.clone();
	}
	private static DBUtils getByType(String type) {
		if("mysql".equals(type))
			return new MysqlDBUtils();
		if("postgresql".equals(type))
			return new PostgresqlDBUtils();
		
		return null;
	}
}
