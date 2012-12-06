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
		ButtonGroup bgroup2 = new ButtonGroup();
		
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
		
		final JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1, "cell 1 1,grow");
		
		JButton btnClearText_1 = new JButton("Clear Text");
		btnClearText_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("");
			}
		});
		panel.add(btnClearText_1, "cell 1 2,alignx right");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 3,growx");
		textField_2.setColumns(10);
		
		final JRadioButton radioButton_0 = new JRadioButton("");
		panel.add(radioButton_0, "cell 2 3,alignx center");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "cell 1 4,growx");
		textField_3.setColumns(10);
		
		final JRadioButton radioButton_1 = new JRadioButton("");
		panel.add(radioButton_1, "cell 2 4,alignx center");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "cell 1 5,growx");
		textField_4.setColumns(10);
		
		final JRadioButton radioButton_2 = new JRadioButton("");
		panel.add(radioButton_2, "cell 2 5,alignx center");
		
		textField_5 = new JTextField();
		panel.add(textField_5, "cell 1 6,growx");
		textField_5.setColumns(10);
		
		final JRadioButton radioButton_3 = new JRadioButton("");
		
		bgroup2.add(radioButton_0);
		bgroup2.add(radioButton_1);
		bgroup2.add(radioButton_2);
		bgroup2.add(radioButton_3);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText() != ""){
					builder.append("::"+textField_1.getText()+":: ");
				}
				if(textArea_1.getText() != ""){
					builder.append(textArea_1.getText()+"\n");
				}
				if(textField_2.getText() != "" && textField_3.getText() != "" && textField_4.getText() != "" && textField_5.getText() != ""){
					if(radioButton_0.isSelected()){
						builder.append("{ ="+textField_2.getText()+" # right; good! ~"+textField_3.getText()
								+" # wrong, its "+textField_2.getText()+" ~"+textField_4.getText()
								+" # wrong, its "+textField_2.getText()+" ~"+textField_5.getText()
								+" # wrong, its "+textField_2.getText()+" }");
					}
					else if(radioButton_1.isSelected()){
						builder.append("{ ="+textField_3.getText()+" # right; good! ~"+textField_4.getText()
								+" # wrong, its "+textField_3.getText()+" ~"+textField_5.getText()
								+" # wrong, its "+textField_3.getText()+" ~"+textField_2.getText()
								+" # wrong, its "+textField_3.getText()+" }");
					}
					else if(radioButton_2.isSelected()){
						builder.append("{ ="+textField_4.getText()+" # right; good! ~"+textField_3.getText()
								+" # wrong, its "+textField_4.getText()+" ~"+textField_2.getText()
								+" # wrong, its "+textField_4.getText()+" ~"+textField_5.getText()
								+" # wrong, its "+textField_4.getText()+" }");
					}
					else if(radioButton_3.isSelected()){
						builder.append("{ ="+textField_5.getText()+" # right; good! ~"+textField_3.getText()
								+" # wrong, its "+textField_5.getText()+" ~"+textField_4.getText()
								+" # wrong, its "+textField_5.getText()+" ~"+textField_2.getText()
								+" # wrong, its "+textField_5.getText()+" }");
					}
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textArea_1.setText("");
					System.out.println(builder.toString());
					builder.setLength(0);
					
				}
			}
		});
		
		
		panel.add(radioButton_3, "cell 2 6,alignx center");
		panel.add(btnSave_1, "cell 1 7");
		
		JButton btnNewButton_1 = new JButton("Add another Multiple Choice");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText() != ""){
					builder.append("::"+textField_1.getText()+":: ");
				}
				if(textArea_1.getText() != ""){
					builder.append(textArea_1.getText()+"\n");
				}
				if(textField_2.getText() != "" && textField_3.getText() != "" && textField_4.getText() != "" && textField_5.getText() != ""){
					if(radioButton_0.isSelected()){
						builder.append("{ ="+textField_2.getText()+" # right; good! ~"+textField_3.getText()
								+" # wrong, its "+textField_2.getText()+" ~"+textField_4.getText()
								+" # wrong, its "+textField_2.getText()+" ~"+textField_5.getText()
								+" # wrong, its "+textField_2.getText()+" }");
					}
					else if(radioButton_1.isSelected()){
						builder.append("{ ="+textField_3.getText()+" # right; good! ~"+textField_4.getText()
								+" # wrong, its "+textField_3.getText()+" ~"+textField_5.getText()
								+" # wrong, its "+textField_3.getText()+" ~"+textField_2.getText()
								+" # wrong, its "+textField_3.getText()+" }");
					}
					else if(radioButton_2.isSelected()){
						builder.append("{ ="+textField_4.getText()+" # right; good! ~"+textField_3.getText()
								+" # wrong, its "+textField_4.getText()+" ~"+textField_2.getText()
								+" # wrong, its "+textField_4.getText()+" ~"+textField_5.getText()
								+" # wrong, its "+textField_4.getText()+" }");
					}
					else if(radioButton_3.isSelected()){
						builder.append("{ ="+textField_5.getText()+" # right; good! ~"+textField_3.getText()
								+" # wrong, its "+textField_5.getText()+" ~"+textField_4.getText()
								+" # wrong, its "+textField_5.getText()+" ~"+textField_2.getText()
								+" # wrong, its "+textField_5.getText()+" }");
					}
					
					builder.append("\n");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textArea_1.setText("");
				}
			}
		});
		panel.add(btnNewButton_1, "cell 1 8");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Matching", null, panel_1, null);
		panel_1.setLayout(new MigLayout("", "[grow 10][grow 40][grow 50][grow 20]", "[fill][grow][][][][][][][][][][]"));
		
		JLabel lblTitleoptional_2 = new JLabel("Title (optional)");
		panel_1.add(lblTitleoptional_2, "cell 0 0,alignx center");
		
		textField_6 = new JTextField();
		panel_1.add(textField_6, "cell 1 0 2 1,growx");
		textField_6.setColumns(10);
		
		final JTextArea textArea_2 = new JTextArea();
		panel_1.add(textArea_2, "cell 1 1 2 4,grow");
		
		JButton btnSave_2 = new JButton("Save");
		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_6.getText() != ""){
					builder.append("::"+textField_6.getText()+":: ");
				}
				if(textArea_2.getText() != ""){
					builder.append(textArea_2.getText()+" ");
				}
				if(textField_7.getText() != "" && textField_8.getText() != "" && textField_9.getText() != "" 
						&& textField_10.getText() != "" && textField_11.getText() != "" && textField_12.getText() != ""){
					builder.append(" { ="+textField_7.getText()+" -> "+textField_8.getText()+" ="+textField_9.getText()+" -> "
							+textField_10.getText()+" ="+textField_11.getText()+" -> "+textField_12.getText()+" }\n");
				}
				
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textArea_2.setText("");
				System.out.println(builder.toString());
				builder.setLength(0);
			}
		});
		
		JButton btnClear = new JButton("Clear Text");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");

			}
		});
		
		
		
		JLabel lblQuestion_2 = new JLabel("Question");
		panel_1.add(lblQuestion_2, "cell 0 2,alignx center");
		
		JLabel lblA = new JLabel("A");
		panel_1.add(lblA, "flowx,cell 1 6,alignx trailing");
		
		textField_7 = new JTextField();
		panel_1.add(textField_7, "cell 1 6,growx");
		textField_7.setColumns(10);
		
		JLabel lblA_1 = new JLabel("A");
		panel_1.add(lblA_1, "flowx,cell 2 6");
		
		textField_8 = new JTextField();
		panel_1.add(textField_8, "cell 2 6,growx");
		textField_8.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		panel_1.add(lblB, "flowx,cell 1 7,alignx trailing");
		
		textField_9 = new JTextField();
		panel_1.add(textField_9, "cell 1 7,growx");
		textField_9.setColumns(10);
		
		JLabel lblB_1 = new JLabel("B");
		panel_1.add(lblB_1, "flowx,cell 2 7");
		
		textField_10 = new JTextField();
		panel_1.add(textField_10, "cell 2 7,growx");
		textField_10.setColumns(10);
		
		JLabel lblC = new JLabel("C");
		panel_1.add(lblC, "flowx,cell 1 8,alignx trailing");
		
		textField_11 = new JTextField();
		panel_1.add(textField_11, "cell 1 8,growx");
		textField_11.setColumns(10);
		
		JLabel lblC_1 = new JLabel("C");
		panel_1.add(lblC_1, "flowx,cell 2 8");
		
		textField_12 = new JTextField();
		panel_1.add(textField_12, "cell 2 8,growx");
		textField_12.setColumns(10);
		panel_1.add(btnClear, "cell 2 9,alignx right");
		panel_1.add(btnSave_2, "cell 1 10");
		
		JButton btnAddAnotherMatching = new JButton("Add another Matching");
		btnAddAnotherMatching.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_6.getText() != ""){
					builder.append("::"+textField_6.getText()+":: ");
				}
				if(textArea_2.getText() != ""){
					builder.append(textArea_2.getText()+" ");
				}
				if(textField_7.getText() != "" && textField_8.getText() != "" && textField_9.getText() != "" 
						&& textField_10.getText() != "" && textField_11.getText() != "" && textField_12.getText() != ""){
					builder.append(" { ="+textField_7.getText()+" -> "+textField_8.getText()+" ="+textField_9.getText()+" -> "
							+textField_10.getText()+" ="+textField_11.getText()+" -> "+textField_12.getText()+" }");
				}
				
				builder.append("\n");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textArea_2.setText("");
			}
		});
		panel_1.add(btnAddAnotherMatching, "cell 1 11");
	}

}
