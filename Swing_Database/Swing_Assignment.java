package Swing_Database;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Swing_Assignment implements ActionListener {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JTextField txtId, txtName, txtAdd, txtContact;
	JRadioButton r1, r2;
	JButton btnExit, btnRegister, btnDelete, btnUpdate, btnReset, btnRefresh;
	JButton b1,b2,b3,b4,b5;
	JTable tableData;
	JFrame fr = new JFrame("REGISTRATION FORM");
	//JScrollPane scroll;
	public Swing_Assignment() {

		
		fr.setVisible(true);
		fr.setSize(1024, 700);
		fr.setLayout(null);

		l1 = new JLabel("Registration Form");
		l1.setFont(new Font("Arial", Font.BOLD, 18));
		l1.setBounds(70, 40, 200, 30);
		fr.add(l1);
		
		b1=new JButton("ID");
		b1.setBounds(360, 50, 120, 20);
		fr.add(b1);
		b2=new JButton("Name");
		b2.setBounds(479, 50, 121, 20);
		fr.add(b2);
		b3=new JButton("Gender");
		b3.setBounds(599, 50, 120, 20);
		fr.add(b3);
		b4=new JButton("Address");
		b4.setBounds(719, 50, 120, 20);
		fr.add(b4);
		b5=new JButton("Contact");
		b5.setBounds(839, 50, 120, 20);
		fr.add(b5);
		
		
		
		tableData = new JTable();
		tableData.setBounds(360, 70, 600, 380);
	//	tableData.setTableHeader(null);
		
		//scroll.setViewportView(tableData);
		//tableData.setBorder(null);
		fr.add(tableData);

		btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(500, 460, 300, 20);
		fr.add(btnRefresh);

		l2 = new JLabel("Id");
		l2.setBounds(50, 100, 200, 30);
		fr.add(l2);
		txtId = new JTextField();
		txtId.setBounds(150, 100, 200, 30);
		// txtId.disable();
		fr.add(txtId);

		l3 = new JLabel("Name");
		l3.setBounds(50, 150, 200, 30);
		fr.add(l3);
		txtName = new JTextField();
		txtName.setBounds(150, 150, 200, 30);
		fr.add(txtName);

		l4 = new JLabel("Gender");
		l4.setBounds(50, 200, 200, 30);
		fr.add(l4);
		r1 = new JRadioButton("Male");
		r1.setBounds(150, 200, 100, 30);
		fr.add(r1);
		r2 = new JRadioButton("Female");
		r2.setBounds(250, 200, 100, 30);
		fr.add(r2);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		l5 = new JLabel("Address");
		l5.setBounds(50, 250, 200, 30);
		fr.add(l5);
		txtAdd = new JTextField();
		txtAdd.setBounds(150, 250, 200, 30);
		fr.add(txtAdd);

		l6 = new JLabel("Contact");
		l6.setBounds(50, 300, 200, 30);
		fr.add(l6);
		txtContact = new JTextField();
		txtContact.setBounds(150, 300, 200, 30);
		fr.add(txtContact);

		btnExit = new JButton("Exit");
		btnExit.setBounds(50, 350, 100, 30);
		fr.add(btnExit);

		btnRegister = new JButton("Register");
		btnRegister.setBounds(200, 350, 150, 30);
		fr.add(btnRegister);

		btnDelete = new JButton("Delete");
		btnDelete.setBounds(50, 400, 100, 30);
		fr.add(btnDelete);

		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(200, 400, 150, 30);
		fr.add(btnUpdate);

		btnReset = new JButton("Reset");
		btnReset.setBounds(125, 450, 100, 30);
		fr.add(btnReset);

		btnExit.addActionListener(this);
		btnRegister.addActionListener(this);
		btnDelete.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnReset.addActionListener(this);
		btnRefresh.addActionListener(this);
		
		

	}
	
	public static Connection createConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnExit) {
			System.out.println("Exit Button Clicked");
			System.exit(0);
		} else if (e.getSource() == btnRegister) {
			System.out.println("Register Button Clicked");
			int id = Integer.parseInt(txtId.getText());
			String name = txtName.getText();

			String gender = null;
			if (r1.isSelected()) {
				gender = "Male";
			} else if (r2.isSelected()) {
				gender = "Female";
			}
			String address = txtAdd.getText();
			long contact = Long.parseLong(txtContact.getText());

			try {

				Connection conn = Swing_Assignment.createConnection();
				String sql = "insert into regstudent(id,name, gender, address, contact) values(?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, gender);
				ps.setString(4, address);
				ps.setLong(5, contact);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Data Inserte Successfull..");
				txtId.setText("");
				txtName.setText("");
				// r1.setSelected(false);
				r2.setSelected(false);
				txtAdd.setText("");
				txtContact.setText("");

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		} else if (e.getSource() == btnDelete) {
			System.out.println("Delete Button Clicked");
			int id = Integer.parseInt(txtId.getText());
			String name = txtName.getName();
			try {
				Connection conn = Swing_Assignment.createConnection();
				String sql = "delete from regstudent where id=? OR name=?";
				PreparedStatement st = conn.prepareStatement(sql);
				st.setInt(1, id);
				st.setString(2, name);

				st.executeUpdate();

				JOptionPane.showMessageDialog(null, "Data Deleted Successfull..");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (e.getSource() == btnUpdate) {
			System.out.println("Upadte Button Clicked");

			int id = Integer.parseInt(txtId.getText());
			
			String name = txtName.getText();
			String gender = null;
			if (r1.isSelected()) {
				gender = "Male";
			} else if (r2.isSelected()) {
				gender = "Female";
			}
			String address = txtAdd.getText();
			long contact = Long.parseLong(txtContact.getText());

			try {

				Connection conn = Swing_Assignment.createConnection();
				String sql = "update regstudent set name=?, gender=?, address=?, contact=? where id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
			//	ps.setInt(1, id);
				ps.setString(1, name);
				ps.setString(2, gender);
				ps.setString(3, address);
				ps.setLong(4, contact);
				ps.setInt(5, id);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Data Update Successfull..");
				txtId.setText("");
				txtName.setText("");
				// r1.setSelected(false);
				r2.setSelected(false);
				txtAdd.setText("");
				txtContact.setText("");

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		} else if (e.getSource() == btnDelete) {
			System.out.println("Delete Button Clicked");
			int id = Integer.parseInt(txtId.getText());
			String name = txtName.getName();
			try {
				Connection conn = Swing_Assignment.createConnection();
				String sql = "delete from regstudent where id=? OR name=?";
				PreparedStatement st = conn.prepareStatement(sql);
				st.setInt(1, id);
				st.setString(2, name);

				st.executeUpdate();

				JOptionPane.showMessageDialog(null, "Data Deleted Successfull..");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (e.getSource() == btnReset) {
			System.out.println("Reset Button Clicked");
			txtId.setText("");
			txtName.setText("");
			txtAdd.setText("");
			txtContact.setText("");


		} else if (e.getSource() == btnRefresh) {
			DefaultTableModel model1 = (DefaultTableModel) tableData.getModel();
			model1.setRowCount(0);
			System.out.println("Refresh Button Clicked");
			try {
				Connection conn = Swing_Assignment.createConnection();
				String sql = "select *from regstudent";
				PreparedStatement st = conn.prepareStatement(sql);

				ResultSet rs = st.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();

				DefaultTableModel model = (DefaultTableModel) tableData.getModel();
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for (int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i + 1); 
					model.setColumnIdentifiers(colName);
				}
				
				
				String id, name, gender, address, contact;
				while (rs.next()) {
					id = rs.getString(1);
					name = rs.getString(2);
					gender = rs.getString(3);
					address = rs.getString(4);
					contact = rs.getString(5);
					String[] row = { id, name, gender, address, contact };
					model.addRow(row);
					tableData.setRowHeight(tableData.getRowHeight() + 3);
					
				}
				System.out.println("Data Show successfull...");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		

	}

	public static void main(String[] args) {

		new Swing_Assignment();
	}

}
