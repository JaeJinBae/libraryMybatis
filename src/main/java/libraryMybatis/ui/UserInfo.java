package libraryMybatis.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import common.JTextfieldInlineComponent;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;

public class UserInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTable table_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_10;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfo frame = new UserInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public UserInfo() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1013, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 994, 532);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("대여/반납", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(207, 10, 767, 54);
		panel.add(panel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"도서코드", "도서명", "저 자", "출판사", "가 격"}));
		comboBox.setBounds(33, 10, 93, 25);
		panel_2.add(comboBox);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(158, 10, 421, 25);
		panel_2.add(textField);
		
		JButton button = new JButton("search");
		button.setBounds(627, 11, 93, 23);
		panel_2.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(207, 85, 784, 418);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"도서코드", "도서명", "저 자", "출판사", "가 격", "총 대여 횟수", "대여 가능 여부"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 10, 195, 54);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label = new JLabel("xxx회원님의 대여 현황");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("대여: 5권");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("미반납: 1권");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 85, 195, 363);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_3 = new JLabel(" 도서코드");
		panel_4.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_4.add(textField_1);
		
		JLabel label_4 = new JLabel(" 도서명");
		panel_4.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_4.add(textField_2);
		
		JLabel label_5 = new JLabel(" 저 자");
		panel_4.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_4.add(textField_3);
		
		JLabel label_6 = new JLabel(" 출판사");
		panel_4.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_4.add(textField_4);
		
		JLabel label_7 = new JLabel(" 가격");
		panel_4.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_4.add(textField_5);
		
		JLabel label_8 = new JLabel(" 총대여횟수");
		panel_4.add(label_8);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_4.add(textField_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 458, 171, 31);
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button_1 = new JButton("확인");
		panel_5.add(button_1);
		
		JButton button_2 = new JButton("취소");
		panel_5.add(button_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("회원정보", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(117, 10, 594, 195);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(36, 32, 228, 31);
		panel_6.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(24, 8, 47, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.setBounds(86, 5, 116, 21);
		panel_8.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(36, 73, 228, 31);
		panel_6.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel label_9 = new JLabel("이 름");
		label_9.setBounds(27, 8, 40, 15);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(84, 5, 116, 21);
		textField_8.setColumns(10);
		panel_9.add(textField_8);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(36, 114, 228, 31);
		panel_6.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel label_10 = new JLabel("전화번호");
		label_10.setBounds(12, 8, 65, 15);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(label_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(82, 5, 116, 21);
		textField_9.setColumns(10);
		panel_10.add(textField_9);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(36, 155, 548, 31);
		panel_6.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("주 소");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 57, 15);
		panel_11.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"강원도", "경기도", "경상남도", "경상북도", "광주광역시", "대구광역시", "대전광역시", "부산광역시", "서울특별시", "세종특별자치시", "울산광역시", "인턴광역시", "전라남도", "전라북도", "제주특별자치도", "충청남도", "충정북도"}));
		comboBox_1.setBounds(81, 7, 87, 21);
		panel_11.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"남구", "동구", "북구", "달서구", "중구", "서구"}));
		comboBox_2.setBounds(180, 7, 62, 21);
		panel_11.add(comboBox_2);
		
		textField_10 = new JTextField();
		textField_10.setBounds(248, 7, 288, 21);
		panel_11.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(276, 32, 308, 31);
		panel_6.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel label_12 = new JLabel("이메일");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(12, 8, 57, 15);
		panel_12.add(label_12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(81, 5, 215, 21);
		textField_11.setColumns(10);
		panel_12.add(textField_11);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(276, 73, 308, 31);
		panel_6.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel label_13 = new JLabel("비밀번호");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(12, 8, 57, 15);
		panel_13.add(label_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(81, 5, 215, 21);
		textField_12.setColumns(10);
		panel_13.add(textField_12);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(276, 114, 308, 31);
		panel_6.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel label_14 = new JLabel("비밀번호 확인");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(0, 8, 78, 15);
		panel_14.add(label_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(81, 5, 215, 21);
		textField_13.setColumns(10);
		panel_14.add(textField_13);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_7.getLayout();
		flowLayout.setVgap(15);
		panel_7.setBounds(746, 34, 148, 125);
		panel_1.add(panel_7);
		
		JButton btnNewButton = new JButton("수 정");
		panel_7.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원탈퇴");
		panel_7.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("대여/반납 내역");
		panel_7.add(btnNewButton_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(79, 250, 861, 243);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(table_1);
	}
}
