/*
 * Created by JFormDesigner on Tue Apr 26 13:22:54 EDT 2022
 */

package View;

import coursbd.uqtr.ca.connectionBD;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

/**
 * @author unknown
 */
public class Client extends JFrame {
    public Client() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
    }

    private void button3(ActionEvent e) {
        menuPrincipal menuPrincipal  =new menuPrincipal();
        menuPrincipal.show();
        dispose();
    }

    private void button5(ActionEvent e) throws SQLException {

        String query= "SELECT * FROM CLIENT";
        Connection con = connectionBD.getConnection();
        Statement st =con.createStatement();
        ResultSet rs = st.executeQuery(query);
        ResultSetMetaData md= rs.getMetaData();
        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        int cols = md.getColumnCount();
        String[] colName = new String[cols];
         for(int i =0 ; i<cols ;i++){
             colName[i]=md.getColumnName(i+1);
         }
         model.setColumnIdentifiers(colName);

String ID ,NOM, PRENOM , TEL, EMAIL, ADRESSE;

while (rs.next()){
    ID=rs.getString(1);
    NOM=rs.getString(2);
    PRENOM=rs.getString(3);
    TEL=rs.getString(4);
    EMAIL=rs.getString(5);
    ADRESSE=rs.getString(6);
String [] row ={ID,NOM,PRENOM,TEL,EMAIL,ADRESSE};
model.addRow(row);



}
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        separator1 = new JSeparator();
        button3 = new JButton();
        button5 = new JButton();
        buttonBar = new JPanel();

        //======== this ========
        setTitle("CLIENT");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== scrollPane1 ========
                {

                    //---- table1 ----
                    table1.setModel(new DefaultTableModel());
                    scrollPane1.setViewportView(table1);
                }

                //---- button3 ----
                button3.setText("RETOUR AU MENU");
                button3.addActionListener(e -> {
			button3(e);
			button3(e);
		});

                //---- button5 ----
                button5.setText("Afficher les donnees");
                button5.addActionListener(e -> {
                    try {
                        button5(e);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        button5(e);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                });

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(343, 343, 343)
                            .addComponent(button3)
                            .addGap(280, 503, Short.MAX_VALUE))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 653, GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(button5)
                                    .addGap(149, 149, 149))))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button5))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                            .addComponent(button3)
                            .addGap(36, 36, 36))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane1;
    public JTable table1;
    private JSeparator separator1;
    private JButton button3;
    private JButton button5;
    private JPanel buttonBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
