import java.util.HashMap;

public class Map {

	public void MapExercises() {
		
		HashMap<Integer, String> firstMap = new HashMap<>();
		
		firstMap.put(1, "jeden");
		firstMap.put(2, "dwa");
		firstMap.put(3, "trzy");
		
		// Map methods
		System.out.println("Map contains jeden: "+firstMap.containsValue("jeden"));
		System.out.println("Map contains zero: "+firstMap.containsValue("zero"));
		System.out.println("Values: "+firstMap.values());
		
	}
	
}
