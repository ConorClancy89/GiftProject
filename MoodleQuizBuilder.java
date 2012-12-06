import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MoodleQuizBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_12;
	public StringBuilder builder = new StringBuilder();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoodleQuizBuilder frame = new MoodleQuizBuilder();
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
	public MoodleQuizBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(220, 220, 220));
		

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("True or False", panel1);
		panel1.setLayout(new MigLayout("", "[grow 20][grow][grow 20]", "[][grow][][][][][]"));
		
		JLabel lblTitleoptional = new JLabel("Title (Optional)");
		panel1.add(lblTitleoptional, "cell 0 0,alignx center");
		
		textField = new JTextField();
		panel1.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblQuestion = new JLabel("Question");
		panel1.add(lblQuestion, "cell 0 1,alignx center");
		
		final JTextArea textArea = new JTextArea();
		panel1.add(textArea, "cell 1 1,grow");
		
		JButton btnClearText = new JButton("Clear Text");
		btnClearText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setText("");
				
			}
		});
		panel1.add(btnClearText, "cell 1 2,alignx right");
		
		JLabel lblCorrect = new JLabel("Correct Answer");
		panel1.add(lblCorrect, "flowx,cell 1 3");

		ButtonGroup bgroup = new ButtonGroup();
		
		final JRadioButton rdbtnTrue = new JRadioButton("True");
		panel1.add(rdbtnTrue, "cell 1 3");
		
		final JRadioButton rdbtnFalse = new JRadioButton("False");
		panel1.add(rdbtnFalse, "cell 1 3");
		
		bgroup.add(rdbtnFalse);
		bgroup.add(rdbtnTrue);
		
	
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() != ""){
					builder.append("::"+textField.getText()+":: ");
				}
				if(textArea.getText() != ""){
					builder.append(textArea.getText()+" ");
				}
				if(rdbtnTrue.isSelected()){
					builder.append("{T}");
				}
				else if(rdbtnFalse.isSelected()){
					builder.append("{F}");
				}
				textField.setText("");
				textArea.setText("");
				System.out.println(builder.toString());
				builder.setLength(0);

			}
		});
		panel1.add(btnSave, "cell 1 5");
		
		JButton btnNewButton = new JButton("Add another True/False");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() != ""){
					builder.append("::"+textField.getText()+":: ");
				}
				if(textArea.getText() != ""){
					builder.append(textArea.getText()+" ");
				}
				if(rdbtnTrue.isSelected()){
					builder.append("{T}");
				}
				else if(rdbtnFalse.isSelected()){
					builder.append("{F}");
				}
				builder.append("\n");
				textField.setText("");
				textArea.setText("");
				
			}
		});
		panel1.add(btnNewButton, "cell 1 6,alignx left");
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Multiple Choice", null, panel, null);
		panel.setLayout(new MigLayout("", "[grow 20][grow][grow 20]", "[][grow][][][][][][][]"));
		
		JLabel lblTitleoptional_1 = new JLabel("Title (Optional)");
		panel.add(lblTitleoptional_1, "cell 0 0,alignx center");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblQuestion_1 = new JLabel("Question");
		panel.add(lblQuestion_1, "cell 0 1,alignx center");
		
		JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1, "cell 1 1,grow");
		
		JButton btnClearText_1 = new JButton("Clear Text");
		panel.add(btnClearText_1, "cell 1 2,alignx right");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 3,growx");
		textField_2.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		panel.add(spinner, "cell 2 3,alignx center");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "cell 1 4,growx");
		textField_3.setColumns(10);
		
		JSpinner spinner_1 = new JSpinner();
		panel.add(spinner_1, "cell 2 4,alignx center");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "cell 1 5,growx");
		textField_4.setColumns(10);
		
		JSpinner spinner_2 = new JSpinner();
		panel.add(spinner_2, "cell 2 5,alignx center");
		
		textField_5 = new JTextField();
		panel.add(textField_5, "cell 1 6,growx");
		textField_5.setColumns(10);
		
		JSpinner spinner_3 = new JSpinner();
		panel.add(spinner_3, "cell 2 6,alignx center");
		
		JButton btnSave_1 = new JButton("Save");
		panel.add(btnSave_1, "cell 1 7");
		
		JButton btnNewButton_1 = new JButton("Add another Multiple Choice");
		panel.add(btnNewButton_1, "cell 1 8");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Matching", null, panel_1, null);
		panel_1.setLayout(new MigLayout("", "[grow 10][grow 30][grow 50][grow 10]", "[fill][][][][][][][][][][][]"));
		
		JLabel lblTitleoptional_2 = new JLabel("Title (optional)");
		panel_1.add(lblTitleoptional_2, "cell 0 0,alignx center");
		
		textField_6 = new JTextField();
		panel_1.add(textField_6, "cell 1 0 2 1,growx");
		textField_6.setColumns(10);
		
		JLabel lblA = new JLabel("A");
		panel_1.add(lblA, "flowx,cell 1 2,alignx trailing");
		
		textField_7 = new JTextField();
		panel_1.add(textField_7, "cell 1 2,growx");
		textField_7.setColumns(10);
		
		JLabel lblA_1 = new JLabel("A");
		panel_1.add(lblA_1, "flowx,cell 2 2");
		
		textField_8 = new JTextField();
		panel_1.add(textField_8, "cell 2 2,growx");
		textField_8.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		panel_1.add(lblB, "flowx,cell 1 4,alignx trailing");
		
		textField_9 = new JTextField();
		panel_1.add(textField_9, "cell 1 4,growx");
		textField_9.setColumns(10);
		
		JLabel lblB_1 = new JLabel("B");
		panel_1.add(lblB_1, "flowx,cell 2 4");
		
		textField_10 = new JTextField();
		panel_1.add(textField_10, "cell 2 4,growx");
		textField_10.setColumns(10);
		
		JLabel lblC = new JLabel("C");
		panel_1.add(lblC, "flowx,cell 1 6,alignx trailing");
		
		textField_11 = new JTextField();
		panel_1.add(textField_11, "cell 1 6,growx");
		textField_11.setColumns(10);
		
		JLabel lblC_1 = new JLabel("C");
		panel_1.add(lblC_1, "flowx,cell 2 6");
		
		textField_12 = new JTextField();
		panel_1.add(textField_12, "cell 2 6,growx");
		textField_12.setColumns(10);
		
		JButton btnClear = new JButton("Clear Text");
		panel_1.add(btnClear, "cell 2 8,alignx right");
		
		JButton btnSave_2 = new JButton("Save");
		panel_1.add(btnSave_2, "cell 1 10");
		
		JButton btnAddAnotherMatching = new JButton("Add another Matching");
		panel_1.add(btnAddAnotherMatching, "cell 1 11");
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}

}
