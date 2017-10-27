package libraryMybatis.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import common.JTextFieldBlockComponent;

public class Main extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setTitle("Library System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("회 원");
		rdbtnNewRadioButton.setFont(new Font("굴림", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(132, 118, 66, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("관리자");
		rdbtnNewRadioButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(221, 118, 73, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("DGIT Library");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 40, 181, 46);
		contentPane.add(lblNewLabel);
		
		JTextFieldBlockComponent panel = new JTextFieldBlockComponent("아이디");
		panel.setBounds(125, 162, 169, 42);
		contentPane.add(panel);
	}
}
