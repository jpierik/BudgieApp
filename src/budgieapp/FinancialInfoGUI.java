/*
 * Created by JFormDesigner on Fri Nov 25 18:17:56 EST 2016
 */

package budgieapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author jon pierik
 */
public class FinancialInfoGUI extends JFrame {
    public FinancialInfoGUI() {
        initComponents();
    }
    String income;
    boolean submitInfo = false;
    public void submitInfoBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        //monthlyIncomeInput.setText("");
        income = monthlyIncomeInput.getText();
        submitInfo = true;
        
    }
    

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - jon pierik
        financialInfoPanel = new JPanel();
        budgieTitle1 = new JTextField();
        budgieTitle2 = new JTextField();
        budgieTitle3 = new JTextField();
        budgieTitle4 = new JTextField();
        budgieTitle5 = new JTextField();
        budgieTitle6 = new JTextField();
        monthlyIncomeInput = new JTextField();
        livingExpenseInput = new JTextField();
        billsExpenseInput = new JTextField();
        otherExpenseInput = new JTextField();
        submitInfoBtn = new JButton();

        //======== this ========
        setTitle("2");
        Container contentPane = getContentPane();

        //======== financialInfoPanel ========
        {
            financialInfoPanel.setBackground(Color.white);

            // JFormDesigner evaluation mark
            financialInfoPanel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), financialInfoPanel.getBorder())); financialInfoPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- budgieTitle1 ----
            budgieTitle1.setText("Budgie");
            budgieTitle1.setFont(new Font("Kristen ITC", Font.BOLD, 36));
            budgieTitle1.setHorizontalAlignment(SwingConstants.CENTER);
            budgieTitle1.setBorder(null);

            //---- budgieTitle2 ----
            budgieTitle2.setText("Finance Made Simple");
            budgieTitle2.setFont(new Font("Kristen ITC", Font.BOLD, 12));
            budgieTitle2.setHorizontalAlignment(SwingConstants.CENTER);
            budgieTitle2.setBorder(null);

            //---- budgieTitle3 ----
            budgieTitle3.setText("Enter Monthly Income:");
            budgieTitle3.setFont(new Font("Arial", Font.BOLD, 14));
            budgieTitle3.setHorizontalAlignment(SwingConstants.RIGHT);
            budgieTitle3.setBorder(null);

            //---- budgieTitle4 ----
            budgieTitle4.setText("Enter Monthly Living Expense:");
            budgieTitle4.setFont(new Font("Arial", Font.BOLD, 14));
            budgieTitle4.setHorizontalAlignment(SwingConstants.RIGHT);
            budgieTitle4.setBorder(null);

            //---- budgieTitle5 ----
            budgieTitle5.setText("Enter Monthly Bills Expense:");
            budgieTitle5.setFont(new Font("Arial", Font.BOLD, 14));
            budgieTitle5.setHorizontalAlignment(SwingConstants.RIGHT);
            budgieTitle5.setBorder(null);

            //---- budgieTitle6 ----
            budgieTitle6.setText("Enter Any Other Monthly Expense:");
            budgieTitle6.setFont(new Font("Arial", Font.BOLD, 14));
            budgieTitle6.setHorizontalAlignment(SwingConstants.RIGHT);
            budgieTitle6.setBorder(null);

            //---- submitInfoBtn ----
            submitInfoBtn.setText("Submit Infomation");
            submitInfoBtn.addActionListener(e -> submitInfoBtnActionPerformed(e));

            GroupLayout financialInfoPanelLayout = new GroupLayout(financialInfoPanel);
            financialInfoPanel.setLayout(financialInfoPanelLayout);
            financialInfoPanelLayout.setHorizontalGroup(
                financialInfoPanelLayout.createParallelGroup()
                    .addGroup(financialInfoPanelLayout.createSequentialGroup()
                        .addGroup(financialInfoPanelLayout.createParallelGroup()
                            .addGroup(financialInfoPanelLayout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addGroup(financialInfoPanelLayout.createParallelGroup()
                                    .addComponent(budgieTitle2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(budgieTitle1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(financialInfoPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(financialInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitInfoBtn, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(financialInfoPanelLayout.createSequentialGroup()
                                        .addGroup(financialInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(budgieTitle6, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(budgieTitle4, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(budgieTitle5, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(budgieTitle3, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(financialInfoPanelLayout.createParallelGroup()
                                            .addComponent(monthlyIncomeInput, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(livingExpenseInput, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(billsExpenseInput, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(otherExpenseInput, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(297, Short.MAX_VALUE))
            );
            financialInfoPanelLayout.setVerticalGroup(
                financialInfoPanelLayout.createParallelGroup()
                    .addGroup(financialInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(budgieTitle1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(budgieTitle2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addGroup(financialInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(budgieTitle3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthlyIncomeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(financialInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(budgieTitle4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(livingExpenseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(financialInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(budgieTitle5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(billsExpenseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(financialInfoPanelLayout.createParallelGroup()
                            .addComponent(budgieTitle6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(otherExpenseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(submitInfoBtn)
                        .addGap(42, 42, 42))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(financialInfoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(financialInfoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - jon pierik
    private JPanel financialInfoPanel;
    private JTextField budgieTitle1;
    private JTextField budgieTitle2;
    private JTextField budgieTitle3;
    private JTextField budgieTitle4;
    private JTextField budgieTitle5;
    private JTextField budgieTitle6;
    public JTextField monthlyIncomeInput;
    private JTextField livingExpenseInput;
    private JTextField billsExpenseInput;
    private JTextField otherExpenseInput;
    private JButton submitInfoBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
