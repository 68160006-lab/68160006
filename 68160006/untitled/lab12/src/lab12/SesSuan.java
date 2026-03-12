package lab12;

public class SesSuan {
	   private int ses;
	   private int suan;
	   
	   public int getSes() {
		  return ses;
	   }
	   public void setSes(int s) {
		  ses = s;
	   }
	   public int getSuan() {
		  return suan;
	   }
	   public void setSuan(int s) {
		  suan = s;
	   }  
	   public double getResult() {
		   return (double) ses / suan;
	   }
	   public String show() {
		   return "["+ ses + "/" + suan + "]";
	   }
	   public SesSuan plus(SesSuan m) {
		   SesSuan a = new SesSuan();
		   
		   a.setSuan(suan * m.getSuan());
		   a.setSes(ses * m.getSuan() + suan * m.getSes());
		   
		   return a;
	   }
	}
