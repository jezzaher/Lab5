package poker;

// default package
// Generated Nov 30, 2014 1:58:08 AM by Hibernate Tools 3.4.0.CR1

/**
 * Pokerresults generated by hbm2java
 */
public class Pokerresults implements java.io.Serializable {

	private long result;
	private long handstrength;
	private long hihand;
	private long lohand;
	private long kicker;

	public Pokerresults() {
	}

	public Pokerresults(long result, long handstrength, long hihand,
			long lohand, long kicker) {
		this.result = result;
		this.handstrength = handstrength;
		this.hihand = hihand;
		this.lohand = lohand;
		this.kicker = kicker;
	}

	public long getResult() {
		return this.result;
	}

	public void setResult(long result) {
		this.result = result;
	}

	public long getHandstrength() {
		return this.handstrength;
	}

	public void setHandstrength(long handstrength) {
		this.handstrength = handstrength;
	}

	public long getHihand() {
		return this.hihand;
	}

	public void setHihand(long hihand) {
		this.hihand = hihand;
	}

	public long getLohand() {
		return this.lohand;
	}

	public void setLohand(long lohand) {
		this.lohand = lohand;
	}

	public long getKicker() {
		return this.kicker;
	}

	public void setKicker(long kicker) {
		this.kicker = kicker;
	}

}
