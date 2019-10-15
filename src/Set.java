import java.util.HashSet;
import java.util.Random;

public class Set {

	public void SetExercises() {
		HashSet<String> setStr = new HashSet<>();
		
		setStr.add("one");
		setStr.add("two");
		setStr.add("three");
		
		for (String s : setStr) {
			System.out.println(s);
		}
		
		// Totolotek
		HashSet<Integer> totolotek = new HashSet<>();
		Random r = new Random();
		while (totolotek.size()<6) {
			int x = r.nextInt(36) + 1;
			totolotek.add(x);
		}
		System.out.println(totolotek);
	}
	
}
