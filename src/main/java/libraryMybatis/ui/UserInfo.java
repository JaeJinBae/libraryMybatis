package libraryMybatis.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.ImageIcon;

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
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTable table_2;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;

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
		setBounds(100, 100, 1008, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 980, 532);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("대 여", null, panel, null);
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
		scrollPane.setBounds(207, 85, 770, 418);
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
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBounds(0, 0, 975, 503);
		panel.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBounds(207, 10, 767, 54);
		panel_19.add(panel_20);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(33, 10, 93, 25);
		panel_20.add(comboBox_3);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBounds(158, 10, 421, 25);
		panel_20.add(textField_20);
		
		JButton button_5 = new JButton("search");
		button_5.setBounds(627, 11, 93, 23);
		panel_20.add(button_5);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(207, 85, 770, 418);
		panel_19.add(scrollPane_3);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_21.setBounds(0, 10, 195, 54);
		panel_19.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_21 = new JLabel("xxx회원님의 대여 현황");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(label_21);
		
		JLabel label_22 = new JLabel("대여: 5권");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(label_22);
		
		JLabel label_23 = new JLabel("미반납: 1권");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(label_23);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBounds(0, 85, 195, 363);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_24 = new JLabel(" 도서코드");
		panel_22.add(label_24);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		panel_22.add(textField_21);
		
		JLabel label_25 = new JLabel(" 도서명");
		panel_22.add(label_25);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		panel_22.add(textField_22);
		
		JLabel label_26 = new JLabel(" 저 자");
		panel_22.add(label_26);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		panel_22.add(textField_23);
		
		JLabel label_27 = new JLabel(" 출판사");
		panel_22.add(label_27);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		panel_22.add(textField_24);
		
		JLabel label_28 = new JLabel(" 가격");
		panel_22.add(label_28);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		panel_22.add(textField_25);
		
		JLabel label_29 = new JLabel(" 총대여횟수");
		panel_22.add(label_29);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		panel_22.add(textField_26);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBounds(10, 458, 171, 31);
		panel_19.add(panel_23);
		panel_23.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button_6 = new JButton("확인");
		panel_23.add(button_6);
		
		JButton button_7 = new JButton("취소");
		panel_23.add(button_7);
		
		JPanel panel_15 = new JPanel();
		tabbedPane.addTab("반 납", null, panel_15, null);
		panel_15.setLayout(null);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(218, 0, 455, 257);
		panel_16.setLayout(null);
		panel_15.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_17.setBounds(12, 39, 424, 167);
		panel_16.add(panel_17);
		
		JLabel label_11 = new JLabel("도서코드");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(0, 2, 128, 27);
		panel_17.add(label_11);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(131, 2, 290, 27);
		panel_17.add(textField_14);
		
		JLabel label_15 = new JLabel("도서명");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(0, 29, 128, 27);
		panel_17.add(label_15);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(131, 29, 290, 27);
		panel_17.add(textField_15);
		
		JLabel label_16 = new JLabel("저 자");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(0, 56, 128, 27);
		panel_17.add(label_16);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(131, 56, 290, 27);
		panel_17.add(textField_16);
		
		JLabel label_17 = new JLabel("출판사");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(0, 83, 128, 27);
		panel_17.add(label_17);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(131, 83, 290, 27);
		panel_17.add(textField_17);
		
		JLabel label_18 = new JLabel("가격");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBounds(0, 110, 128, 27);
		panel_17.add(label_18);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(131, 110, 290, 27);
		panel_17.add(textField_18);
		
		JLabel label_19 = new JLabel("연체 일수");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBounds(0, 137, 128, 27);
		panel_17.add(label_19);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(131, 137, 290, 27);
		panel_17.add(textField_19);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBounds(12, 206, 424, 41);
		panel_16.add(panel_18);
		
		JButton button_3 = new JButton("반 납");
		button_3.setFont(new Font("굴림", Font.BOLD, 13));
		button_3.setBounds(127, 5, 82, 36);
		panel_18.add(button_3);
		
		JButton button_4 = new JButton("취 소");
		button_4.setFont(new Font("굴림", Font.BOLD, 13));
		button_4.setBounds(214, 5, 82, 36);
		panel_18.add(button_4);
		
		JLabel label_20 = new JLabel("도서 정보");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("굴림", Font.BOLD, 15));
		label_20.setBounds(22, 5, 105, 28);
		panel_16.add(label_20);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 261, 975, 232);
		panel_15.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"도서코드", "도서명", "저 자", "출판사", "가 격", "연체 일수"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("회원정보", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_6.setBounds(302, 10, 594, 202);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(36, 10, 228, 31);
		panel_6.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(12, 8, 47, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.setBounds(86, 5, 116, 21);
		panel_8.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(36, 51, 228, 31);
		panel_6.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel label_9 = new JLabel("이 름");
		label_9.setBounds(12, 8, 40, 15);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(84, 5, 116, 21);
		textField_8.setColumns(10);
		panel_9.add(textField_8);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(36, 92, 228, 31);
		panel_6.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel label_10 = new JLabel("전화번호");
		label_10.setBounds(5, 8, 65, 15);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(label_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(82, 5, 116, 21);
		textField_9.setColumns(10);
		panel_10.add(textField_9);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(36, 133, 548, 31);
		panel_6.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("주 소");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 44, 15);
		panel_11.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"강원도", "경기도", "경상남도", "경상북도", "광주광역시", "대구광역시", "대전광역시", "부산광역시", "서울특별시", "세종특별자치시", "울산광역시", "인턴광역시", "전라남도", "전라북도", "제주특별자치도", "충청남도", "충정북도"}));
		comboBox_1.setBounds(68, 7, 87, 21);
		panel_11.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"남구", "동구", "북구", "달서구", "중구", "서구"}));
		comboBox_2.setBounds(158, 7, 78, 21);
		panel_11.add(comboBox_2);
		
		textField_10 = new JTextField();
		textField_10.setBounds(241, 7, 295, 21);
		panel_11.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(276, 10, 308, 31);
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
		panel_13.setBounds(276, 51, 308, 31);
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
		panel_14.setBounds(269, 92, 315, 31);
		panel_6.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel label_14 = new JLabel("비밀번호 확인");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(0, 8, 84, 15);
		panel_14.add(label_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(88, 5, 215, 21);
		textField_13.setColumns(10);
		panel_14.add(textField_13);
		
		JButton btnNewButton_3 = new JButton("확 인");
		btnNewButton_3.setBounds(190, 174, 97, 23);
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("취 소");
		btnNewButton_4.setBounds(293, 174, 97, 23);
		panel_6.add(btnNewButton_4);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_7.getLayout();
		flowLayout.setVgap(15);
		panel_7.setBounds(96, 46, 148, 137);
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
				"도서코드", "도서명", "저 자", "가 격", "대여일", "반납일", "연체여부", "필요한거"
			}
		));
		scrollPane_1.setViewportView(table_1);
	}
}
