package main.java;

public class GradingScheme {
	private double curve;
	
	private boolean roundUp;

	public GradingScheme(double curve, boolean roundUp) {
		this.curve = curve;
		
		this.roundUp = roundUp;
	}

	public double getCurve() {
		return curve;
	}

	public void setCurve(double curve) {
		this.curve = curve;
	}



	public boolean isRoundUp() {
		return roundUp;
	}

	public void setRoundUp(boolean roundUp) {
		this.roundUp = roundUp;
	}

}
