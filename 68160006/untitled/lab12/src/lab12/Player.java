package lab12;

public class Player {
private String name;
private int money;
private int position;

public Player(String name) {
this.name = name;
this.money = 1000;
this.position = 0;
}

public String getName() { return name; }
public int getMoney() { return money; }
public int getPosition() { return position; }

public void move(int steps, int boardSize) {
position = (position + steps) % boardSize;
}

public void pay(int amount) {
money -= amount;
}

public void receive(int amount) {
money += amount;
}
}

