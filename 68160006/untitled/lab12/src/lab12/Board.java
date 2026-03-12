package lab12;

import java.util.ArrayList;

public class Board {
private ArrayList<Property> spaces;

public Board() {
spaces = new ArrayList<>();

spaces.add(new Property("Start", 0, 0));
spaces.add(new Property("Bangkok", 200, 50));
spaces.add(new Property("Chiang Mai", 180, 40));
spaces.add(new Property("Phuket", 220, 60));
spaces.add(new Property("Khon Kaen", 150, 30));
spaces.add(new Property("Hat Yai", 170, 35));
spaces.add(new Property("Pattaya", 210, 55));
spaces.add(new Property("Ayutthaya", 160, 30));
spaces.add(new Property("Hua Hin", 190, 45));
spaces.add(new Property("Samui", 230, 65));
}

public Property getSpace(int position) {
return spaces.get(position);
}

public int getSize() {
return spaces.size();
}
}
