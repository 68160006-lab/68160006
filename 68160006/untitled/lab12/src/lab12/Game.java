package lab12;

import java.util.Random;

public class Game {

private Player p1;
private Player p2;
private Board board;
private Random random;

public Game() {
p1 = new Player("Alice");
p2 = new Player("Bob");
board = new Board();
random = new Random();
}

public void play() {

Player current = p1;

while (p1.getMoney() > 0 && p2.getMoney() > 0) {

int dice = random.nextInt(6) + 1;
current.move(dice, board.getSize());

Property land = board.getSpace(current.getPosition());

System.out.println(current.getName() +
" ทอยได้ " + dice +
" ไปตกที่ " + land.getName());

if (land.getPrice() > 0) {

if (land.getOwner() == null) {
if (current.getMoney() >= land.getPrice()) {
current.pay(land.getPrice());
land.setOwner(current);
System.out.println("ซื้อที่ดินสำเร็จ");
}
} else if (land.getOwner() != current) {
current.pay(land.getRent());
land.getOwner().receive(land.getRent());
System.out.println("จ่ายค่าเช่า " + land.getRent());
}
}

System.out.println("เงินคงเหลือ: " + current.getMoney());
System.out.println("--------------------");

current = (current == p1) ? p2 : p1;
}

System.out.println("เกมจบ!");
if (p1.getMoney() <= 0)
System.out.println(p2.getName() + " ชนะ!");
else
System.out.println(p1.getName() + " ชนะ!");
}
}

