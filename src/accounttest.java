/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment;

/**
 *
 * @author Ari Tech
 */
public class accounttest {
    public static void main(String[] args) {
        account input=new account(5000,1);
        input.debit(3000);
        System.out.println("id:"+input.getid());
        System.out.println("your balance now:"+input.getbalance());
        account input2=new account(8250,2);
            input2.deposit(3000);
            System.out.println("id:"+input2.getid());
            System.out.println("your balance now"+input2.getbalance());
        }
        
    }

