/*
 * Created by JFormDesigner on Mon Apr 25 18:19:26 EDT 2022
 */

package View;

import coursbd.uqtr.ca.connectionBD;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;

/**
 * @author unknown
 */
public class Client extends JFrame {
    public Client() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        try{

            String req = "insert into CLIENT(CLIENT_ID,CLIENT_PRENOM, CLIENT_NOM ,CLIENT_TEL , CLIENT_EMAIL, CLIENT_ADRESSE) values (?,?,?,?,?,?)";
            String id= ID.getText();
            String prenom= Prenom.getText();
            String nom= Nom.getText();
            String tel= Tel.getText();
            String Email= email.getText();
            String adresse= Adresse.getText();
            PreparedStatement pst = connectionBD.getConnection().prepareStatement(req);
            pst.setString(1,id);
            pst.setString(2,prenom);
            pst.setString(3,nom);
            pst.setString(4,tel);
            pst.setString(5,Email);
            pst.setString(6,adresse);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ajout avec succes");




        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void button3(ActionEvent e) {
        // TODO add your code here
    }

    private void button5(ActionEvent e) {
        // TODO add your code here
    }

    private void button2(ActionEvent e) {

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel1 = new JPanel();
        Add = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        panel2 = new JPanel();
        ID = new JTextField();
        email = new JTextField();
        Nom = new JTextField();
        Adresse = new JTextField();
        Tel = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        prenom = new JTextField();
        Prenom = new JLabel();
        separator1 = new JSeparator();
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
                    table1.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                        },
                        new String[] {
                            "BILLET_ID", "NOMBRE_DE_BILLETS_DISPONIBLES", "Date", "HEURE", "NUMERO_DU_BILLET", "NOM_DU_FILM"
                        }
                    ));
                    scrollPane1.setViewportView(table1);
                }

                //======== panel1 ========
                {
                    panel1.setBorder(new BevelBorder(BevelBorder.RAISED));

                    //---- Add ----
                    Add.setText("Ajouter");
                    Add.addActionListener(e -> {
			button1(e);
			button1(e);
			button1(e);
		});

                    //---- button2 ----
                    button2.setText("Supprimer");
                    button2.addActionListener(e -> button2(e));

                    //---- button3 ----
                    button3.setText("RETOUR AU MENU");
                    button3.addActionListener(e -> button3(e));

                    //---- button4 ----
                    button4.setText("Mise a jour");

                    //---- button5 ----
                    button5.setText("Afficher les donnees");
                    button5.addActionListener(e -> button5(e));

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(Add, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(99, 99, 99)
                                            .addComponent(button3))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(113, 113, 113)
                                            .addComponent(button5))))
                                .addContainerGap(120, Short.MAX_VALUE))
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(Add)
                                .addGap(39, 39, 39)
                                .addComponent(button4)
                                .addGap(55, 55, 55)
                                .addComponent(button2)
                                .addGap(53, 53, 53)
                                .addComponent(button5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                .addComponent(button3)
                                .addContainerGap())
                    );
                }

                //======== panel2 ========
                {
                    panel2.setBorder(new BevelBorder(BevelBorder.LOWERED));

                    //---- label1 ----
                    label1.setText("ID");

                    //---- label2 ----
                    label2.setText("email");

                    //---- label3 ----
                    label3.setText("Nom");

                    //---- label4 ----
                    label4.setText("adresse");

                    //---- label5 ----
                    label5.setText("Tel");

                    //---- Prenom ----
                    Prenom.setText("Prenom");

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(ID, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label1))
                                        .addGap(125, 125, 125)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(label3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                                                .addComponent(label5)
                                                .addGap(150, 150, 150))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(prenom, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                        .addComponent(Nom, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                                    .addComponent(Prenom))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(Tel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createParallelGroup()
                                                        .addComponent(label4)
                                                        .addComponent(Adresse, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(22, 22, 22))))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(email, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label2))
                                        .addGap(208, 576, Short.MAX_VALUE))))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(label3)
                                    .addComponent(label5))
                                .addGap(1, 1, 1)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2)
                                    .addComponent(label4)
                                    .addComponent(Prenom))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(33, Short.MAX_VALUE))
                    );
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
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
    private JPanel panel1;
    private JButton Add;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel2;
    private JTextField ID;
    private JTextField email;
    private JTextField Nom;
    private JTextField Adresse;
    private JTextField Tel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField prenom;
    private JLabel Prenom;
    private JSeparator separator1;
    private JPanel buttonBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
