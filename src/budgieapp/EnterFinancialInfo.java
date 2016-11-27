
package budgieapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import my.budgieui.FinancialInfoUI;

public class EnterFinancialInfo extends FinancialInfoUI{
    

    FinancialInfoUI infoUI = new FinancialInfoUI();
    //FinancialInfoGUI ui = new FinancialInfoGUI();
    
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
    
    String yearlyIncomeStr;
    String totalMonthlyExpenseStr;
    String totalYearlyExpenseStr;
   
    public void getInputInfo(){ 
        while(flag == false){
            System.out.println(infoUI.submitBool);
            if (infoUI.isVisible() && infoUI.submitBool == true){
                
            //convert strings to numbers   
            monthlyBillsStr = infoUI.textBills;
            income = Float.valueOf(infoUI.textIncome);
            bills = Float.valueOf(infoUI.textBills);
            otherExpense = Float.valueOf(infoUI.textOtherExpense);
            livingExpense = Float.valueOf(infoUI.textLivingExpense);
            
            //simple calulations for financial info
            yearlyIncome = income * 12;
            totalMonthlyExpense = bills + otherExpense + livingExpense;
            totalYearlyExpense = totalMonthlyExpense * 12;
            
            yearlyIncomeStr = Float.toString(yearlyIncome);
            totalMonthlyExpenseStr = Float.toString(totalMonthlyExpense);
            totalYearlyExpenseStr = Float.toString(totalYearlyExpense);
            
            System.out.println(yearlyIncome + " " + totalMonthlyExpense + " " + totalYearlyExpense);
            infoUI.submitBool = false;
            flag = true;
            }
        }
        //infoUI.jLabel1.setText("Hello");
        //infoUI.getContentPane().setBackground(Color.white);
        //monthlyIncomeStr = infoUI.userMonthlyIncome.getText();
       //// monthlyBillsStr = infoUI.userMonthlyLivingExpense.getText();
       /// monthlyOtherExpenseStr = infoUI.userMonthlyOtherExpense.getText();
       // monthlyLivingExpenseStr = infoUI.userMonthlyLivingExpense.getText();
        
        //simple calculations for annual financial facts
        //yearlyIncome = income * 12;
        //totalMonthlyExpense = bills + otherExpense + livingExpense;
        //totalYearlyExpense = totalMonthlyExpense * 12;
    }

    public String getMonthlyBillsStr() {
        return monthlyBillsStr;
    }

    public void setMonthlyBillsStr(String monthlyBillsStr) {
        this.monthlyBillsStr = monthlyBillsStr;
    }
    
}
     
            
    
