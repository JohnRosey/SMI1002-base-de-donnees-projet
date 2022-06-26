/*
 * Created by JFormDesigner on Thu Apr 21 07:57:55 EDT 2022
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
public class film extends JFrame {
    public film() {
        initComponents();
    }

    private void button3(ActionEvent e) {
        menuPrincipal menuPrincipal  =new menuPrincipal();
        menuPrincipal.show();
        dispose();

    }

    private void ShowData(ActionEvent e) throws SQLException {
        String query= "SELECT * FROM FILM";
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

        String ID ,TITRE, LANGUE , TEMPS, DATE, REALISATEUR,PAYS,TYPE;

        while (rs.next()){
            ID=rs.getString(1);
            TITRE=rs.getString(2);
            LANGUE=rs.getString(3);
            TEMPS=rs.getString(4);
            DATE=rs.getString(5);
            REALISATEUR=rs.getString(6);
            PAYS=rs.getString(7);
            TYPE=rs.getString(8);
            String [] row ={ID ,TITRE, LANGUE , TEMPS, DATE, REALISATEUR,PAYS,TYPE};
            model.addRow(row);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        ShowData = new JButton();
        buttonBar = new JPanel();
        button3 = new JButton();

        //======== this ========
        setTitle("FILM");
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

                //---- ShowData ----
                ShowData.setText("Affcher la liste");
                ShowData.addActionListener(e -> {
                    try {
                        ShowData(e);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                });

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 697, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(ShowData)
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(223, 223, 223)
                            .addComponent(ShowData, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(260, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- button3 ----
                button3.setText("RETOUR AU MENU");
                button3.addActionListener(e -> button3(e));
                buttonBar.add(button3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
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
    private JTable table1;
    private JButton ShowData;
    private JPanel buttonBar;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
