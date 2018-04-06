package design.pattern.composite;

public class CompositeEntity {
	
	private CoarseGrainedEntity cge = new CoarseGrainedEntity();
	
	public void printIds() {
		for (int i = 0; i < cge.getIds().length; i++) {
			System.out.println(cge.getIds()[i]);
		}
	}
	
	public void setIds(String id1, String id2) {
		cge.setIds(id1, id2);
	}

}
