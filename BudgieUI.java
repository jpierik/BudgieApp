import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Nov 22 21:53:55 EST 2016
 */



/**
 * @author jon pierik
 */
public class BudgieUI  {

	private void submitButtonActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void loanScreenActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void savingsScreenActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - jon pierik
		submitInfo = new JFrame();
		panel1 = new JPanel();
		submitButton = new JButton();
		userMonthlyIncome = new JTextField();
		userMonthlyLivingExpense = new JTextField();
		userMonthlyBills = new JTextField();
		userMonthlyOtherExpense = new JTextField();
		jLabelEnterIncome = new JLabel();
		jLabelEnterLivingExpense = new JLabel();
		jLabelEnterBills = new JLabel();
		jLabelEnterOtherExpense = new JLabel();
		budgieTitle1 = new JLabel();
		budgieBirdPic = new JLabel();
		budgieTitle2 = new JLabel();
		financeSummary = new JFrame();
		panel2 = new JPanel();
		budgieBirdPic2 = new JLabel();
		budgieTitle3 = new JLabel();
		budgieTitle4 = new JLabel();
		jLabelYearlyIncome = new JLabel();
		jLabelMonthlyTotalExpense = new JLabel();
		jLabelYearlyTotalExpense = new JLabel();
		loanScreen = new JButton();
		savingsScreen = new JButton();
		transportationScreen = new JButton();
		mainButton1 = new JButton();
		yearlyIncomeResult = new JLabel();
		totalMonthlyExpense = new JLabel();
		yearlyTotalExpense = new JLabel();
		loanCalc = new JFrame();
		panel3 = new JPanel();
		loanScreen2 = new JButton();
		savingsScreen2 = new JButton();
		transportationScreen2 = new JButton();
		budgieTitle5 = new JLabel();
		budgieTitle6 = new JLabel();
		budgieBirdPic3 = new JLabel();
		mainButton2 = new JButton();
		jLabelEnterLoanAmount = new JLabel();
		userEnterLoanAmount = new JTextField();
		jLabelEnterLengthOfLoan = new JLabel();
		userLoanLength = new JTextField();
		jLabelEnterAPR = new JLabel();
		userAPR = new JTextField();
		jLabelYearlyIncome9 = new JLabel();
		jLabelMonthlyCost = new JLabel();
		jLabelTotalLoanWithAPR = new JLabel();
		jLabelLoanWithAPR = new JLabel();
		submitInfoLoan = new JButton();
		savingsCalc = new JFrame();
		panel4 = new JPanel();
		loanScreen3 = new JButton();
		savingsScreen3 = new JButton();
		transportationScreen3 = new JButton();
		budgieTitle7 = new JLabel();
		budgieTitle8 = new JLabel();
		budgieBirdPic4 = new JLabel();
		mainButton3 = new JButton();
		enterAmountToSave = new JLabel();
		userEnterSaveAmount = new JTextField();
		timeMoneyIsNeeded = new JLabel();
		userSavingsTime = new JTextField();
		jLabelAmountNeededToSave = new JLabel();
		jLabelSavingsPerMonth = new JLabel();
		submitInfoSavings = new JButton();
		transportationExpense = new JFrame();
		panel5 = new JPanel();
		loanScreen4 = new JButton();
		savingsScreen4 = new JButton();
		transportationScreen4 = new JButton();
		budgieTitle9 = new JLabel();
		budgieTitle10 = new JLabel();
		budgieBirdPic5 = new JLabel();
		mainButton4 = new JButton();
		jLabelEnterMPG = new JLabel();
		userMPG = new JTextField();
		userFuelCost = new JTextField();
		jLabelFuelCost = new JLabel();
		userMilesToTravel = new JTextField();
		jLabelEnterMilesToTravel = new JLabel();
		jLabelYearlyIncome5 = new JLabel();
		jLabelCostOfTravel = new JLabel();
		jLabelFuelRequired = new JLabel();
		jLabeFuelRequired = new JLabel();
		submitInfoTransportation = new JButton();

