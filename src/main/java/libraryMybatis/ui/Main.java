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
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

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
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("굴림", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(132, 118, 66, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("관리자");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(202, 118, 73, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("DGIT Library");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 40, 181, 46);
		contentPane.add(lblNewLabel);
		
		JTextFieldBlockComponent panel = new JTextFieldBlockComponent(" 아이디");
		panel.setBounds(125, 162, 169, 42);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(125, 214, 169, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel(" 비밀번호");
		panel_1.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo uinfo=new UserInfo();
				uinfo.setVisible(true);
			}
		});
		btnNewButton.setBounds(113, 266, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(210, 266, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원가입");
		btnNewButton_2.setBounds(156, 299, 97, 23);
		contentPane.add(btnNewButton_2);
	}
}
