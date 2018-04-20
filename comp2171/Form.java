package comp2171;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 1953);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MINISTRY OF HEALTH/UNIVERSITY HOSPITAL OF THE WEST INDIES");
		lblNewLabel.setBounds(31, 35, 829, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblApplicationForPreregistration = new JLabel("APPLICATION FOR PRE-REGISTRATION (INTERN) POSITION");
		lblApplicationForPreregistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationForPreregistration.setBounds(74, 98, 726, 33);
		contentPane.add(lblApplicationForPreregistration);
		
		JLabel lblNewLabel_1 = new JLabel("A. Personal Data");
		lblNewLabel_1.setBounds(31, 169, 196, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setBounds(31, 235, 79, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nationality:");
		lblNewLabel_3.setBounds(31, 307, 135, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setBounds(31, 382, 104, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email Address:");
		lblNewLabel_5.setBounds(31, 443, 176, 33);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(275, 232, 236, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 304, 236, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(275, 371, 777, 39);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(275, 440, 236, 39);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Age:");
		lblNewLabel_6.setBounds(537, 235, 55, 33);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sex:");
		lblNewLabel_7.setBounds(537, 314, 52, 33);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(628, 306, 99, 41);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(756, 306, 129, 41);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(628, 232, 236, 39);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Phone No.:(H)");
		lblNewLabel_8.setBounds(31, 520, 171, 33);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Next of Kin:");
		lblNewLabel_9.setBounds(31, 573, 141, 33);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Address of Next Kin:");
		lblNewLabel_10.setBounds(31, 626, 243, 33);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Medical School of Graduation:");
		lblNewLabel_11.setBounds(31, 679, 355, 33);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Year of Graduation:");
		lblNewLabel_12.setBounds(31, 732, 235, 33);
		contentPane.add(lblNewLabel_12);
		
		textField_5 = new JTextField();
		textField_5.setBounds(275, 517, 236, 39);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(275, 570, 236, 39);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(275, 623, 777, 39);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(275, 676, 236, 39);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(275, 729, 236, 39);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Cell:");
		lblNewLabel_13.setBounds(537, 520, 52, 33);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Marital Status:");
		lblNewLabel_14.setBounds(741, 520, 172, 33);
		contentPane.add(lblNewLabel_14);
		
		textField_10 = new JTextField();
		textField_10.setBounds(606, 517, 132, 39);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(923, 517, 129, 39);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Relationship:");
		lblNewLabel_15.setBounds(537, 573, 154, 33);
		contentPane.add(lblNewLabel_15);
		
		textField_12 = new JTextField();
		textField_12.setBounds(606, 570, 446, 39);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Country:");
		lblNewLabel_16.setBounds(537, 679, 103, 33);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Degree:");
		lblNewLabel_17.setBounds(537, 732, 115, 33);
		contentPane.add(lblNewLabel_17);
		
		textField_13 = new JTextField();
		textField_13.setBounds(606, 729, 374, 39);
		textField_13.setText("");
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(606, 676, 446, 39);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("B. Approved health facilities for assignment");
		lblNewLabel_18.setBounds(31, 823, 513, 33);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("1. University Hospital of the West Indies");
		lblNewLabel_19.setBounds(112, 884, 475, 33);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("2. Ministry of Health Hospitals");
		lblNewLabel_20.setBounds(112, 945, 354, 33);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblForTwo = new JLabel("For two (2) the choices are as follows:");
		lblForTwo.setBounds(31, 1006, 455, 33);
		contentPane.add(lblForTwo);
		
		JLabel lblNewLabel_21 = new JLabel("(i) Kingston Region (KPH, VJH, BHC)");
		lblNewLabel_21.setBounds(112, 1067, 431, 33);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("(ii) St. Anns Bay Hospital ");
		lblNewLabel_22.setBounds(112, 1128, 300, 33);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("(iii) Cornwall Regional Hospital");
		lblNewLabel_23.setBounds(112, 1189, 361, 33);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("(iv) Mandeville Regional Hospital");
		lblNewLabel_24.setBounds(112, 1250, 384, 33);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("(v) Spanish Town Hospital");
		lblNewLabel_25.setBounds(112, 1311, 310, 33);
		contentPane.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("(vi) May Pen Hospital");
		lblNewLabel_26.setBounds(112, 1372, 250, 33);
		contentPane.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("(vii) Savanna-la-mar Hospital");
		lblNewLabel_27.setBounds(112, 1433, 343, 33);
		contentPane.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("(viii) Annotto Bay Hospital");
		lblNewLabel_28.setBounds(112, 1494, 307, 33);
		contentPane.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("PLease indicate your primary choice:");
		lblNewLabel_29.setBounds(112, 1555, 433, 33);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Please indicate your secondary choice:");
		lblNewLabel_30.setBounds(112, 1616, 455, 33);
		contentPane.add(lblNewLabel_30);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(871, 1689, 171, 41);
		contentPane.add(btnNewButton);
		
		textField_15 = new JTextField();
		textField_15.setBounds(624, 1552, 418, 39);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(624, 1613, 418, 39);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
	}
}
