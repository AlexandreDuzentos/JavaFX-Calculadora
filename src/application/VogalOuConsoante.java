package application;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char letra=sc.next().charAt(0);
    
	if(letra == 'a' || letra =='e' || letra=='i' || letra=='o' || letra=='u' || letra == 'A' || letra =='E' || letra=='I' || letra=='O' || letra=='U') {
		System.out.println("A letra é "+letra+" é uma vogal");
	}
	else {
		System.out.println("A letra é uma consoante");
	}
	sc.close();
	}
	

}
