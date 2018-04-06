package design.pattern.composite;

public class CoarseGrainedEntity {
	
	private Entity entity1;
	private Entity entity2;
	
	public void setIds(String id1, String id2) {
		entity1 = new ConcreteEntity1(id1);
		entity2 = new ConcreteEntity2(id2);
	}
	public String[] getIds() {
		return new String[] {entity1.getId(),entity2.getId()};
	}

}
