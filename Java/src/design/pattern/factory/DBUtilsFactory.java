package design.pattern.factory;

public class DBUtilsFactory {
	
	public DBUtils getDBUtils(String DBtype) {
		
		if("mysql".equals(DBtype))
			return new MysqlDBUtils();
		if("postgresql".equals(DBtype))
			return new PostgresqlDBUtils();
		if("oracle".equals(DBtype))
			return new OracleDBUtils();
		
		return null;
	}

}
