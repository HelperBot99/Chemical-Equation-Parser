import java.awt.Button;

import org.eclipse.swt.widgets.Text;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;

public class UI_Storage {
	
		//Simple mutiplication and division 
		static Text input1;
		static Text input2;
		static Text output;	
		
		static org.eclipse.swt.widgets.Button divide;
		static org.eclipse.swt.widgets.Button multiply;
		
		
		//Chemical Equation
		static Text ChemicalInput1;
		static Text ChemicalInput2;
		static Text ChemicalInput3;
		
		static Text ChemicalProduct2;
		static Text ChemicalProduct3;
		static Text UserInput;
		
		
		
		static Text ChemicalOutput;
		
		static Text ChemicalArrow;
		
		static Text ChemicalProduct;
		
		static int total_mass;
		
		static boolean contin;
		
		
	
		static org.eclipse.swt.widgets.Button Chemical_solve;
		
		
		//Periodic elements 
		String[]elements = 
		{
				
				
				"H",
				"Li",
				"Na",
				"K",
				"Rb",
				"Cs",
				
				"Be",
				"Mg",
				"Ca",
				"Sr",
				"Ba",
				
				"Sc",
				"Y",
				"La",
				
				"Ti",
				"Zr",
				"Hf",
				
				"V",
				"Nb",
				"Ta",
				
				"Cr",
				"Mo",
				"W",
				
				"Mn",
				"Tc",
				"Re",
				
				"Fe",
				"Ru",
				"Os",
				
				"Co",
				"Rh",
				"Ir",
				
				"Ni",
				"Pd",
				"Pt",
				
				"Cu",
				"Ag",
				"Au",
				
				"Zn",
				"Cd",
				"Hg",
				
				"B",
				"Al",
				"Ga",
				"In",
				"Tl",
				
				"C",
				"Si",
				"Ge",
				"Sn",
				"Pb",
				
				"N",
				"P",
				"As",
				"Sb",
				"Bi",
				
				"O",
				"S",
				"Se",
				"Te",
				
				"F",
				"Cl",
				"Br",
				"I",
				
				"He",
				"Ne",
				"Ar",
				"Kr",
				"Xe"

		
	
		};
		
		int[] element_mass = 
		{
					
				1,
				7,
				23,
				39,
				85,
				133,
				
				9,
				24,
				40,
				88,
				137,
				
				45,
				89,
				139,
				
				48,
				91,
				178,
				
				51,
				93,
				181,
				
				52,
				96,
				184,
				
				55,
				98,
				186,
				
				56,
				101,
				190,
				
				59,
				103,
				192,
				
				59,
				106,
				195,
				
				64,
				108,
				197,
				
				65,
				112,
				201,
				
				11,
				27,
				70,
				115,
				204,
				
				12,
				28,
				73,
				119,
				207,
				
				14,
				31,
				75,
				122,
				209,
				
				16,
				32,
				79,
				128,
				
				19,
				35,
				80,
				127,
				
				4,
				20,
				40,
				84,
				31
		

		
		};
		
	
	
	
	

}
