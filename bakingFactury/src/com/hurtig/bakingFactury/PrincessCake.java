package com.hurtig.bakingFactury;

import java.util.ArrayList;


public class PrincessCake {
	

	static void makeCake() {
		
		var ingrediens = new ArrayList<String>();
		
		whipCream("gr�dde");
		takeOutTheBottum();
		
	}
	
	private static void whipCream(String ingrediens) {
		
		ingrediens.replace("gr�dde", "vispgr�dde");
		
		System.out.println("Gr�dden �r vispad");
	
	}
	
	static void takeOutTheBottum() {
		
		System.out.println("Tar fram t�rtbotten");
	}

}
