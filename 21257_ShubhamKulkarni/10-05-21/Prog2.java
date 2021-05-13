package com.ojas.arrayprograms;

public class Prog2 {
	
	
	public static void main(String[] args) {
		
		int [] arr = {25, 11, 7, 75, 85, 1000, 50, 77, 12, 18};  
					        
					        int max = arr[0];  
					   
					        for (int i = 0; i < arr.length; i++) {  
					            
					           if(arr[i] < max)  
					               max = arr[i];
					        
					        }  
					        System.out.println("smallest element present in given array: " + max);  
					    }  


				}

