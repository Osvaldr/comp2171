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
import javax.swing.JScrollBar;

public class Form2 extends JFrame {

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
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form2 frame = new Form2();
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
	public Form2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 1454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MINISTRY OF HEALTH");
		lblNewLabel.setBounds(31, 35, 829, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblApplicationForPreregistration = new JLabel("APPLICATION FORM FOR A SENIOR HOUSE OFFICER POSITION (SHO)");
		lblApplicationForPreregistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationForPreregistration.setBounds(74, 98, 843, 33);
		contentPane.add(lblApplicationForPreregistration);
		
		JLabel lblNewLabel_1 = new JLabel("A. Personal Data");
		lblNewLabel_1.setBounds(31, 159, 196, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setBounds(31, 207, 79, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nationality:");
		lblNewLabel_3.setBounds(31, 252, 135, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setBounds(31, 308, 104, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email Address:");
		lblNewLabel_5.setBounds(31, 369, 176, 33);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(275, 204, 236, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 252, 236, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(275, 305, 777, 39);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(275, 366, 777, 39);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Age:");
		lblNewLabel_6.setBounds(534, 207, 55, 33);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sex:");
		lblNewLabel_7.setBounds(537, 255, 52, 33);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(611, 252, 99, 41);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(728, 251, 129, 41);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(615, 204, 95, 39);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Phone No.:(H)");
		lblNewLabel_8.setBounds(25, 436, 171, 33);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Next of Kin:");
		lblNewLabel_9.setBounds(25, 481, 141, 33);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Address of Next Kin:");
		lblNewLabel_10.setBounds(25, 542, 243, 33);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Year of Graduation:");
		lblNewLabel_11.setBounds(26, 606, 355, 33);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Training Institution:");
		lblNewLabel_12.setBounds(25, 666, 236, 33);
		contentPane.add(lblNewLabel_12);
		
		textField_5 = new JTextField();
		textField_5.setBounds(275, 433, 236, 39);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(275, 481, 236, 39);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(275, 539, 777, 39);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(275, 603, 236, 39);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(275, 663, 777, 39);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Cell:");
		lblNewLabel_13.setBounds(537, 433, 52, 33);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Marital Status:");
		lblNewLabel_14.setBounds(751, 436, 172, 33);
		contentPane.add(lblNewLabel_14);
		
		textField_10 = new JTextField();
		textField_10.setBounds(611, 433, 132, 39);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(925, 433, 127, 39);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Relationship:");
		lblNewLabel_15.setBounds(534, 484, 154, 33);
		contentPane.add(lblNewLabel_15);
		
		textField_12 = new JTextField();
		textField_12.setBounds(611, 481, 441, 39);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Nationality:");
		lblNewLabel_16.setBounds(728, 207, 103, 33);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Degree:");
		lblNewLabel_17.setBounds(534, 606, 115, 33);
		contentPane.add(lblNewLabel_17);
		
		textField_13 = new JTextField();
		textField_13.setBounds(612, 603, 440, 39);
		textField_13.setText("");
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(840, 204, 212, 39);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("B. The SHO programme is for 12 months with a mandatory 6 months in Primary Care.");
		lblNewLabel_18.setBounds(31, 823, 1606, 33);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel(" See Listing attached for assignment preferences.");
		lblNewLabel_19.setBounds(64, 884, 585, 33);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("(i) 1st Rotation");
		lblNewLabel_20.setBounds(31, 945, 354, 33);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblForTwo = new JLabel("Primary Care Institution:");
		lblForTwo.setBounds(74, 1006, 455, 33);
		contentPane.add(lblForTwo);
		
		JLabel lblNewLabel_21 = new JLabel("1st Choice Institution:");
		lblNewLabel_21.setBounds(74, 1067, 431, 33);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("(ii) 2nd Rotation");
		lblNewLabel_22.setBounds(31, 1128, 300, 33);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Primary Care Institution:");
		lblNewLabel_23.setBounds(74, 1189, 361, 33);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("2nd Choice Institution:");
		lblNewLabel_24.setBounds(74, 1250, 384, 33);
		contentPane.add(lblNewLabel_24);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(881, 1311, 171, 41);
		contentPane.add(btnNewButton);
		
		textField_15 = new JTextField();
		textField_15.setBounds(634, 1003, 418, 39);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(634, 1064, 418, 39);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Period of Internship in Jamaica:");
		lblNewLabel_31.setBounds(26, 727, 377, 33);
		contentPane.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Date of Full registration with the MCJ");
		lblNewLabel_32.setBounds(25, 778, 439, 33);
		contentPane.add(lblNewLabel_32);
		
		textField_17 = new JTextField();
		textField_17.setBounds(275, 724, 777, 39);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(275, 775, 777, 39);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(634, 1186, 418, 39);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(634, 1247, 418, 39);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1062, 0, 18, 1366);
		contentPane.add(scrollBar);
	}
}
