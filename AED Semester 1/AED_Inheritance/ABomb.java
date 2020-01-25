package edu.neu.aed;

public class ABomb extends Explosion implements ExplosionMeasurable {
	public void explode() {
		System.out.println("(KABOOM)");
	}

	@Override
	public double getMetric() {
		return 15.1;
	}

	@Override
	public String getMetricDescription() {
		StringBuilder description = new StringBuilder();
		description.append("An atomic bomb having an explosive force equivalent to ");
		description.append(this.getMetric());
		description.append(" Kilotons of TNT.");
		return description.toString();
	}
}
