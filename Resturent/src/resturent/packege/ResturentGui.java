package resturent.packege;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class ResturentGui {

	private JFrame frmResturent;
	private JTextField textFieldChickenBuger;
	private JTextField textFieldChickenBugerMeal;
	private JTextField textFieldCheesBurger;
	private JTextField textDisplay;
	
	//Declare Variables of calculator
	double firstNum, secondNum,result;
	String operations,answer;
	private JTextField textFieldDrinksQuantity;
	private JTextField textField;
	private JTextField textCurruncy;
	JLabel labelShowTax,labelShowSubTotal,labelShowTotal,lblNewLabel_2;
	double totalDrinkCost;
	double totalMealCost;
	double totalTax;
	double totalDeliveryCost;
	double allTotal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResturentGui window = new ResturentGui();
					window.frmResturent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResturentGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResturent = new JFrame();
		frmResturent.setTitle("Resturent");
		frmResturent.setSize(1380,730);
		frmResturent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmResturent.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel1.setBounds(10, 141, 657, 332);
		frmResturent.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblChickenBuger = new JLabel("Chicken Buger");
		lblChickenBuger.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChickenBuger.setBounds(35, 32, 112, 25);
		panel1.add(lblChickenBuger);
		
		JLabel lblChickenBugerMeal = new JLabel("Chicken Buger Meal");
		lblChickenBugerMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChickenBugerMeal.setBounds(35, 68, 156, 25);
		panel1.add(lblChickenBugerMeal);
		
		JLabel lblCheesBurger = new JLabel("Chees Burger");
		lblCheesBurger.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheesBurger.setBounds(35, 104, 156, 25);
		panel1.add(lblCheesBurger);
		
		textFieldChickenBuger = new JTextField();
		textFieldChickenBuger.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldChickenBuger.setText("0");
		textFieldChickenBuger.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldChickenBuger.setBounds(366, 36, 156, 20);
		panel1.add(textFieldChickenBuger);
		textFieldChickenBuger.setColumns(10);
		
		textFieldChickenBugerMeal = new JTextField();
		textFieldChickenBugerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldChickenBugerMeal.setText("0");
		textFieldChickenBugerMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldChickenBugerMeal.setColumns(10);
		textFieldChickenBugerMeal.setBounds(366, 72, 156, 20);
		panel1.add(textFieldChickenBugerMeal);
		
		textFieldCheesBurger = new JTextField();
		textFieldCheesBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldCheesBurger.setText("0");
		textFieldCheesBurger.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldCheesBurger.setColumns(10);
		textFieldCheesBurger.setBounds(366, 108, 156, 20);
		panel1.add(textFieldCheesBurger);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDrinks.setBounds(35, 140, 156, 25);
		panel1.add(lblDrinks);
		
		JLabel lblQuantaty = new JLabel("Quantity");
		lblQuantaty.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuantaty.setBounds(366, 139, 156, 25);
		panel1.add(lblQuantaty);
		
		JComboBox comboBoxDrinks = new JComboBox();
		comboBoxDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select Drinks", "Cocacola", "Sprite", "Pepsi"}));
		comboBoxDrinks.setBounds(35, 176, 132, 20);
		panel1.add(comboBoxDrinks);
		
		textFieldDrinksQuantity = new JTextField();
		textFieldDrinksQuantity.setText("0");
		textFieldDrinksQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldDrinksQuantity.setColumns(10);
		textFieldDrinksQuantity.setBounds(366, 175, 156, 20);
		panel1.add(textFieldDrinksQuantity);
		
		JCheckBox chckbxHomeDelevery = new JCheckBox("Home Delevery");
		chckbxHomeDelevery.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxHomeDelevery.setBounds(35, 216, 132, 23);
		panel1.add(chckbxHomeDelevery);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxTax.setBounds(366, 216, 97, 23);
		panel1.add(chckbxTax);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 140, 621, 2);
		panel1.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(10, 474, 657, 133);
		frmResturent.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelCostofDrinks = new JLabel("Cost of Drinks");
		labelCostofDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelCostofDrinks.setBounds(34, 11, 112, 25);
		panel.add(labelCostofDrinks);
		
		JLabel labelCostofMeals = new JLabel("Cost of Meals");
		labelCostofMeals.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelCostofMeals.setBounds(34, 47, 156, 25);
		panel.add(labelCostofMeals);
		
		JLabel labelCostofDelivery = new JLabel("Cost of Delivery");
		labelCostofDelivery.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelCostofDelivery.setBounds(34, 83, 156, 25);
		panel.add(labelCostofDelivery);
		
		JLabel lblShowCostOfDrinks = new JLabel("");
		lblShowCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShowCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblShowCostOfDrinks.setBounds(375, 18, 143, 18);
		lblShowCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(lblShowCostOfDrinks);
		
		JLabel labelShowCostOfMeals = new JLabel("");
		labelShowCostOfMeals.setHorizontalAlignment(SwingConstants.RIGHT);
		labelShowCostOfMeals.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelShowCostOfMeals.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelShowCostOfMeals.setBounds(375, 54, 143, 18);
		panel.add(labelShowCostOfMeals);
		
		JLabel labelShowCostOfDelevery = new JLabel("");
		labelShowCostOfDelevery.setHorizontalAlignment(SwingConstants.RIGHT);
		labelShowCostOfDelevery.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelShowCostOfDelevery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelShowCostOfDelevery.setBounds(375, 90, 143, 18);
		panel.add(labelShowCostOfDelevery);
		
		JLabel lblNewLabel_1 = new JLabel("LKR");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(528, 18, 54, 18);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("LKR");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(528, 54, 54, 18);
		panel.add(label);
		
		JLabel label_1 = new JLabel("LKR");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(528, 90, 54, 18);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(670, 141, 308, 332);
		frmResturent.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBoxCorruncy = new JComboBox();
		comboBoxCorruncy.setModel(new DefaultComboBoxModel(new String[] {"Select One", "Sri Lanka", "India", "USA", "UK", "Austrailiaa"}));
		comboBoxCorruncy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxCorruncy.setBounds(36, 91, 214, 20);
		panel_1.add(comboBoxCorruncy);
		
		textCurruncy = new JTextField();
		textCurruncy.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCurruncy.setColumns(10);
		textCurruncy.setBounds(36, 141, 214, 49);
		panel_1.add(textCurruncy);
		
		JLabel labelCurruncy = new JLabel("");
		labelCurruncy.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCurruncy.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelCurruncy.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCurruncy.setBounds(36, 226, 214, 29);
		panel_1.add(labelCurruncy);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnConvert.setBounds(36, 284, 115, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnClose.setBounds(161, 284, 106, 23);
		panel_1.add(btnClose);
		
		JLabel lblCorruncyConverter = new JLabel("Curruncy Converter");
		lblCorruncyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCorruncyConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorruncyConverter.setBounds(36, 26, 233, 29);
		panel_1.add(lblCorruncyConverter);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(10, 608, 1332, 72);
		frmResturent.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double chikenBuger = Double.parseDouble(textFieldChickenBuger.getText());
				double pChikenBuger = 400;
				double cochikenBuger;
				cochikenBuger = (chikenBuger*pChikenBuger);
				String PrzChikenBurger = String.format("%.2f", cochikenBuger);
				labelShowCostOfMeals.setText(PrzChikenBurger);
				
				double chikenBugerMeal = Double.parseDouble(textFieldChickenBugerMeal.getText());
				double pChikenBugerMeal = 1400;
				double cochikenBugerMeal;
				cochikenBugerMeal =(chikenBugerMeal*pChikenBugerMeal);
				String PrzChickenBugerMeal = String.format("%.2f", cochikenBugerMeal+cochikenBuger );
				labelShowCostOfMeals.setText(PrzChickenBugerMeal);
				
				double cheesBuger = Double.parseDouble(textFieldCheesBurger.getText());
				double pCheesBuger = 300;
				double cocheesBuger;
				cocheesBuger =(cheesBuger*pCheesBuger);
				String PrzCheesBurger = String.format("%.2f", cocheesBuger+cochikenBugerMeal+cochikenBuger );
				labelShowCostOfMeals.setText(PrzCheesBurger);
				
				
				//<-----------------------------------------Home Delivery-------------------------------------------------------------------------------------->
				
				double hDelevery= 100;
				
				if(chckbxHomeDelevery.isSelected())
				{
					String HmDlevary = String.format("%.2f", hDelevery);
					labelShowCostOfDelevery.setText(HmDlevary);
				}
				else
					labelShowCostOfDelevery.setText("0");
				
				//<-----------------------------------------Tax-------------------------------------------------------------------------------------->
				
				double Atax= 5;
				if(chckbxTax.isSelected())
				{
					String ATax = String.format("%.2f", Atax);
					labelShowTax.setText(ATax);
				}
				else
					labelShowTax.setText("0");

				
				//<-----------------------------------------Drinks-------------------------------------------------------------------------------------->

				
				double Drinks = Double.parseDouble(textFieldDrinksQuantity.getText());
				double coc= 120*Drinks;
				double sprite= 100*Drinks;
				double pepsi= 80*Drinks;
				
				if(comboBoxDrinks.getSelectedItem().equals("Cocacola"))
				{
					String Coc = String.format("%.2f", coc);
					lblShowCostOfDrinks.setText(Coc);
				}
				else if(comboBoxDrinks.getSelectedItem().equals("Sprite"))
				{
					String Spi = String.format("%.2f", sprite);
					lblShowCostOfDrinks.setText(Spi);
				}
				else if(comboBoxDrinks.getSelectedItem().equals("Pepsi"))
				{
					String Pps = String.format("%.2f", pepsi);
					lblShowCostOfDrinks.setText(Pps);
				
				}
				else 
					lblShowCostOfDrinks.setText("0");
				
				//<-----------------------------------------Drinks-------------------------------------------------------------------------------------->
				
				
				 totalDrinkCost = Double.parseDouble(lblShowCostOfDrinks.getText());
				 totalMealCost = Double.parseDouble(labelShowCostOfMeals.getText());
				 totalTax = Double.parseDouble(labelShowTax.getText());
				 totalDeliveryCost = Double.parseDouble(labelShowCostOfDelevery.getText());
				 allTotal = (totalDrinkCost + totalMealCost + totalTax + totalDeliveryCost);
				String Ftotal = String.format("%.2f",allTotal);
				lblNewLabel_2.setText(Ftotal);
				
				double allSubTotal = (totalDrinkCost + totalMealCost + totalDeliveryCost);
				String newAllSubTotal = String.format("%.2f", allSubTotal);
				labelShowSubTotal.setText(newAllSubTotal);
				
				
				
				
				
				
			}
		});
		btnTotal.setForeground(Color.BLUE);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(274, 22, 89, 23);
		panel_2.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("**************************************************************************\n");
				