		//======== submitInfo ========
		{
			submitInfo.setTitle("Submit Information");
			Container submitInfoContentPane = submitInfo.getContentPane();

			//======== panel1 ========
			{
				panel1.setFont(panel1.getFont().deriveFont(panel1.getFont().getStyle() | Font.BOLD, panel1.getFont().getSize() + 1f));
				panel1.setBackground(Color.white);

				// JFormDesigner evaluation mark
				panel1.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- submitButton ----
				submitButton.setText("Submit Info");
				submitButton.setFont(new Font("Arial", Font.PLAIN, 14));
				submitButton.addActionListener(e -> submitButtonActionPerformed(e));

				//---- jLabelEnterIncome ----
				jLabelEnterIncome.setText("Enter Monthly Income:");
				jLabelEnterIncome.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterIncome.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelEnterLivingExpense ----
				jLabelEnterLivingExpense.setText("Enter Monthly Living Expense:");
				jLabelEnterLivingExpense.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterLivingExpense.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelEnterBills ----
				jLabelEnterBills.setText("Enter Monthly Bills Expense:");
				jLabelEnterBills.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterBills.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelEnterOtherExpense ----
				jLabelEnterOtherExpense.setText("Enter Any Other Monthly Expense:`");
				jLabelEnterOtherExpense.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterOtherExpense.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- budgieTitle1 ----
				budgieTitle1.setText("Budgie");
				budgieTitle1.setFont(new Font("Kristen ITC", Font.BOLD, 36));
				budgieTitle1.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieBirdPic ----
				budgieBirdPic.setIcon(new ImageIcon("C:\\Users\\jonpi\\Desktop\\budgie bird.jpg"));

				//---- budgieTitle2 ----
				budgieTitle2.setText("Finance Made Simple");
				budgieTitle2.setFont(new Font("Kristen ITC", Font.BOLD, 12));
				budgieTitle2.setHorizontalAlignment(SwingConstants.CENTER);

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout.setHorizontalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addGap(87, 87, 87)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(jLabelEnterIncome, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(jLabelEnterOtherExpense, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jLabelEnterBills, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(jLabelEnterLivingExpense, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(panel1Layout.createParallelGroup()
								.addGroup(panel1Layout.createSequentialGroup()
									.addGroup(panel1Layout.createParallelGroup()
										.addComponent(userMonthlyBills, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addComponent(userMonthlyOtherExpense, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addComponent(userMonthlyLivingExpense, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addComponent(userMonthlyIncome, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addComponent(budgieTitle1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
									.addGap(18, 18, 18)
									.addComponent(budgieBirdPic, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
								.addGroup(panel1Layout.createSequentialGroup()
									.addGroup(panel1Layout.createParallelGroup()
										.addComponent(submitButton, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addComponent(budgieTitle2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
									.addGap(0, 0, Short.MAX_VALUE)))
							.addGap(5, 5, 5))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(budgieTitle1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGroup(panel1Layout.createParallelGroup()
								.addGroup(panel1Layout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(budgieTitle2)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
									.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(userMonthlyIncome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelEnterIncome))
									.addGap(13, 13, 13)
									.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(userMonthlyLivingExpense, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelEnterLivingExpense))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(userMonthlyBills, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelEnterBills))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(userMonthlyOtherExpense, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelEnterOtherExpense))
									.addGap(109, 109, 109))
								.addGroup(panel1Layout.createSequentialGroup()
									.addGap(55, 55, 55)
									.addComponent(budgieBirdPic, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)))
							.addComponent(submitButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(72, 72, 72))
				);
			}

			GroupLayout submitInfoContentPaneLayout = new GroupLayout(submitInfoContentPane);
			submitInfoContentPane.setLayout(submitInfoContentPaneLayout);
			submitInfoContentPaneLayout.setHorizontalGroup(
				submitInfoContentPaneLayout.createParallelGroup()
					.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			submitInfoContentPaneLayout.setVerticalGroup(
				submitInfoContentPaneLayout.createParallelGroup()
					.addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			submitInfo.pack();
			submitInfo.setLocationRelativeTo(submitInfo.getOwner());
		}

		//======== financeSummary ========
		{
			financeSummary.setBackground(Color.white);
			financeSummary.setTitle("Current Financial Summary");
			Container financeSummaryContentPane = financeSummary.getContentPane();

			//======== panel2 ========
			{
				panel2.setBackground(Color.white);

				// JFormDesigner evaluation mark
				panel2.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- budgieBirdPic2 ----
				budgieBirdPic2.setIcon(new ImageIcon("C:\\Users\\jonpi\\Desktop\\budgie bird.jpg"));

				//---- budgieTitle3 ----
				budgieTitle3.setText("Budgie");
				budgieTitle3.setFont(new Font("Kristen ITC", Font.BOLD, 36));
				budgieTitle3.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieTitle4 ----
				budgieTitle4.setText("Finance Made Simple");
				budgieTitle4.setFont(new Font("Kristen ITC", Font.BOLD, 12));
				budgieTitle4.setHorizontalAlignment(SwingConstants.CENTER);

				//---- jLabelYearlyIncome ----
				jLabelYearlyIncome.setText("Yearly Income Total:");
				jLabelYearlyIncome.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelYearlyIncome.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelMonthlyTotalExpense ----
				jLabelMonthlyTotalExpense.setText("Monthly Total Expense:");
				jLabelMonthlyTotalExpense.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelMonthlyTotalExpense.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelYearlyTotalExpense ----
				jLabelYearlyTotalExpense.setText("Yearly Total Expense:");
				jLabelYearlyTotalExpense.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelYearlyTotalExpense.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- loanScreen ----
				loanScreen.setText("Loan Calculator");
				loanScreen.setFont(new Font("Arial", Font.PLAIN, 14));
				loanScreen.addActionListener(e -> {
			submitButtonActionPerformed(e);
			loanScreenActionPerformed(e);
		});

				//---- savingsScreen ----
				savingsScreen.setText("Savings Calculator");
				savingsScreen.setFont(new Font("Arial", Font.PLAIN, 14));
				savingsScreen.addActionListener(e -> {
			submitButtonActionPerformed(e);
			savingsScreenActionPerformed(e);
		});

				//---- transportationScreen ----
				transportationScreen.setText("Transportation Expenses");
				transportationScreen.setFont(new Font("Arial", Font.PLAIN, 14));
				transportationScreen.addActionListener(e -> submitButtonActionPerformed(e));

				//---- mainButton1 ----
				mainButton1.setText("Main");

				//---- yearlyIncomeResult ----
				yearlyIncomeResult.setText("---");
				yearlyIncomeResult.setFont(new Font("Arial", Font.BOLD, 12));
				yearlyIncomeResult.setHorizontalAlignment(SwingConstants.CENTER);

				//---- totalMonthlyExpense ----
				totalMonthlyExpense.setText("---");
				totalMonthlyExpense.setFont(new Font("Arial", Font.BOLD, 12));
				totalMonthlyExpense.setHorizontalAlignment(SwingConstants.CENTER);

				//---- yearlyTotalExpense ----
				yearlyTotalExpense.setText("---");
				yearlyTotalExpense.setFont(new Font("Arial", Font.BOLD, 12));
				yearlyTotalExpense.setHorizontalAlignment(SwingConstants.CENTER);

				GroupLayout panel2Layout = new GroupLayout(panel2);
				panel2.setLayout(panel2Layout);
				panel2Layout.setHorizontalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
							.addGroup(panel2Layout.createParallelGroup()
								.addGroup(panel2Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(mainButton1)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(budgieTitle3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addGroup(panel2Layout.createSequentialGroup()
											.addComponent(loanScreen, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
											.addGap(18, 18, 18)
											.addComponent(savingsScreen, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
										.addComponent(budgieTitle4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
									.addGap(18, 18, 18))
								.addGroup(panel2Layout.createSequentialGroup()
									.addGap(121, 121, 121)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(jLabelYearlyTotalExpense, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelMonthlyTotalExpense, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelYearlyIncome, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(panel2Layout.createParallelGroup()
										.addComponent(yearlyIncomeResult, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(totalMonthlyExpense, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(yearlyTotalExpense, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
							.addGroup(panel2Layout.createParallelGroup()
								.addComponent(budgieBirdPic2, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
								.addComponent(transportationScreen, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
							.addGap(16, 16, 16))
				);
				panel2Layout.setVerticalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(budgieTitle3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(panel2Layout.createParallelGroup()
								.addGroup(panel2Layout.createSequentialGroup()
									.addGap(6, 6, 6)
									.addComponent(budgieTitle4)
									.addGap(112, 112, 112)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabelYearlyIncome)
										.addComponent(yearlyIncomeResult))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabelMonthlyTotalExpense)
										.addComponent(totalMonthlyExpense))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabelYearlyTotalExpense)
										.addComponent(yearlyTotalExpense))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE))
								.addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
									.addComponent(budgieBirdPic2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
									.addGap(104, 104, 104)))
							.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(loanScreen, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(transportationScreen, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(savingsScreen, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
							.addGap(40, 40, 40))
				);
			}

			GroupLayout financeSummaryContentPaneLayout = new GroupLayout(financeSummaryContentPane);
			financeSummaryContentPane.setLayout(financeSummaryContentPaneLayout);
			financeSummaryContentPaneLayout.setHorizontalGroup(
				financeSummaryContentPaneLayout.createParallelGroup()
					.addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			financeSummaryContentPaneLayout.setVerticalGroup(
				financeSummaryContentPaneLayout.createParallelGroup()
					.addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			financeSummary.pack();
			financeSummary.setLocationRelativeTo(financeSummary.getOwner());
		}

		//======== loanCalc ========
		{
			loanCalc.setTitle("Loan Calculator");
			Container loanCalcContentPane = loanCalc.getContentPane();

			//======== panel3 ========
			{
				panel3.setBackground(Color.white);

				// JFormDesigner evaluation mark
				panel3.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), panel3.getBorder())); panel3.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- loanScreen2 ----
				loanScreen2.setText("Loan Calculator");
				loanScreen2.setFont(new Font("Arial", Font.PLAIN, 14));
				loanScreen2.addActionListener(e -> {
			submitButtonActionPerformed(e);
			loanScreenActionPerformed(e);
		});

				//---- savingsScreen2 ----
				savingsScreen2.setText("Savings Calculator");
				savingsScreen2.setFont(new Font("Arial", Font.PLAIN, 14));
				savingsScreen2.addActionListener(e -> {
			submitButtonActionPerformed(e);
			savingsScreenActionPerformed(e);
		});

				//---- transportationScreen2 ----
				transportationScreen2.setText("Transportation Expenses");
				transportationScreen2.setFont(new Font("Arial", Font.PLAIN, 14));
				transportationScreen2.addActionListener(e -> submitButtonActionPerformed(e));

				//---- budgieTitle5 ----
				budgieTitle5.setText("Budgie");
				budgieTitle5.setFont(new Font("Kristen ITC", Font.BOLD, 36));
				budgieTitle5.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieTitle6 ----
				budgieTitle6.setText("Finance Made Simple");
				budgieTitle6.setFont(new Font("Kristen ITC", Font.BOLD, 12));
				budgieTitle6.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieBirdPic3 ----
				budgieBirdPic3.setIcon(new ImageIcon("C:\\Users\\jonpi\\Desktop\\budgie bird.jpg"));

				//---- mainButton2 ----
				mainButton2.setText("Main");

				//---- jLabelEnterLoanAmount ----
				jLabelEnterLoanAmount.setText("Enter Loan Amount:");
				jLabelEnterLoanAmount.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterLoanAmount.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelEnterLengthOfLoan ----
				jLabelEnterLengthOfLoan.setText("Enter Length of Loan in Months:");
				jLabelEnterLengthOfLoan.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterLengthOfLoan.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelEnterAPR ----
				jLabelEnterAPR.setText("Enter APR:");
				jLabelEnterAPR.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterAPR.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelYearlyIncome9 ----
				jLabelYearlyIncome9.setText("Monthly Cost:");
				jLabelYearlyIncome9.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelYearlyIncome9.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelMonthlyCost ----
				jLabelMonthlyCost.setText("---");
				jLabelMonthlyCost.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelMonthlyCost.setHorizontalAlignment(SwingConstants.CENTER);

				//---- jLabelTotalLoanWithAPR ----
				jLabelTotalLoanWithAPR.setText("Total Loan With APR:");
				jLabelTotalLoanWithAPR.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelTotalLoanWithAPR.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelLoanWithAPR ----
				jLabelLoanWithAPR.setText("---");
				jLabelLoanWithAPR.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelLoanWithAPR.setHorizontalAlignment(SwingConstants.CENTER);

				//---- submitInfoLoan ----
				submitInfoLoan.setText("Submit Information");
				submitInfoLoan.setFont(new Font("Arial", Font.PLAIN, 14));
				submitInfoLoan.addActionListener(e -> {
			submitButtonActionPerformed(e);
			savingsScreenActionPerformed(e);
		});

				GroupLayout panel3Layout = new GroupLayout(panel3);
				panel3.setLayout(panel3Layout);
				panel3Layout.setHorizontalGroup(
					panel3Layout.createParallelGroup()
						.addGroup(panel3Layout.createSequentialGroup()
							.addGroup(panel3Layout.createParallelGroup()
								.addGroup(panel3Layout.createSequentialGroup()
									.addGroup(panel3Layout.createParallelGroup()
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(76, 76, 76)
											.addComponent(loanScreen2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
										.addGroup(panel3Layout.createSequentialGroup()
											.addContainerGap()
											.addComponent(mainButton2)))
									.addGap(18, 18, 18)
									.addGroup(panel3Layout.createParallelGroup()
										.addComponent(budgieTitle5, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addGroup(panel3Layout.createSequentialGroup()
											.addComponent(savingsScreen2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
											.addGap(18, 18, 18)
											.addComponent(transportationScreen2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
										.addComponent(budgieTitle6, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addComponent(submitInfoLoan, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
								.addGroup(panel3Layout.createSequentialGroup()
									.addGroup(panel3Layout.createParallelGroup()
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(139, 139, 139)
											.addGroup(panel3Layout.createParallelGroup()
												.addGroup(panel3Layout.createSequentialGroup()
													.addComponent(jLabelEnterLoanAmount, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
													.addGap(10, 10, 10)
													.addComponent(userEnterLoanAmount, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
												.addGroup(panel3Layout.createSequentialGroup()
													.addComponent(jLabelEnterAPR, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
													.addGap(10, 10, 10)
													.addComponent(userAPR, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
												.addGroup(panel3Layout.createSequentialGroup()
													.addComponent(jLabelYearlyIncome9, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
													.addGap(10, 10, 10)
													.addComponent(jLabelMonthlyCost, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
												.addGroup(panel3Layout.createSequentialGroup()
													.addComponent(jLabelTotalLoanWithAPR, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
													.addGap(10, 10, 10)
													.addComponent(jLabelLoanWithAPR, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(116, 116, 116)
											.addComponent(jLabelEnterLengthOfLoan, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
											.addGap(10, 10, 10)
											.addComponent(userLoanLength, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
									.addGap(47, 47, 47)
									.addComponent(budgieBirdPic3, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(27, Short.MAX_VALUE))
				);
				panel3Layout.setVerticalGroup(
					panel3Layout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(budgieTitle5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(budgieTitle6)
							.addGap(64, 64, 64)
							.addGroup(panel3Layout.createParallelGroup()
								.addComponent(budgieBirdPic3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addGroup(panel3Layout.createSequentialGroup()
									.addGroup(panel3Layout.createParallelGroup()
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(2, 2, 2)
											.addComponent(jLabelEnterLoanAmount))
										.addComponent(userEnterLoanAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(11, 11, 11)
									.addGroup(panel3Layout.createParallelGroup()
										.addComponent(userLoanLength, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(2, 2, 2)
											.addComponent(jLabelEnterLengthOfLoan)))
									.addGap(11, 11, 11)
									.addGroup(panel3Layout.createParallelGroup()
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(2, 2, 2)
											.addComponent(jLabelEnterAPR))
										.addComponent(userAPR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel3Layout.createParallelGroup()
										.addComponent(jLabelYearlyIncome9)
										.addComponent(jLabelMonthlyCost))
									.addGap(11, 11, 11)
									.addGroup(panel3Layout.createParallelGroup()
										.addComponent(jLabelTotalLoanWithAPR)
										.addComponent(jLabelLoanWithAPR))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
							.addComponent(submitInfoLoan, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addGroup(panel3Layout.createParallelGroup()
								.addComponent(loanScreen2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(savingsScreen2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(transportationScreen2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
							.addGap(28, 28, 28))
				);
			}

			GroupLayout loanCalcContentPaneLayout = new GroupLayout(loanCalcContentPane);
			loanCalcContentPane.setLayout(loanCalcContentPaneLayout);
			loanCalcContentPaneLayout.setHorizontalGroup(
				loanCalcContentPaneLayout.createParallelGroup()
					.addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			loanCalcContentPaneLayout.setVerticalGroup(
				loanCalcContentPaneLayout.createParallelGroup()
					.addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			loanCalc.pack();
			loanCalc.setLocationRelativeTo(loanCalc.getOwner());
		}

		//======== savingsCalc ========
		{
			savingsCalc.setTitle("Savings Calculator");
			Container savingsCalcContentPane = savingsCalc.getContentPane();

			//======== panel4 ========
			{
				panel4.setBackground(Color.white);

				// JFormDesigner evaluation mark
				panel4.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), panel4.getBorder())); panel4.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- loanScreen3 ----
				loanScreen3.setText("Loan Calculator");
				loanScreen3.setFont(new Font("Arial", Font.PLAIN, 14));
				loanScreen3.addActionListener(e -> {
			submitButtonActionPerformed(e);
			loanScreenActionPerformed(e);
		});

				//---- savingsScreen3 ----
				savingsScreen3.setText("Savings Calculator");
				savingsScreen3.setFont(new Font("Arial", Font.PLAIN, 14));
				savingsScreen3.addActionListener(e -> {
			submitButtonActionPerformed(e);
			savingsScreenActionPerformed(e);
		});

				//---- transportationScreen3 ----
				transportationScreen3.setText("Transportation Expenses");
				transportationScreen3.setFont(new Font("Arial", Font.PLAIN, 14));
				transportationScreen3.addActionListener(e -> submitButtonActionPerformed(e));

				//---- budgieTitle7 ----
				budgieTitle7.setText("Budgie");
				budgieTitle7.setFont(new Font("Kristen ITC", Font.BOLD, 36));
				budgieTitle7.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieTitle8 ----
				budgieTitle8.setText("Finance Made Simple");
				budgieTitle8.setFont(new Font("Kristen ITC", Font.BOLD, 12));
				budgieTitle8.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieBirdPic4 ----
				budgieBirdPic4.setIcon(new ImageIcon("C:\\Users\\jonpi\\Desktop\\budgie bird.jpg"));

				//---- mainButton3 ----
				mainButton3.setText("Main");

				//---- enterAmountToSave ----
				enterAmountToSave.setText("Enter Amount You Wish to Save:");
				enterAmountToSave.setFont(new Font("Arial", Font.BOLD, 12));
				enterAmountToSave.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- timeMoneyIsNeeded ----
				timeMoneyIsNeeded.setText("Enter Time (in months) This Amount is Needed:");
				timeMoneyIsNeeded.setFont(new Font("Arial", Font.BOLD, 12));
				timeMoneyIsNeeded.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelAmountNeededToSave ----
				jLabelAmountNeededToSave.setText("Amount Needed to Save Per Month:");
				jLabelAmountNeededToSave.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelAmountNeededToSave.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelSavingsPerMonth ----
				jLabelSavingsPerMonth.setText("---");
				jLabelSavingsPerMonth.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelSavingsPerMonth.setHorizontalAlignment(SwingConstants.CENTER);

				//---- submitInfoSavings ----
				submitInfoSavings.setText("Submit Information");
				submitInfoSavings.setFont(new Font("Arial", Font.PLAIN, 14));
				submitInfoSavings.addActionListener(e -> {
			submitButtonActionPerformed(e);
			savingsScreenActionPerformed(e);
		});

				GroupLayout panel4Layout = new GroupLayout(panel4);
				panel4.setLayout(panel4Layout);
				panel4Layout.setHorizontalGroup(
					panel4Layout.createParallelGroup()
						.addGroup(panel4Layout.createSequentialGroup()
							.addGroup(panel4Layout.createParallelGroup()
								.addGroup(panel4Layout.createSequentialGroup()
									.addGroup(panel4Layout.createParallelGroup()
										.addGroup(panel4Layout.createSequentialGroup()
											.addGap(77, 77, 77)
											.addComponent(loanScreen3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
										.addGroup(panel4Layout.createSequentialGroup()
											.addContainerGap()
											.addComponent(mainButton3)))
									.addGap(18, 18, 18)
									.addGroup(panel4Layout.createParallelGroup()
										.addComponent(budgieTitle7, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addComponent(budgieTitle8, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addGroup(panel4Layout.createSequentialGroup()
											.addComponent(savingsScreen3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
											.addGap(18, 18, 18)
											.addComponent(transportationScreen3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
										.addComponent(submitInfoSavings, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
								.addGroup(panel4Layout.createSequentialGroup()
									.addGroup(panel4Layout.createParallelGroup()
										.addGroup(panel4Layout.createSequentialGroup()
											.addGap(91, 91, 91)
											.addComponent(enterAmountToSave, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
											.addGap(10, 10, 10)
											.addComponent(userEnterSaveAmount, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
										.addGroup(panel4Layout.createSequentialGroup()
											.addGap(59, 59, 59)
											.addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
												.addComponent(timeMoneyIsNeeded)
												.addComponent(jLabelAmountNeededToSave, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addGroup(panel4Layout.createParallelGroup()
												.addComponent(jLabelSavingsPerMonth, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
												.addComponent(userSavingsTime, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
									.addGap(35, 35, 35)
									.addComponent(budgieBirdPic4, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(26, Short.MAX_VALUE))
				);
				panel4Layout.setVerticalGroup(
					panel4Layout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(budgieTitle7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addGap(6, 6, 6)
							.addComponent(budgieTitle8)
							.addGap(53, 53, 53)
							.addGroup(panel4Layout.createParallelGroup()
								.addComponent(budgieBirdPic4, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addGroup(panel4Layout.createSequentialGroup()
									.addGroup(panel4Layout.createParallelGroup()
										.addComponent(userEnterSaveAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(panel4Layout.createSequentialGroup()
											.addGap(2, 2, 2)
											.addComponent(enterAmountToSave)))
									.addGap(11, 11, 11)
									.addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(timeMoneyIsNeeded)
										.addComponent(userSavingsTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabelSavingsPerMonth)
										.addComponent(jLabelAmountNeededToSave))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
							.addComponent(submitInfoSavings, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addGroup(panel4Layout.createParallelGroup()
								.addComponent(loanScreen3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(savingsScreen3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(transportationScreen3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
							.addGap(28, 28, 28))
				);
			}

			GroupLayout savingsCalcContentPaneLayout = new GroupLayout(savingsCalcContentPane);
			savingsCalcContentPane.setLayout(savingsCalcContentPaneLayout);
			savingsCalcContentPaneLayout.setHorizontalGroup(
				savingsCalcContentPaneLayout.createParallelGroup()
					.addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			savingsCalcContentPaneLayout.setVerticalGroup(
				savingsCalcContentPaneLayout.createParallelGroup()
					.addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			savingsCalc.pack();
			savingsCalc.setLocationRelativeTo(savingsCalc.getOwner());
		}

		//======== transportationExpense ========
		{
			transportationExpense.setTitle("Transportation Expenses");
			Container transportationExpenseContentPane = transportationExpense.getContentPane();

			//======== panel5 ========
			{
				panel5.setBackground(Color.white);

				// JFormDesigner evaluation mark
				panel5.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), panel5.getBorder())); panel5.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- loanScreen4 ----
				loanScreen4.setText("Loan Calculator");
				loanScreen4.setFont(new Font("Arial", Font.PLAIN, 14));
				loanScreen4.addActionListener(e -> {
			submitButtonActionPerformed(e);
			loanScreenActionPerformed(e);
		});

				//---- savingsScreen4 ----
				savingsScreen4.setText("Savings Calculator");
				savingsScreen4.setFont(new Font("Arial", Font.PLAIN, 14));
				savingsScreen4.addActionListener(e -> {
			submitButtonActionPerformed(e);
			savingsScreenActionPerformed(e);
		});

				//---- transportationScreen4 ----
				transportationScreen4.setText("Transportation Expenses");
				transportationScreen4.setFont(new Font("Arial", Font.PLAIN, 14));
				transportationScreen4.addActionListener(e -> submitButtonActionPerformed(e));

				//---- budgieTitle9 ----
				budgieTitle9.setText("Budgie");
				budgieTitle9.setFont(new Font("Kristen ITC", Font.BOLD, 36));
				budgieTitle9.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieTitle10 ----
				budgieTitle10.setText("Finance Made Simple");
				budgieTitle10.setFont(new Font("Kristen ITC", Font.BOLD, 12));
				budgieTitle10.setHorizontalAlignment(SwingConstants.CENTER);

				//---- budgieBirdPic5 ----
				budgieBirdPic5.setIcon(new ImageIcon("C:\\Users\\jonpi\\Desktop\\budgie bird.jpg"));

				//---- mainButton4 ----
				mainButton4.setText("Main");

				//---- jLabelEnterMPG ----
				jLabelEnterMPG.setText("Enter Current MPG:");
				jLabelEnterMPG.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterMPG.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelFuelCost ----
				jLabelFuelCost.setText("Enter Fuel Cost Per Gallon:");
				jLabelFuelCost.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelFuelCost.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelEnterMilesToTravel ----
				jLabelEnterMilesToTravel.setText("Enter Miles to Travel:");
				jLabelEnterMilesToTravel.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelEnterMilesToTravel.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelYearlyIncome5 ----
				jLabelYearlyIncome5.setText("Cost of Travel:");
				jLabelYearlyIncome5.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelYearlyIncome5.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabelCostOfTravel ----
				jLabelCostOfTravel.setText("---");
				jLabelCostOfTravel.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelCostOfTravel.setHorizontalAlignment(SwingConstants.CENTER);

				//---- jLabelFuelRequired ----
				jLabelFuelRequired.setText("Gallons of Fuel Required:");
				jLabelFuelRequired.setFont(new Font("Arial", Font.BOLD, 12));
				jLabelFuelRequired.setHorizontalAlignment(SwingConstants.RIGHT);

				//---- jLabeFuelRequired ----
				jLabeFuelRequired.setText("---");
				jLabeFuelRequired.setFont(new Font("Arial", Font.BOLD, 12));
				jLabeFuelRequired.setHorizontalAlignment(SwingConstants.CENTER);

				//---- submitInfoTransportation ----
				submitInfoTransportation.setText("Submit Information");
				submitInfoTransportation.setFont(new Font("Arial", Font.PLAIN, 14));
				submitInfoTransportation.addActionListener(e -> {
			submitButtonActionPerformed(e);
			savingsScreenActionPerformed(e);
		});

				GroupLayout panel5Layout = new GroupLayout(panel5);
				panel5.setLayout(panel5Layout);
				panel5Layout.setHorizontalGroup(
					panel5Layout.createParallelGroup()
						.addGroup(panel5Layout.createSequentialGroup()
							.addGap(144, 144, 144)
							.addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(panel5Layout.createSequentialGroup()
									.addComponent(jLabelEnterMPG, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addGap(10, 10, 10)
									.addComponent(userMPG))
								.addGroup(panel5Layout.createSequentialGroup()
									.addComponent(jLabelFuelCost, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addGap(10, 10, 10)
									.addComponent(userFuelCost))
								.addGroup(panel5Layout.createSequentialGroup()
									.addComponent(jLabelEnterMilesToTravel, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addGap(10, 10, 10)
									.addComponent(userMilesToTravel))
								.addGroup(panel5Layout.createSequentialGroup()
									.addComponent(jLabelYearlyIncome5, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(jLabelCostOfTravel, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
								.addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
									.addComponent(jLabelFuelRequired, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addGap(10, 10, 10)
									.addComponent(jLabeFuelRequired, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
							.addGap(46, 46, 46)
							.addComponent(budgieBirdPic5, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
							.addGap(23, 23, 23))
						.addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
							.addGroup(panel5Layout.createParallelGroup()
								.addGroup(panel5Layout.createSequentialGroup()
									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(loanScreen4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18))
								.addGroup(panel5Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(mainButton4)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGroup(panel5Layout.createParallelGroup()
								.addComponent(submitInfoTransportation, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
								.addComponent(budgieTitle9, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
								.addComponent(budgieTitle10, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
								.addGroup(panel5Layout.createSequentialGroup()
									.addComponent(savingsScreen4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(transportationScreen4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
							.addGap(78, 78, 78))
				);
				panel5Layout.setVerticalGroup(
					panel5Layout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panel5Layout.createParallelGroup()
								.addComponent(budgieTitle9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainButton4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(budgieTitle10)
							.addGroup(panel5Layout.createParallelGroup()
								.addGroup(panel5Layout.createSequentialGroup()
									.addGap(53, 53, 53)
									.addComponent(budgieBirdPic5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
								.addGroup(panel5Layout.createSequentialGroup()
									.addGap(73, 73, 73)
									.addGroup(panel5Layout.createParallelGroup()
										.addGroup(panel5Layout.createSequentialGroup()
											.addGap(2, 2, 2)
											.addComponent(jLabelEnterMPG))
										.addComponent(userMPG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(panel5Layout.createParallelGroup()
										.addGroup(panel5Layout.createSequentialGroup()
											.addGap(13, 13, 13)
											.addComponent(jLabelFuelCost))
										.addGroup(panel5Layout.createSequentialGroup()
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(userFuelCost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGroup(panel5Layout.createParallelGroup()
										.addGroup(panel5Layout.createSequentialGroup()
											.addGap(13, 13, 13)
											.addComponent(jLabelEnterMilesToTravel))
										.addGroup(panel5Layout.createSequentialGroup()
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(userMilesToTravel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabelYearlyIncome5)
										.addComponent(jLabelCostOfTravel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel5Layout.createParallelGroup()
										.addComponent(jLabelFuelRequired)
										.addComponent(jLabeFuelRequired))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
							.addComponent(submitInfoTransportation, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addGroup(panel5Layout.createParallelGroup()
								.addComponent(loanScreen4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(savingsScreen4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(transportationScreen4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
							.addGap(28, 28, 28))
				);
			}

			GroupLayout transportationExpenseContentPaneLayout = new GroupLayout(transportationExpenseContentPane);
			transportationExpenseContentPane.setLayout(transportationExpenseContentPaneLayout);
			transportationExpenseContentPaneLayout.setHorizontalGroup(
				transportationExpenseContentPaneLayout.createParallelGroup()
					.addComponent(panel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			transportationExpenseContentPaneLayout.setVerticalGroup(
				transportationExpenseContentPaneLayout.createParallelGroup()
					.addComponent(panel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			transportationExpense.pack();
			transportationExpense.setLocationRelativeTo(transportationExpense.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - jon pierik
	private JFrame submitInfo;
	private JPanel panel1;
	private JButton submitButton;
	private JTextField userMonthlyIncome;
	private JTextField userMonthlyLivingExpense;
	private JTextField userMonthlyBills;
	private JTextField userMonthlyOtherExpense;
	private JLabel jLabelEnterIncome;
	private JLabel jLabelEnterLivingExpense;
	private JLabel jLabelEnterBills;
	private JLabel jLabelEnterOtherExpense;
	private JLabel budgieTitle1;
	private JLabel budgieBirdPic;
	private JLabel budgieTitle2;
	private JFrame financeSummary;
	private JPanel panel2;
	private JLabel budgieBirdPic2;
	private JLabel budgieTitle3;
	private JLabel budgieTitle4;
	private JLabel jLabelYearlyIncome;
	private JLabel jLabelMonthlyTotalExpense;
	private JLabel jLabelYearlyTotalExpense;
	private JButton loanScreen;
	private JButton savingsScreen;
	private JButton transportationScreen;
	private JButton mainButton1;
	private JLabel yearlyIncomeResult;
	private JLabel totalMonthlyExpense;
	private JLabel yearlyTotalExpense;
	private JFrame loanCalc;
	private JPanel panel3;
	private JButton loanScreen2;
	private JButton savingsScreen2;
	private JButton transportationScreen2;
	private JLabel budgieTitle5;
	private JLabel budgieTitle6;
	private JLabel budgieBirdPic3;
	private JButton mainButton2;
	private JLabel jLabelEnterLoanAmount;
	private JTextField userEnterLoanAmount;
	private JLabel jLabelEnterLengthOfLoan;
	private JTextField userLoanLength;
	private JLabel jLabelEnterAPR;
	private JTextField userAPR;
	private JLabel jLabelYearlyIncome9;
	private JLabel jLabelMonthlyCost;
	private JLabel jLabelTotalLoanWithAPR;
	private JLabel jLabelLoanWithAPR;
	private JButton submitInfoLoan;
	private JFrame savingsCalc;
	private JPanel panel4;
	private JButton loanScreen3;
	private JButton savingsScreen3;
	private JButton transportationScreen3;
	private JLabel budgieTitle7;
	private JLabel budgieTitle8;
	private JLabel budgieBirdPic4;
	private JButton mainButton3;
	private JLabel enterAmountToSave;
	private JTextField userEnterSaveAmount;
	private JLabel timeMoneyIsNeeded;
	private JTextField userSavingsTime;
	private JLabel jLabelAmountNeededToSave;
	private JLabel jLabelSavingsPerMonth;
	private JButton submitInfoSavings;
	private JFrame transportationExpense;
	private JPanel panel5;
	private JButton loanScreen4;
	private JButton savingsScreen4;
	private JButton transportationScreen4;
	private JLabel budgieTitle9;
	private JLabel budgieTitle10;
	private JLabel budgieBirdPic5;
	private JButton mainButton4;
	private JLabel jLabelEnterMPG;
	private JTextField userMPG;
	private JTextField userFuelCost;
	private JLabel jLabelFuelCost;
	private JTextField userMilesToTravel;
	private JLabel jLabelEnterMilesToTravel;
	private JLabel jLabelYearlyIncome5;
	private JLabel jLabelCostOfTravel;
	private JLabel jLabelFuelRequired;
	private JLabel jLabeFuelRequired;
	private JButton submitInfoTransportation;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
