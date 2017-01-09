package com.kidfriendlystl;

public class PlayArea {
	
	private int businessID;
	private boolean clean;
	private boolean inside;
	private boolean outside;
	private boolean gated;
	private boolean fun;
	
	public PlayArea(int businessID, boolean clean, boolean inside, boolean outside, boolean gated, boolean fun) {
		this.businessID = businessID;
		this.clean = clean;
		this.inside = inside;
		this.outside = outside;
		this.gated = gated;
		this.fun = fun;
	}

	public PlayArea(boolean clean, boolean inside, boolean outside, boolean gated, boolean fun) {
		this.clean = clean;
		this.inside = inside;
		this.outside = outside;
		this.gated = gated;
		this.fun = fun;
	}

	public int getBusinessID() {
		return businessID;
	}

	public boolean isClean() {
		return clean;
	}

	public boolean isInside() {
		return inside;
	}

	public boolean isOutside() {
		return outside;
	}

	public boolean isGated() {
		return gated;
	}

	public boolean isFun() {
		return fun;
	}

	public void setBusinessID(int businessID) {
		this.businessID = businessID;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public void setInside(boolean inside) {
		this.inside = inside;
	}

	public void setOutside(boolean outside) {
		this.outside = outside;
	}

	public void setGated(boolean gated) {
		this.gated = gated;
	}

	public void setFun(boolean fun) {
		this.fun = fun;
	}

}