//				double RCHb = Double.parseDouble(textFieldChickenBuger.getText());//textFieldChickenBuger.getText()
//				double Rmeal = Double.parseDouble(textFieldChickenBugerMeal.getText());
//				double Rcb= Double.parseDouble(textFieldCheesBurger.getText());
//				double Rdrink= Double.parseDouble(textFieldDrinksQuantity.getText());
//				double Rdv= Double.parseDouble(labelShowCostOfDelevery.getText());
//				double Rtax= Double.parseDouble(labelShowTax.getText());
//				double Rtotal= Double.parseDouble(lblNewLabel_2.getText());
//				
//				textField.setText("\t\nResturent Management System:\n\n" + "Chiken Burger:\t\t" + RCHb + "\nChiken Burger Meal:\t\t" +Rmeal+ "\nChees Buger\t\t" 
//				+ Rcb + "\nDrinks\t\t" + Rdv + "\nTax\t\t" +Rtax+ "\nTotalt\t" + Rtotal);
				
			}
		});
		btnReceipt.setForeground(Color.BLUE);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReceipt.setBounds(486, 22, 89, 23);
		panel_2.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				lblNewLabel_2.setText(null);
				textDisplay.setText(null);
				textFieldChickenBuger.setText("0");
				textFieldChickenBugerMeal.setText("0");
				textFieldCheesBurger.setText("0");
				textFieldDrinksQuantity.setText("0");
				lblShowCostOfDrinks.setText(null);
				labelShowCostOfMeals.setText(null);
				labelShowCostOfDelevery.setText(null);
				textCurruncy.setText(null);
				labelCurruncy.setText(null);
				labelShowTax.setText(null);
				labelShowSubTotal.setText(null);
				labelShowTotal.setText(null);
				textCurruncy.setText(null);
				labelCurruncy.setText(null);
				comboBoxDrinks.setSelectedItem("Select Drinks");
				comboBoxCorruncy.setSelectedItem("Select one");
				
				
				
				
				
				
				
				
			}
		});
		btnReset.setForeground(Color.BLUE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(725, 22, 89, 23);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);// To Exit the window
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(934, 22, 89, 23);
		panel_2.add(btnExit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBounds(670, 474, 308, 133);
		frmResturent.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTax.setBounds(10, 11, 57, 25);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubTotal.setBounds(10, 47, 92, 25);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setBounds(10, 83, 57, 25);
		panel_3.add(lblTotal);
		
		labelShowSubTotal = new JLabel("");
		labelShowSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		labelShowSubTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelShowSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelShowSubTotal.setBounds(107, 54, 113, 18);
		panel_3.add(labelShowSubTotal);
		
		labelShowTax = new JLabel("");
		labelShowTax.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		labelShowTax.setHorizontalAlignment(SwingConstants.RIGHT);
		labelShowTax.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelShowTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelShowTax.setBounds(107, 18, 113, 18);
		panel_3.add(labelShowTax);
		
		JLabel label_2 = new JLabel("LKR");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(230, 18, 54, 18);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("LKR");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(230, 54, 54, 18);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("LKR");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(230, 90, 54, 18);
		panel_3.add(label_4);
		labelShowTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2.setBounds(107, 83, 113, 21);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(980, 141, 362, 466);
		frmResturent.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 342, 444);
		panel_4.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_5, null);
		panel_5.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 337, 383);
		panel_5.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setBounds(248, 382, 89, 23);
		panel_5.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setLayout(null);
		//Calculator
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		textDisplay.setColumns(10);
		textDisplay.setBounds(51, 11, 230, 50);
		panel_6.add(textDisplay);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(51, 80, 110, 50);
		panel_6.add(btnC);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "%";
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(171, 81, 50, 50);
		panel_6.add(button_1);
		
		JButton button_2 = new JButton("+/-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double ops = Double.parseDouble(textDisplay.getText());
				ops = ops *(-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_2.setBounds(231, 80, 50, 50);
		panel_6.add(button_2);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "+";
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddition.setBounds(231, 141, 50, 50);
		panel_6.add(btnAddition);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn9.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(171, 141, 50, 50);
		panel_6.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn8.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(111, 141, 50, 50);
		panel_6.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn7.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(51, 141, 50, 50);
		panel_6.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn4.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(51, 202, 50, 50);
		panel_6.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn5.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(111, 202, 50, 50);
		panel_6.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn6.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(171, 202, 50, 50);
		panel_6.add(btn6);
		
		JButton btnSubstraction = new JButton("-");
		btnSubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "-";
			}
		});
		btnSubstraction.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubstraction.setBounds(231, 202, 50, 50);
		panel_6.add(btnSubstraction);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "*";
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplication.setBounds(231, 263, 50, 50);
		panel_6.add(btnMultiplication);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn3.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(171, 263, 50, 50);
		panel_6.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textDisplay.getText() + btn2.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn3.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(111, 263, 50, 50);
		panel_6.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textDisplay.getText() + btn1.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn3.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(51, 263, 50, 50);
		panel_6.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btn0.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(51, 324, 50, 50);
		panel_6.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number = textDisplay.getText() + btnDot.getText();// 1.this is how to display on values use buttons
				textDisplay.setText(Number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(111, 324, 50, 50);
		panel_6.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(textDisplay.getText());
				if(operations == "+")
				{
					result = firstNum + secondNum;
					answer = String.format("%.2f",result);
					textDisplay.setText(answer);
					
				}
				else if(operations == "-")
				{
					result = firstNum - secondNum;
					answer = String.format("%.2f",result);
					textDisplay.setText(answer);
					
				}
				else if(operations == "*")
				{
					result = firstNum * secondNum;
					answer = String.format("%.2f",result);
					textDisplay.setText(answer);
					
				}
				else if(operations == "%")
				{
					result = firstNum % secondNum;
					answer = String.format("%.2f",result);
					textDisplay.setText(answer);
					
				}
				else if(operations == "/")
				{
					result = firstNum / secondNum;
					answer = String.format("%.2f",result);
					textDisplay.setText(answer);
					
				}
				else
					result = firstNum * secondNum;
				answer = String.format("%.2f",result);
				textDisplay.setText(answer);
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(171, 324, 50, 50);
		panel_6.add(btnEqual);
		
		JButton btnDevide = new JButton("/");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "/";
			}
		});
		btnDevide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDevide.setBounds(231, 324, 50, 50);
		panel_6.add(btnDevide);
		
		JLabel lblNewLabel = new JLabel("Resturant Managment Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(260, 25, 825, 85);
		frmResturent.getContentPane().add(lblNewLabel);
	}
}
