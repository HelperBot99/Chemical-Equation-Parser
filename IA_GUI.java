import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.*;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;


class b_check
{
	
	private static boolean start_program = false;
	
	public Boolean getBoolean()
	{
		
		return start_program;
	}
	
	public void setBoolean(Boolean b)
	{
		this.start_program = b;
	}
	
	
	
	
}



public class IA_GUI extends UI_Storage {
	private static Text Woop;
	static boolean active = false;
	static int[] bounds = {10, 131, 94, 28};
	
	int reactant_len = 0;
	String[] reactant_control;
	
	int product_len = 0;
	String[] product_control;
	
	static String sValue_one = "";
	static String sValue_two = "";
	
	static boolean setActive = false;
	
	

	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Source key = new Source();
		UI_Storage UIKey = new UI_Storage();
		
		
		
		Display display = Display.getDefault();
		Shell ChemistryCalc = new Shell();
		ChemistryCalc.setSize(450, 300);
		ChemistryCalc.setText("Chemistry Calculator");
		
		Menu menu = new Menu(ChemistryCalc, SWT.BAR);
		ChemistryCalc.setMenuBar(menu);
		
		MenuItem menuFeatures = new MenuItem(menu, SWT.CASCADE);
		menuFeatures.setText("Features");
		
		Menu menu_1 = new Menu(menuFeatures);
		menuFeatures.setMenu(menu_1);
		
		MenuItem menuConversion = new MenuItem(menu_1, SWT.NONE);
		menuConversion.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				
				
				//Encapsulation
				
