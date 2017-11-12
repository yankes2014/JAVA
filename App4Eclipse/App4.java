package reaktor;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class App4 {

	public static void main(String[] args)
	{
		JFrame Okno = new JFrame("App4");
		JButton btn = new JButton("Wypisz");
		JButton btn2 = new JButton("Wyjdz");
		JTextField textfield1 = new JTextField();
		JTextField textfield2 = new JTextField();
		JTextField textfield3 = new JTextField();
		JTextField textfield4 = new JTextField();
		JLabel label1 = new JLabel("Imie");
		JLabel label2 = new JLabel("Nazwisko");
		JLabel label3 = new JLabel("Stanowisko");
		JLabel label4 = new JLabel("Email");
		JLabel label5 = new JLabel("Jakie znasz jezyki programowania?");
		JLabel label6 = new JLabel("Wybierz poziom jezyka angielskiego?");
		JLabel label7 = new JLabel("Wybierz kurs programowania?");
		JLabel label8 = new JLabel("Dane kontaktowe:");
		JLabel label9 = new JLabel();
		JLabel label10 = new JLabel("Informacje zawodowe:");
		JLabel label11 = new JLabel("Java");
		JLabel label12 = new JLabel("Python");
		JLabel label13 = new JLabel("Inne");
		JLabel label14 = new JLabel("Angielski");
		JLabel label15 = new JLabel("Wybrany kurs: ");
		JLabel label16 = new JLabel("");
		JLabel label17 = new JLabel("");
		JCheckBox checkbox1 = new JCheckBox("Java");
		JCheckBox checkbox2 = new JCheckBox("Python");
		JCheckBox checkbox3 = new JCheckBox("Inne");
		JRadioButton radiobtn1 = new JRadioButton("podstawowy");
		JRadioButton radiobtn2 = new JRadioButton("srednio-zaawansowany");
		JRadioButton radiobtn3 = new JRadioButton("zaawansowany");
		String[] wybory = { "Back-EndDeveloper", "Front-EndDeveloper"};
		JComboBox combobox1 = new JComboBox(wybory);
		
		Okno.setVisible(true);
		Okno.setSize(1000, 500);
		Okno.setLayout(null);
		//1 kolumna
		label1.setBounds(50, 60, 200, 20);
		label2.setBounds(50, 100, 200, 20);
		label3.setBounds(50, 140, 200, 20);
		label4.setBounds(50, 180, 200, 20);
		btn.setBounds(50, 290, 90, 40);
		btn2.setBounds(200, 290, 90, 40);
		//2 kolumna
		label5.setBounds(400, 60, 250, 20);
		checkbox1.setBounds(400, 80, 200, 20);
		checkbox2.setBounds(400, 100, 200, 20);
		checkbox3.setBounds(400, 120, 200, 20);
		label6.setBounds(400, 160, 250, 20);
		radiobtn1.setBounds(400, 180, 200, 20);
		radiobtn2.setBounds(400, 200, 200, 20);
		radiobtn3.setBounds(400, 220, 200, 20);
		label7.setBounds(400, 260, 250, 20);
		combobox1.setBounds(400, 280, 250, 20);
		//3 kolumna
		label8.setBounds(650, 60, 250, 20);
		label9.setBounds(650, 80, 300, 20);
		label10.setBounds(650, 120, 250, 20);
		label11.setBounds(650, 140, 250, 20);
		label12.setBounds(650, 160, 250, 20);
		label13.setBounds(650, 180, 250, 20);
		label14.setBounds(650, 200, 250, 20);
		label15.setBounds(650, 240, 250, 20);
		label16.setBounds(650, 260, 250, 20);
		label17.setBounds(650, 60, 300, 220);
		label17.setOpaque(true);
		label17.setBackground(Color.white);
		textfield1.setBounds(50, 80, 200, 20);
		textfield2.setBounds(50, 120, 200, 20);
		textfield3.setBounds(50, 160, 200, 20);
		textfield4.setBounds(50, 200, 200, 20);
		
		Okno.add(textfield1); 
		Okno.add(textfield2);
		Okno.add(textfield3);
		Okno.add(textfield4);
		Okno.add(label1); 
		Okno.add(label2); 
		Okno.add(label3); 
		Okno.add(label4);
		Okno.add(label5); 
		Okno.add(label6); 
		Okno.add(label7); 
		Okno.add(label8); 
		Okno.add(label9); 
		Okno.add(label10); 
		Okno.add(label11); 
		Okno.add(label12); 
		Okno.add(label13); 
		Okno.add(label14); 
		Okno.add(label15); 
		Okno.add(label16); 
		Okno.add(label17); 
		Okno.add(btn);
		Okno.add(btn2);
		Okno.add(checkbox1);
		Okno.add(checkbox2);
		Okno.add(checkbox3);
		Okno.add(radiobtn1);
		Okno.add(radiobtn2);
		Okno.add(radiobtn3);
		Okno.add(combobox1);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{  
				label9.setText(textfield1.getText() + " " + textfield2.getText() + " (" + textfield3.getText() + ") " + textfield4.getText());
				
				if(checkbox1.isSelected() == true) label11.setText("Java: " + "tak");
				else
					label11.setText("Java: " + "nie");
				if(checkbox2.isSelected() == true) label12.setText("Python: " + "tak");
				else
					label12.setText("Python: " + "nie");
				if(checkbox3.isSelected() == true) label13.setText("Inne: " + "tak");
				else
					label13.setText("Inne: " + "nie");
				
				if(radiobtn1.isSelected()){
		            label14.setText("Angielski: "+radiobtn1.getText());
		        }
				else if(radiobtn2.isSelected()){
		            label14.setText("Angielski: "+radiobtn2.getText());
		        }
				else if(radiobtn3.isSelected()){
		            label14.setText("Angielski: "+radiobtn3.getText());
		        }
				
				label16.setText("" + combobox1.getSelectedItem());
			}
		});
		
		btn2.addActionListener(new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent e) 
			{ 
				System.exit(0);
			}
		});
		
		 groupButton(radiobtn1,radiobtn2,radiobtn3);
	}
	public static void groupButton(JRadioButton radiobtn1,JRadioButton radiobtn2,JRadioButton radiobtn3 ) 
	{
		 ButtonGroup bg1 = new ButtonGroup( );
		 bg1.add(radiobtn1);
		 bg1.add(radiobtn2);
		 bg1.add(radiobtn3);
	};

}
