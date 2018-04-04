package design.pattern.prototype;

import java.awt.dnd.DnDConstants;

public class PrototypeDemo {
	public static void main(String[] args) {
		DBUtilsCache dc = new DBUtilsCache();
		DBUtils utils = dc.getDBUtils("mysql");
		utils.getConnection();
		utils = dc.getDBUtils("postgresql");
		utils.getConnection();
	}
}
