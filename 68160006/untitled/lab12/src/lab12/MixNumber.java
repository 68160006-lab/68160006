package lab12;

public class MixNumber {
    private int full;
    private SesSuan s;
    
    public MixNumber() {
   	 s = new SesSuan();
    }
	public int getFull() {
		return full;
	}
	public void setFull(int full) {
		this.full = full;
	}
	public SesSuan getSesSuan() {
		return s;
	}

	public void setSesSuan(SesSuan s) {
		this.s = s;
	}
	public void setSesSuan(int s1, int s2) {
		s.setSes(s1);
		s.setSuan(s2);
	}
   public SesSuan getWholeInSesSuan() { 
   	SesSuan a = new SesSuan();
   	a.setSes(full * s.getSuan() + s.getSes());
   	a.setSuan(s.getSuan());
   	return a;
   }
   public double getWholeInValue() {
   	return full + s.getResult();
   }
   public String show() {
   	return full + s.show();
   }
}
