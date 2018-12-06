package com.java.Student.array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		StudentDemo stud=new StudentDemo();
		//
		//System.out.println(stud);
		
		int No =0;
		StudentDemo [][]ArrayOfStud=new StudentDemo[2][3];
		/////hiiiiiiiiiiii
		//hellooo
				int i;
				int k;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter no of Student");
				
				
				String[]str=new String[] {"Name","StudID","Marks"};
				System.out.println(Arrays.toString(str));
				String[][]str2=new String[3][3];
				
				for(i=0;i<ArrayOfStud.length;i++) {
					for(k=0;k<ArrayOfStud[i].length;k++) {
						String Name=sc.nextLine();
						int id=sc.nextInt();
						int marks=sc.nextInt();
						String result=sc.nextLine();
						str2[i][k]=Name;
						if(marks<=35) {
							System.out.println("FAIL");
							}else
								System.out.println("PASS");
					}
				}
				//System.out.println("Name="+Name);
				//System.out.println("id="+id);
				
				//System.out.println("marks="+marks);
				//System.out.println("result="+result);
				
				
				
				//System.out.println("");
				/*for(int j=0;j<1;j++) {
					//j=j+1;
					
					
					System.out.println(ArrayOfStud[k][j]+"");
					
					exit();
					
				
			//No++;
			
			//System.out.println("no");
			
		}*/
		
				
		
	}



	private static void exit() {
		// TODO Auto-generated method stub
		
	}
}