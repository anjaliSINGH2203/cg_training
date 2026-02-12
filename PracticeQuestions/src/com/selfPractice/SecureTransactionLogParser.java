package com.selfPractice;

import java.util.Scanner;

//TXNID-4821|USER:anjali|AMT:2500|STATUS:SUCCESS

public class SecureTransactionLogParser {
	public void idValidator(String id) {
		if( id!=null&&id.startsWith("TXNID-")) {
			String idpart= id.substring(6);
			if(idpart.matches("\\d{4}")) {
				System.out.println("Transaction Id : " + id);
                return;
			}
			
		}
		 System.out.println("Invalid Transaction Log");
		
	}
	public void usernameValidator(String username) {
		if(username!= null && username.startsWith("USER:")){
			String namepart= username.substring(5);
			if (namepart.matches("[a-z]{5,}")) {
                System.out.println("User : " + namepart);
                return;
            }
        }
        System.out.println("Invalid Transaction Log");
		}
	
	public void amountValidator(String amtPart) {
		 if (amtPart != null && amtPart.startsWith("AMT:")) {
	            String amount = amtPart.substring(4); // after "AMT:"
	            // \d+ because amount can be multiple digits
	            if (amount.matches("\\d+")) {
	                int val = Integer.parseInt(amount);
	                if (val > 0) {
	                    System.out.println("Amount : " + val);
	                    return;
	                }
	            }
	        }
	        System.out.println("Invalid Transaction Log");
	}
	public void statusValidator(String statusPart) {
        // statusPart will be like "STATUS:SUCCESS"
        if (statusPart != null && statusPart.startsWith("STATUS:")) {
            String status = statusPart.substring(7).toUpperCase(); // after "STATUS:"
            if (status.equals("SUCCESS") || status.equals("FAILED")) {
                System.out.println("Status : " + status);
                return;
            }
        }
        System.out.println("Invalid Transaction Log");
    }
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine().trim();
		String data[]= input.split("\\|");
		if(data.length!=4) {
			System.out.println("Invalid transaction log");
			sc.close();
			return;
		}
		
		SecureTransactionLogParser ob = new SecureTransactionLogParser();
		ob.idValidator(data[0]);
		ob.usernameValidator(data[1]);
		ob.amountValidator(data[2]);
		ob.statusValidator(data[3]);
		
	}

}
