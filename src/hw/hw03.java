package hw;
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();        
        String data[] = str.split(" ");
        for(int i=0;i<data.length; i++){
        	
        	
        	data[i]=data[i].toLowerCase();
        }
        int j=0;
        System.out.print(data[0] + " ");
        for (int i =1;i<data.length;i++) {
        	for (j = i-1;j>=0;j--) {
        		if (data[j].equals(data[i]))
        			break;
        		}
                if (j == -1) {
                    System.out.print(data[i]+" ");
                }
            }
            System.out.println();
        }	

	}


