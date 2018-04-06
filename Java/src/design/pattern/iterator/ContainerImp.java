package design.pattern.iterator;

public class ContainerImp implements Container{

	public String names[] = {"latiaoshusheng","fighting_flash","hello kitty"};
	@Override
	public Iterator getIterator() {
		return new nameIterator();
	}
	
	private class nameIterator implements Iterator {
		int index;
		
		public nameIterator() {
			index = 0;
		}
		@Override
		public boolean hasNext() {
			if(index < names.length){
	            return true;
	         }
	         return false;
		}

		@Override
		public Object next() {
			 if(this.hasNext()){
		            return names[index++];
		         }
		         return null;
		}
		
	}

}
