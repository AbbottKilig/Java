package design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
	
	private String state;
	private CareTaker careTaker = new CareTaker();
	public void setState(String state) {
		this.state = state;
		
	}
	
	public String getState() {
		return state;
	}
	
	public void saveStateToMemento() {
		careTaker.add(new Memento(state));
	}
	
	public void getStateFromMemento(Memento Memento){
	      state = Memento.getState();
	   }
	
	public Memento getState(int index) {
		int size = careTaker.getSize();
		if (size < index) {
			return null;
		}
		return careTaker.get(index);
	}
	

	public class CareTaker {
		   private List<Memento> mementoList = new ArrayList<Memento>();
		   private int size = 0;
		   public void add(Memento state){
		      mementoList.add(state);
		      size++;
		   }

		   public Memento get(int index){
		      return mementoList.get(index);
		   }
		   public int  getSize() {
			return size;
		}
		}
}
