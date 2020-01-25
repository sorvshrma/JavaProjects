package edu.neu.aed;

public interface GunShotMeasurable extends Measurable {
	/**
	 * the measure for quantification: muzzle velocity.
	 * @return metric value.
	 */
	public double getMetric();
	/**
	 * the description of the measure for quantification: muzzle velocity.
	 * @return metric value.
	 */
	public String getMetricDescription();

}
