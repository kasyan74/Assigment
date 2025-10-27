/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment;

/**
 *
 * @author Ari Tech
 */
public class account {
        private int id;
    private double balance;
    private double Balance;
    
 public account(double balance,int id){
this.balance=balance;
this.id=id;
}public double getbalance(){
    return balance;
}public int getid(){
    return id;}
public void debit(double Debit){
         if(Debit>balance){
     
         System.out.println("Error");
               System.out.println("your balance is not enought to debit");  
     } 
     
     else {
       balance=getbalance()- Debit;}}
      public void deposit(double Deposit){
          if(Deposit<0){
              System.out.println("Error");
              System.out.println("please the number must be bigger than 0");
          }
          else{
          balance= getbalance()+ Deposit;
     }}
}

