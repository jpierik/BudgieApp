
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
    
    public void getInputInfo(){
        infoUI.setVisible(true);
        //infoUI.getContentPane().setBackground(Color.white);
        monthlyIncomeStr = infoUI.userMonthlyIncome.getText();
        monthlyBillsStr = infoUI.getUserMonthlyBills().getText();
        monthlyOtherExpenseStr = infoUI.userMonthlyOtherExpense.getText();
        monthlyLivingExpenseStr = infoUI.userMonthlyLivingExpense.getText();
        
        System.out.println(monthlyBillsStr);
        
       if (infoUI.submitBool == true){
           System.out.println(monthlyBillsStr);
       }
        
            
        }
        
    
}
