package design.pattern.adapter;

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		FileUtilsCompatiable fc = new FileUtilsCompatiable();
		fc.getData("mysql", "id");
	}

}
