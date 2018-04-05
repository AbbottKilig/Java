package design.pattern.proxy;

public class RPCImplement implements RomoteProcessCall {

	@Override
	public void call() {
		System.out.println("RPC ...");
	}

}
