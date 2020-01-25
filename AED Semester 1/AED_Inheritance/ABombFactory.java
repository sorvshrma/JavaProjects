package edu.neu.aed;


public class ABombFactory extends AbstractExplosionFactoryAPI {

	@Override
	public Explosion getObject() {
		return new ABomb();
	}

}
