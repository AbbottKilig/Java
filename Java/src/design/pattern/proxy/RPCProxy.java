package design.pattern.proxy;

public class RPCProxy implements RomoteProcessCall{

	private RPCImplement rpci;
	@Override
	public void call() {
		if (rpci == null) {
			rpci = new RPCImplement();
		}
		rpci.call();
	}

}
