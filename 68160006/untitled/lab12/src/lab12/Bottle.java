package lab12;

public class Bottle {
	  int capacity;
	  int waterVolume;
	  public Bottle(int capacity,int waterVolume) {
	     this.capacity = capacity;
	     this.waterVolume = waterVolume;
	  }
	  //เติมน้ำให้เต็ม
	  public void filled() {
	     waterVolume = capacity;
	  }
	  //เทน้ำจากขวดให้หมด ไปยังขวด b
	  public void pourAll(Bottle b) {
	     b.addWaterVolume(waterVolume);
	     waterVolume = 0;
	  }
	  //เทน้ำออกให้หมด
	  public void pourAll() {
	     waterVolume = 0;
	  }
	  //เพิ่มปริมาตรน้ำ
	  private void addWaterVolume(int wv) {
	     waterVolume = waterVolume + wv;
	  }
	  //เทน้ำจากขวด ไปยังขวด b จนกว่าขวด b จะเต็ม
	  public void pourUntilFull(Bottle b) {
	     waterVolume = waterVolume - (b.capacity - b.waterVolume);
	     b.waterVolume = b.capacity;
	  } 
	  //แสดงสถานะของขวด และปริมาณน้ำที่มีในขวด
	  public void showInfo() {
		  System.out.println("Bottle: " + capacity + " Litre, Water volume: " + waterVolume + " litre.");
	  }
	}
