
package budgieapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import my.budgieui.FinancialInfoUI;

public class EnterFinancialInfo extends FinancialInfoUI{
    

    FinancialInfoUI infoUI = new FinancialInfoUI();
    FinancialInfoGUI ui = new FinancialInfoGUI();

    String monthlyIncomeStr;
    String monthlyBillsStr;
    String monthlyOtherExpenseStr;
    String monthlyLivingExpenseStr;
    boolean flag = false;
    
    float income;
    float bills;
    float otherExpense;
    float livingExpense;
    
    float yearlyIncome;
    float totalMonthlyExpense;
    float totalYearlyExpense;
   
    public void getInputInfo(){    
        
        infoUI.setVisible(true);
        while (flag == false){
            if (infoUI.submitTest != null){
                System.out.println(infoUI.submitTest);
            }
        //infoUI.jLabel1.setText("Hello");
        //infoUI.getContentPane().setBackground(Color.white);
        //monthlyIncomeStr = infoUI.userMonthlyIncome.getText();
       //// monthlyBillsStr = infoUI.userMonthlyLivingExpense.getText();
       /// monthlyOtherExpenseStr = infoUI.userMonthlyOtherExpense.getText();
       // monthlyLivingExpenseStr = infoUI.userMonthlyLivingExpense.getText();
        
        //convert the strings to number 
        //income = Float.valueOf(monthlyIncomeStr);
        //bills = Float.valueOf(monthlyBillsStr);
        //otherExpense = Float.valueOf(monthlyOtherExpenseStr);
        //livingExpense = Float.valueOf(monthlyLivingExpenseStr);
        
        //simple calculations for annual financial facts
        //yearlyIncome = income * 12;
        //totalMonthlyExpense = bills + otherExpense + livingExpense;
        //totalYearlyExpense = totalMonthlyExpense * 12;
            }
    }
        }
            
    
