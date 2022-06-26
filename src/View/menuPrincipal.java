/*
 * Created by JFormDesigner on Thu Apr 21 07:50:23 EDT 2022
 */

package View;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 * @author unknown
 */
public class menuPrincipal extends JFrame {

    public menuPrincipal() {
        initComponents();

    }

    private void button1(ActionEvent e) {
        film film  =new film();
        film.show();
        dispose();
    }

    private void button2(ActionEvent e) {
        billet billet  =new billet();
        billet.show();
        dispose();
    }

    private void button2MouseClicked(MouseEvent e) {

    }

    private void button5(ActionEvent e) {
        Client client  =new Client();
        client.show();
        dispose();
    }


    private void button3(ActionEvent e) {
        reservation reservation  =new reservation();
        reservation.show();
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        button5 = new JButton();
        button1 = new JButton();
        label3 = new JLabel();
        buttonBar = new JPanel();

        //======== this ========
        setTitle("ACCUEIL");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== panel1 ========
                {
                    panel1.setBorder(new BevelBorder(BevelBorder.RAISED));

                    //---- label1 ----
                    label1.setText("INFO FILM");

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(label1)
                                .addContainerGap(238, Short.MAX_VALUE))
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(label1)
                                .addContainerGap(46, Short.MAX_VALUE))
                    );
                }

                //---- button5 ----
                button5.setText("CLIENT");
                button5.addActionListener(e -> button5(e));

                //---- button1 ----
                button1.setText("LISTE DES FILMS");
                button1.addActionListener(e -> button1(e));

                //---- label3 ----
                label3.setText("Voir la liste des clients");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(label3)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(button1))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button5)))
                            .addContainerGap(173, Short.MAX_VALUE))
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
    private JPanel panel1;
    private JLabel label1;
    private JButton button5;
    private JButton button1;
    private JLabel label3;
    private JPanel buttonBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
