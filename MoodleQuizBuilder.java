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


public class MoodleQuizBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setBounds(100, 100, 665, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel1 = new JPanel();
		

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("True or False", panel1);
		panel1.setLayout(new MigLayout("", "[grow 20][grow][grow 20]", "[][grow][][][][][]"));
		
		JLabel lblTitleoptional = new JLabel("Title (Optional)");
		panel1.add(lblTitleoptional, "flowx,cell 1 0");
		
		textField = new JTextField();
		panel1.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblQuestion = new JLabel("Question");
		panel1.add(lblQuestion, "cell 0 1,alignx center");
		
		JTextArea textArea = new JTextArea();
		panel1.add(textArea, "cell 1 1,grow");
		
		JButton btnClearText = new JButton("Clear Text");
		panel1.add(btnClearText, "cell 1 2,alignx right");
		
		JLabel lblCorrect = new JLabel("Correct Answer");
		panel1.add(lblCorrect, "flowx,cell 1 3");

		ButtonGroup bgroup = new ButtonGroup();
		
		JRadioButton rdbtnTrue = new JRadioButton("False");
		panel1.add(rdbtnTrue, "cell 1 3");
		
		JRadioButton rdbtnFalse = new JRadioButton("False");
		panel1.add(rdbtnFalse, "cell 1 3");
		
		bgroup.add(rdbtnFalse);
		bgroup.add(rdbtnTrue);
		
	
		JButton btnSave = new JButton("Save");
		panel1.add(btnSave, "cell 1 5");
		
		JButton btnNewButton = new JButton("Add another True/False");
		panel1.add(btnNewButton, "cell 1 6,alignx left");
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Multiple Choice", null, panel, null);
		panel.setLayout(new MigLayout("", "[grow 20][grow][grow 20]", "[][grow][][][][][]"));
		
		JLabel lblTitleoptional_1 = new JLabel("Title (Optional)");
		panel.add(lblTitleoptional_1, "flowx,cell 1 0");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblQuestion_1 = new JLabel("Question");
		panel.add(lblQuestion_1, "cell 0 1,alignx center");
		
		JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1, "cell 1 1,grow");
		
		JButton btnAddAnswer = new JButton("Add Answer");
		panel.add(btnAddAnswer, "flowx,cell 1 2,alignx right");
		
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
		
		JButton btnSave_1 = new JButton("Save");
		panel.add(btnSave_1, "cell 1 5");
		
		JButton btnNewButton_1 = new JButton("Add another Multiple Choice");
		panel.add(btnNewButton_1, "cell 1 6");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Matching", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}

}
