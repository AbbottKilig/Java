package design.pattern.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Container container = new ContainerImp();
		
		for(Iterator iter = container.getIterator();iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println(name);
		}
	}
}
