package com.hurtig.bakingFactury;

import java.util.ArrayList;


public class PrincessCake {
	

	static void makeCake() {
		
		var ingrediens = new ArrayList<String>();
		
		whipCream("grädde");
		takeOutTheBottum();
		
	}
	
	private static void whipCream(String ingrediens) {
		
		ingrediens.replace("grädde", "vispgrädde");
		
		System.out.println("Grädden är vispad");
	
	}
	
	static void takeOutTheBottum() {
		
		System.out.println("Tar fram tårtbotten");
	}

}
