package ahuglajbclajep.sampapp.payara.micro.runner;

import fish.payara.micro.PayaraMicro;
import fish.payara.micro.BootstrapException;

public class EmbeddedPayara {
	public static void main(String[] args) throws BootstrapException {
		PayaraMicro.getInstance().bootStrap();
	}
}
