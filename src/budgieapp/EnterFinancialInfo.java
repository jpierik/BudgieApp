
package budgieapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterFinancialInfo extends FinancialInfoUI{
    

    FinancialInfoUI infoUI = new FinancialInfoUI();
    

    private ActionListener listener;
    private ActionEvent event;
    
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
        //while (infoUI.isVisible() == true){
        monthlyIncomeStr = infoUI.getUserMonthlyIncome().getText();
        monthlyBillsStr = infoUI.getUserMonthlyBills().getText();
        monthlyOtherExpenseStr = infoUI.getUserMonthlyOtherExpense().getText();
        monthlyLivingExpenseStr = infoUI.getUserMonthlyLivingExpense().getText();
        System.out.println(monthlyIncomeStr);
        System.out.println(monthlyLivingExpenseStr);
        
        //convert the strings to number 
        income = Float.valueOf(monthlyIncomeStr);
        bills = Float.valueOf(monthlyBillsStr);
        otherExpense = Float.valueOf(monthlyOtherExpenseStr);
        livingExpense = Float.valueOf(monthlyLivingExpenseStr);
        
        //simple calculations for annual financial facts
        yearlyIncome = income * 12;
        totalMonthlyExpense = bills + otherExpense + livingExpense;
        totalYearlyExpense = totalMonthlyExpense * 12;
        
        }
           
            
        }

        
    
