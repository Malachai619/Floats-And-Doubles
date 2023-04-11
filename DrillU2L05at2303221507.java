package lrn.cc.drill.current;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class DrillU2L05at2303221507 {

	@Test
	void testU2L05() {
		// https://resources.coderscampus.com/docs/drills/U2L05/ for more detailed instructions
		
		double associate = 7/ 21;
		double net = 7D / 21D;
		
		double wear = 3D;
		double grocery = 28D;
		double night = wear / grocery;
		
		double D = 8;
		float d = 6;
		float F = 3;
	    boolean ease = false;
	   
	    if  ( night <= 0) {
	    	System.out.println("True");
	    } else if( net >= 0 ){
	    	System.out.println("False");
	    }
		
		assertEquals(7 / 21, associate);
		assertEquals(7D / 21D, net);
		assertEquals(wear / grocery, night); // declare wear as double of 3, 4 or 5.
//		// Declare grocery as double of 28, 29, or 30 etc but less than 37
//		// Declare night as a double value;
		assertTrue(Double.class.isInstance(D)); // replace `...` using the d or D suffix
		assertTrue(!Float.class.isInstance(d)); // replace `...` using the d or D suffix
		assertTrue(Float.class.isInstance(F)); // replace `...` using the f or F suffix
		assertFalse(ease); // declare ease as true if a float or a double should be used for money values,
							// else declare as false
	    
		
	}

}
