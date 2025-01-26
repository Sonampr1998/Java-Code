package com.practice;

public class DecimalToOctal {
public static void main(String [] args) {
	int decimal =81;
	int rem;
	String octalNumber="";
	//char octalChar[]= {'0','1','2','3','4','5','6','7'};
	char hexaChar[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	/*while(decimal>0) {
		rem=decimal%8;
		octalNumber=octalChar[rem]+octalNumber;
		decimal=decimal/8;
		
	}*/
	while(decimal>0) {
		rem=decimal%16;
		octalNumber=hexaChar[rem]+octalNumber;
		decimal=decimal/16;
	}
	System.out.println(octalNumber);
	System.out.println(Integer.toOctalString(81));
	//System.out.println(Integer.parseInt(octalNumber,8));
}

}