				b_check obj = new b_check();
				Source myObj = new Source();
				
				
				if(myObj.rollcall() == true)
				{
					obj.setBoolean(true);
				}			
				
				
				if(obj.getBoolean() == true)
				{
				//
				//Enter in conversion code here for menuConversion
				Shell ConversionWindow = new Shell();
				ConversionWindow.setSize(450, 300);
				ConversionWindow.setText("Conversion Machine 2000");
				ConversionWindow.open();
				ConversionWindow.layout();
				
				Menu menu = new Menu(ConversionWindow, SWT.BAR);
				ConversionWindow.setMenuBar(menu);
				
				MenuItem menuClose = new MenuItem(menu, SWT.CASCADE);
				
				Menu menu_1 = new Menu(menuClose);
				menuClose.setMenu(menu_1);
				menuClose.setText("Activation");
				
				MenuItem md = new MenuItem(menu_1, SWT.NONE);
				md.setText("Simple multiplication/division");
				
				//Action handle for closing the Conversion window
				md.addSelectionListener(new SelectionAdapter() 
				{
					@Override
					public void widgetSelected(SelectionEvent e) 
					{
						
						//ConversionWindow.close();
						//System.out.println("Closing");
					
						UIKey.input1 = new Text(ConversionWindow, SWT.BORDER);
						UIKey.input1.setBounds(130, 80, 182, 19);
						
						UIKey.input2 = new Text(ConversionWindow, SWT.BORDER);
						UIKey.input2.setBounds(130, 100, 182, 19);
						
						UIKey.output = new Text(ConversionWindow, SWT.BORDER);
						UIKey.output.setBounds(130, 120, 182, 19);
								
						UIKey.multiply = new Button(ConversionWindow, SWT.NONE);
						UIKey.multiply.setBounds(10, 111, 94, 28);
						UIKey.multiply.setText("Multiply");
						
						MD MDKey = new MD();
						MDKey.main();
						
						
						
						//Polymorph
						
						UIKey.multiply.addSelectionListener(new SelectionAdapter() 
						{
							@Override
							public void widgetSelected(SelectionEvent e) 
							{
								Double value = Double.parseDouble(UIKey.input1.getText());
								Double value_two = Double.parseDouble(UIKey.input2.getText());
																
								double final_value = value * value_two;
								
								String sValue = Double.toString(final_value);
								//UIKey.output.setText(sValue);
								sValue_one = sValue;
								
								MD MDKey = new Multiply();
								MDKey.main();
								
								
							}
						});
						
						
						
						UIKey.divide = new Button(ConversionWindow, SWT.NONE);
						UIKey.divide.setBounds(10, 131, 94, 28);
						UIKey.divide.setText("Divide");	
						UIKey.divide.addSelectionListener(new SelectionAdapter() 
						{
							@Override
							public void widgetSelected(SelectionEvent e)
							{
								Double value = Double.parseDouble(UIKey.input1.getText());
								Double value_two = Double.parseDouble(UIKey.input2.getText());
																
								double final_value = value / value_two;
								
								String sValue = Double.toString(final_value);
								//UIKey.output.setText(sValue);
								sValue_two = sValue;
								MD MDKey = new Divide();
								MDKey.main();
								
							}
								
							
						});
						
						
						
						
						
						
						
					
						
					}
				});
				
				
				MenuItem equation = new MenuItem(menu_1, SWT.NONE);
				equation.setText("Chemical Equation");
				
				equation.addSelectionListener(new SelectionAdapter() 
				{
					
					public void widgetSelected(SelectionEvent e)
					{
					
						if(active == true) 
						{
							UIKey.input1.setVisible(false);
							UIKey.input2.setVisible(false);
							UIKey.output.setVisible(false);
							UIKey.multiply.setVisible(false);
							UIKey.divide.setVisible(false);
							
							active = false;
						} 
						
						UIKey.ChemicalInput1 = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.ChemicalInput1.setBounds(50, 80, 150, 19);
						UIKey.ChemicalInput1.setText("Enter chemical reactants");
						
						UIKey.ChemicalProduct = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.ChemicalProduct.setBounds(260,80,150,19);
						UIKey.ChemicalProduct.setText("Enter chemical products");
						
						UIKey.ChemicalInput2 = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.ChemicalInput2.setBounds(130, 100, 182, 19);
						UIKey.ChemicalInput2.setText("First Chemical Reactant");
						
						UIKey.ChemicalInput3 = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.ChemicalInput3.setBounds(130, 120, 182, 19);
						UIKey.ChemicalInput3.setText("Second Chemical Reactant");
						
						UIKey.ChemicalProduct2 = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.ChemicalProduct2.setBounds(130, 140, 182, 19);
						UIKey.ChemicalProduct2.setText("First Chemical Product");
						
						UIKey.ChemicalProduct3 = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.ChemicalProduct3.setBounds(130, 160, 182, 19);
						UIKey.ChemicalProduct3.setText("Second Chemical Product");
						
						UIKey.UserInput = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.UserInput.setBounds(130, 200, 182, 19);
						UIKey.UserInput.setText("Enter value");
						
						UIKey.Chemical_solve = new Button(ConversionWindow, SWT.CASCADE);
						UIKey.Chemical_solve.setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
						UIKey.Chemical_solve.setText("Solve");
						
						UIKey.ChemicalArrow = new Text(ConversionWindow, SWT.CASCADE);
						UIKey.ChemicalArrow.setBounds(200,80,80,19);
						UIKey.ChemicalArrow.setText("→");
												
						UIKey.Chemical_solve.addSelectionListener(new SelectionAdapter() 
						{
							@Override
							public void widgetSelected(SelectionEvent e)
							{							
								chemical_reactant();
								if(setActive == false)
								{
									chemical_product();
									setActive = false;
								}
							}
							
						});
						
					}
					
				});
				
				
				
				
				
			}
			}
		});
		menuConversion.setText("Conversion");
		
		//MenuItem menuBalance = new MenuItem(menu_1, SWT.NONE);
		//menuBalance.setText("Balance");
		
		//MenuItem menuOther = new MenuItem(menu_1, SWT.NONE);
		//menuOther.setText("Other");
		
		
		
		output_window = new Text(ChemistryCalc, SWT.BORDER);
		output_window.setText("Output window");
		output_window.setBounds(10, 46, 430, 104);
		
		the_output = new Text(ChemistryCalc, SWT.BORDER);
		the_output.setText("Output");
		the_output.setBounds(124, 21, 168, 19);
				

		ChemistryCalc.open();
		ChemistryCalc.layout();
		
		while (!ChemistryCalc.isDisposed()) 
		{
			if (!display.readAndDispatch()) 
			{
				display.sleep();
			}
		}
		
	}
	
	
	static String reactant_string = "";
	static double reactant_int = 0;
	static double reactant_mass = 0;
	
	static String reactant_temp2 = "";
	static double temp2_int = 0;
	static double temp2_mass = 0;
	
	static boolean con = false;
	static boolean play = true;
	
	
	
	
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_ENTER) {
	        the_output.setText("Lol");
	    }

	    
	}
	
	
	
	
	
	
	
	
	
	static void chemical_reactant()
	{
		
		Source key = new Source();
		UI_Storage UIKey = new UI_Storage();
		
		String input = UIKey.ChemicalInput1.getText();
		String[] input_array = input.split("\\+");
		int[] value_conversion = new int[input_array.length];
		String storage = "";
		
		
		String storage_two;
		String[] compound_storage = new String[input_array.length];
		
		String[] compounds = new String[input_array.length];
		int[] compound_mass = new int[input_array.length];
		
		String[] portal = new String[input_array.length];
		
		int pos_one = 0;
		
		
		for(int i = 0; i < input_array.length; i++)
		{
			String storage_value = input_array[i];
			loop:
			for(int gawoop = 0; gawoop < storage_value.length(); gawoop++)
			{
				
				if(Character.isUpperCase(storage_value.charAt(gawoop)))
				{
					pos_one = gawoop;
					String holder = storage_value.substring(pos_one, storage_value.length());
					//System.out.println(holder);
					int compoundMass = key.seperator(holder);
					portal[i] = holder;
					compound_mass[i] = compoundMass;
					break loop;
					
				}
				
			}
			
			
		}
		
		for(int i = 0; i < compound_mass.length; i++)
		{
			//System.out.println(compound_mass[i]);
		}
		
		

		for(int i = 0; i < input_array.length; i++)
		{
			String storage_value = input_array[i];
			
												
			currentLoop:
			for(int x = 0; x < storage_value.length(); x++) 
			{
				char location = storage_value.charAt(x);
				
				if(Character.isLetter(location))
				{
					input_array[i] = input_array[i].substring(0, x);
					//System.out.println(input_array[i]);
					int woop = Integer.parseInt(input_array[i]);
					//System.out.println(woop);					
					value_conversion[i] = woop;
					//System.out.println(value_conversion[i]);
					
					break currentLoop;	
				}	
			}
		}
		
		for(int i = 0; i < input_array.length; i++)
		{
			String storage_value = input_array[i];
			
			
			
			currentLoop:
			for(int x = 0; x < storage_value.length(); x++) 
			{
				char location = storage_value.charAt(x);
				
				if(Character.isLetter(storage_value.charAt(x)) && Character.isDigit(storage_value.charAt(x+1)))
				{
					System.out.println("True");
						
				}	
			}						
			
		}
		
		
		//int total = value_conversion[0] * compound_mass[0];

		//System.out.println("[Chemical Reactant]Length of value conversion: " + value_conversion.length);
		//System.out.println("[Chemical Reactant]Length of compound mass: " + compound_mass.length);
		//System.out.println("");
		
		
		
		int[] total = new int[value_conversion.length];
		String element_name[] = new String[total.length];
		
		Map<String, Integer> vault = new HashMap();
		
		String temp = UIKey.ChemicalInput2.getText();
		String temp2 = UIKey.ChemicalInput3.getText();
		
		String holding = "";
		String product_holding = "";
		
		String UserValue = UIKey.UserInput.getText();
		double parseVal = Double.parseDouble(UserValue);
		
		double inital1 = 0;
		double moles = 0;
		double product_moles = 0;
		
		double inital2 = 0;
		double moles2 = 0;
		
		
		//System.out.println(temp);
		loop:
		for(int i = 0; i < total.length; i++)
		{
			
			
			total[i] = value_conversion[i] * compound_mass[i];
			//System.out.println(portal[i] + " " + total[i]);
			
			if(temp.equals(portal[i]))
			{
				inital1 = total[i];
				moles = value_conversion[i];
				holding = portal[i];
				reactant_mass = compound_mass[i];
				play = true;
				//System.out.println(play);
				
				
			}
			
		
			
			if(temp2.equals(portal[i])) 
			{
				inital2 = total[i];
				moles2 = value_conversion[i];
				product_holding = portal[i];
				temp2_mass = compound_mass[i];
				//System.out.println(product_holding);
				reactant_string = product_holding;
				reactant_int = moles2;
				//System.out.println(play);
				if(play == true)
				{
					con = true;
					break;
				}
			
			
			}else if(!temp2.equals((portal[i])) && i == total.length-1)
			{
								
				reactant_string = holding;
				reactant_int = moles;		
				
				con = false;
				
				
			}
			
			
			if(!temp.equals(portal[i]) && i == total.length-2)
			{
				//System.out.println(portal[i]);
				//System.out.println(temp);
				//System.out.println(portal[i]);
				product_holding = portal[total.length-1];
				//System.out.println("Waawwoooooom");
				reactant_string = product_holding;
				reactant_int = moles;
				con = false;
				play = false;
				
			}
			
			
			
			
		}
		
	
		
		
		
		double valueMoles = 0;
		double valueMass = 0;
		if(con == true)
		{
			
				
			
				double sum = reactant_mass;
				double sum_two = reactant_int * temp2_mass;
				
				double value_par = Double.parseDouble(UIKey.UserInput.getText());
				
				double total_grams = (value_par/sum)*(reactant_int/moles)*temp2_mass;
				String equation_grams = ("(" + value_par + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + reactant_int + " moles" + ")" + "/" + "(" + moles + " moles" + ")" + " x " + temp2_mass + " grams" + " = " + total_grams);
				
				
				double total_moles = (value_par/sum)*(reactant_int/moles);
				String equation_moles = ("(" + value_par + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + reactant_int + " moles" + ")" + "/" + "(" + moles + " moles" + ")" + " = " + total_moles);
				
				double total_volume = (value_par/sum)*(reactant_int/moles)*22.7;
				String equation_volume = ("(" + value_par + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + reactant_int + " moles" + ")" + "/" + "(" + moles + " moles" + ")" + " x " + 22.7 + " dm3" + " = " + total_volume);
				
				
				
				System.out.println("Bazinga");
				System.out.println(the_output.getText());
				output_window.setText(equation_grams + "\n" + equation_moles + "\n" + equation_volume);
				
		
			
			
			con = false;	
			play = false;	
			
		
			
		}
		
		

		
		
	}
	
	static String product_string = "";
	static double product_int = 0;
	static double product_mass = 0;
	private static Text output_window;
	private static Text the_output;
	static void chemical_product()
	{
		
		//System.out.println("Reactant_string: " + reactant_string);
		//System.out.println("Reactant_int: " + reactant_int);
		
		Source key = new Source();
		UI_Storage UIKey = new UI_Storage();
	
		String input = UIKey.ChemicalProduct.getText();
		String[] input_array = input.split("\\+");
		int[] value_conversion = new int[input_array.length];
		String storage = "";
		
		String storage_two;
		String[] compound_storage = new String[input_array.length];
		
		String[] compounds = new String[input_array.length];
		int[] compound_mass = new int[input_array.length];
		String[] portal = new String[input_array.length];
		
		int pos_one = 0;
		
		for(int i = 0; i < input_array.length; i++)
		{
			String storage_value = input_array[i];
			loop:
			for(int gawoop = 0; gawoop < storage_value.length(); gawoop++)
			{
				
				if(Character.isUpperCase(storage_value.charAt(gawoop)))
				{
					pos_one = gawoop;
					String holder = storage_value.substring(pos_one, storage_value.length());
					//System.out.println(holder);
					int compoundMass = key.seperator(holder);
					portal[i] = holder;
					compound_mass[i] = compoundMass;
					break loop;
					
				}
				
			}
			
			
		}
		
		for(int i = 0; i < compound_mass.length; i++)
		{
			//System.out.println(compound_mass[i]);
		}
		
		
		
		for(int i = 0; i < input_array.length; i++)
		{
			String storage_value = input_array[i];
			
												
			currentLoop:
			for(int x = 0; x < storage_value.length(); x++) 
			{
				char location = storage_value.charAt(x);
				
				if(Character.isLetter(location))
				{
					input_array[i] = input_array[i].substring(0, x);
					//System.out.println(input_array[i]);
					int woop = Integer.parseInt(input_array[i]);
					//System.out.println(woop);					
					value_conversion[i] = woop;
					//System.out.println(value_conversion[i]);
					
					break currentLoop;	
				}	
			}
		}
		
		for(int i = 0; i < input_array.length; i++)
		{
			String storage_value = input_array[i];
			
			
			
			currentLoop:
			for(int x = 0; x < storage_value.length(); x++) 
			{
				char location = storage_value.charAt(x);
				
				if(Character.isLetter(storage_value.charAt(x)) && Character.isDigit(storage_value.charAt(x+1)))
				{
					System.out.println("True");
						
				}	
			}						
			
		}
		
		
		
		int[] total = new int[value_conversion.length];
		String element_name[] = new String[total.length];
		
		Map<String, Integer> vault = new HashMap();
		
		String temp = UIKey.ChemicalProduct2.getText();
		String temp2 = UIKey.ChemicalProduct3.getText();
		
		String holding = "";
		String product_holding = "";
		
		String UserValue = UIKey.UserInput.getText();
		double parseVal = Double.parseDouble(UserValue);
		
		double inital1 = 0;
		double moles = 0;
		double product_moles = 0;
		double inital2 = 0;
		
		double mass1 = 0;
		double mass2 = 0;
		
		boolean contin = false;
		
		
		loop:
		for(int i = 0; i < total.length; i++)
		{
			if(con == false)
			{
				
				if(temp.equals(portal[i]))
				{
				
					holding = portal[i];
					moles = value_conversion[i];
					mass1 = compound_mass[i];
					

					product_string = holding;
					product_int = moles;
					product_mass = mass1;
				}
				
				if(temp2.equals(portal[i]))
				{
					
					product_holding = portal[i];
					product_moles = value_conversion[i];
					mass2 = compound_mass[i];
										
					product_string = product_holding;
					product_int = product_moles;
					product_mass = mass2;
					
					
				}		
				
				
			}
						
			
		}
		
		
		
		
		if(con == false)
		{	
			if(reactant_string.equals("") && reactant_int == 0)
			{			
				
				
				String output = the_output.getText();
				
				if(output.equals("grams"))
				{
				
					double sum = mass1;
					double sum_two = product_moles * mass2;
					System.out.println(sum_two);
					double value_par = Double.parseDouble(UIKey.UserInput.getText());
					
					double total_grams = (value_par/sum)*(moles/product_moles)*mass2;
					String equation_grams = ("(" + value_par + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + moles + " moles" + ")" + "/" + "(" + product_moles + " moles" + ")" + " x " + mass2 + " grams" + " = " + total_grams);
					
					double total_moles = (value_par/sum)*(moles/product_moles);
					String equation_moles = ("(" + value_par + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + moles + " moles" + ")" + "/" + "(" + product_moles + " moles" + ")" + " = " + total_moles);
					
					double total_volume = (value_par/sum)*(moles/product_moles) * 22.7;
					String equation_volume = ("(" + value_par + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + moles + " moles" + ")" + "/" + "(" + product_moles + " moles" + ")" + " x " + 22.7 + " dm3 " + " = " + total_volume);
					
					output_window.setText(equation_grams + "\n" + equation_moles + "\n" + equation_volume);
					
					
				}
				
				
				if(output.equals("mole"))
				{
					double sum = mass1;
					double sum_two = product_moles * mass2;
					System.out.println(sum_two);
					double value_par = Double.parseDouble(UIKey.UserInput.getText());
					
					double total_moles = (value_par)*(moles/product_moles);
					String equation_moles = ("(" + value_par + " moles" + ")"  + " x " + "(" + moles + " moles" + ")" + "/" + "(" + product_moles + " moles" + ")" + " = " + total_moles);
					
					double total_grams = (value_par)*(moles/product_moles) * mass2;
					String equation_grams = ("(" + value_par + " moles" + ")" + " x " + "(" + moles + " moles" + ")" + "/" + "(" + product_moles + " moles" + ")" + " = " + total_grams);
					
					double total_volume = (value_par/sum)*(moles/product_moles) * 22.7;
					String equation_volume = ("(" + value_par + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + moles + " moles" + ")" + "/" + "(" + product_moles + " moles" + ")" + " x " + 22.7 + " dm3 " + " = " + total_volume);
					
					output_window.setText(equation_grams + "\n" + equation_moles + "\n" + equation_volume);
					
				}
				
				
				
				
				
				
				
				//output_window.setText(String.valueOf(final_total));
				
			
			}else if(!reactant_string.equals("") && reactant_int != 0)
			{				
				
				String output = the_output.getText();
				
				if(output.equals("grams"))
				{
				
					System.out.println(product_moles * mass2);
					
					double sum = reactant_mass;
					double product_sum = product_moles * mass2;
					
					double big_sum = sum + product_sum;
					
					double output_storage = Double.parseDouble(UIKey.UserInput.getText());
					
					double total_grams = (output_storage/sum) * (product_moles/reactant_int) * mass2;
					String equation_grams = ("(" + output_storage + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + product_moles + " moles" + ")" + "/" + "(" + reactant_int + " moles" + ")" + " x " + mass2 + " grams" + " = " + total_grams);

					double total_moles = (output_storage/sum) * (product_moles/reactant_int);
					String equation_moles = ("(" + output_storage + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + product_moles + " moles" + ")" + "/" + "(" + reactant_int + " moles" + ")" + " = " + total_moles);

					double total_volume = (output_storage/sum) * (product_moles/reactant_int) * 22.7;
					String equation_volume = ("(" + output_storage + " grams" + ")" + "/" + sum + " grams" + " x " + "(" + product_moles + " x " +  " moles" + ")" + "/" + "(" + reactant_int + " moles" + ")" + 22.7 + "dm3" + " = " + total_volume);

					output_window.setText(String.valueOf(equation_grams + "\n" + equation_moles + "\n" + equation_volume));

					
				}
				
				
				if(output.equals("mole"))
				{
					double sum = reactant_mass;
					double product_sum = product_moles * mass2;
					
					double big_sum = sum + product_sum;
					
					double output_storage = Double.parseDouble(UIKey.UserInput.getText());
					double total_moles = (output_storage)*(product_moles/reactant_int);
					String equation_moles = ("(" + output_storage + " moles" + ")"  + " x " + "(" + product_moles + " moles" + ")" + "/" + "(" + reactant_int + " moles" + ")" + " = " + total_moles);
					
					double total_grams = (output_storage)*(product_moles/reactant_int) * mass2;
					String equation_grams = ("(" + output_storage + " moles" + ")" + " x " + "(" + product_moles + " moles" + ")" + "/" + "(" + reactant_int + " moles" + ")" + " x " + mass2 + " = " + total_grams);
					
					double total_volume = (output_storage)*(product_moles/reactant_int) * 22.7;
					String equation_volume = ("(" + output_storage + " moles" + ")" + " x "	+ "" + "(" + product_moles + " moles" + ")" + "/" + "(" + reactant_int + " moles" + ")" + " x " + 22.7 + " dm3 " + " = " + total_volume);
					
					output_window.setText(equation_grams + "\n" + equation_moles + "\n" + equation_volume);
					
				}
				
				
				
				
				
			}
		}
		
		
		
		
		
	}
	
	
	
}
