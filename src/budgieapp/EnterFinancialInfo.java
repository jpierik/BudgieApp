
package budgieapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import budgieapp.FinancialInfoUI;

public class EnterFinancialInfo extends BudgieTest{
    

    FinancialInfoUI infoUI = new FinancialInfoUI();
    
   
    String monthlyIncomeStr;
    String monthlyBillsStr;
    String monthlyOtherExpenseStr;
    String monthlyLivingExpenseStr;
    
    float income;
    float bills;
    float otherExpense;
    float livingExpense;
    
    float yearlyIncome;
    float totalMonthlyExpense;
    float totalYearlyExpense;
   
    public void getInputInfo(){    
       
        infoUI.setVisible(true);
        
        //infoUI.getContentPane().setBackground(Color.white);
        
        monthlyIncomeStr = infoUI.userMonthlyIncome.getText();
        monthlyBillsStr = infoUI.userMonthlyLivingExpense.getText();
        monthlyOtherExpenseStr = infoUI.userMonthlyOtherExpense.getText();
        monthlyLivingExpenseStr = infoUI.userMonthlyLivingExpense.getText();
        System.out.println(monthlyIncomeStr);
        //System.out.println(monthlyLivingExpenseStr);
        
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
            
    
