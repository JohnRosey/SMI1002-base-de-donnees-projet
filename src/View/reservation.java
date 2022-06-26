/*
 * Created by JFormDesigner on Wed Apr 27 20:57:01 EDT 2022
 */

package View;

import coursbd.uqtr.ca.connectionBD;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author unknown
 */
public class reservation extends JFrame {
    public reservation() {
        initComponents();
        CaissierIDCombox();
    }
    public void    CaissierIDCombox() {
        String query="select * from CAISSIER";
        try {
            Connection con = connectionBD.getConnection();
            PreparedStatement pst= con.prepareStatement(query);
            ResultSet rs = pst.executeQuery(query);

            while (rs.next()){
                comboBox1.addItem(rs.getString("CAISSIER_ID"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    private void button2(ActionEvent e) {
        menuPrincipal menu = new menuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }

    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        comboBox1 = new JComboBox();
        textField3 = new JTextField();
        comboBox2 = new JComboBox();
        comboBox3 = new JComboBox();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        label5 = new JLabel();
        label6 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("ClientID");

        //---- label2 ----
        label2.setText("Type de paiement");

        //---- label3 ----
        label3.setText("Film");

        //---- label4 ----
        label4.setText("Prix");

        //======== panel1 ========
        {


            panel1.setBorder(new BevelBorder(BevelBorder.RAISED));

            //---- button1 ----
            button1.setText("Valider");

            //---- button2 ----
            button2.setText("Annuler");
            button2.addActionListener(this::button2);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button1, GroupLayout.Alignment.TRAILING)
                            .addComponent(button2, GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addContainerGap())
            );
        }

        //---- label5 ----
        label5.setText("CaissierID");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(35, 35, 35))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(92, 92, 92)))
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBox3, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(comboBox2, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(35, 35, 35)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3)
                                .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(label4)))
                    .addGap(41, 41, 41)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(label6))
                    .addGap(15, 15, 15))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JComboBox comboBox1;
    private JTextField textField3;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JLabel label5;
    public static JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
