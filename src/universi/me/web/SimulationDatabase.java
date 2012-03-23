package universi.me.web;

import java.util.ArrayList;
import java.util.List;

public class SimulationDatabase {

	public static List<Feed> listFeed = new ArrayList<Feed>();

	public static void add(Feed f) {
		listFeed.add(f);
	}
	
	public static void delete(String id) {
		for(int i = 0; i < listFeed.size(); i++) {
			if(listFeed.get(i).id.equals(id))
				listFeed.remove(i);
		}
	}
	
	public static int size() {
		return listFeed.size();
	}
	
}
