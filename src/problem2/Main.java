package problem2;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		for (int i=0; i<n-1;i++) {
			for (int j=0;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void NotesCountIMplementation(int notes[], int amount) {
		int[] noteCounter=new int[notes.length];
		
		
		
		try {
			for(int i=0;i<notes.length;i++) {
				if(amount>=notes[i]) {
					noteCounter[i]=amount/notes[i];
					amount=amount-noteCounter[i]*notes[i];
				}
			}
			if(amount>0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			}
			else {
				System.out.println("your payment in order to give min no of notes will be");
				for (int i=0;i<notes.length;i++) {
					if(noteCounter[i]!=0) {
						System.out.println(notes[i]+":"+noteCounter[i]);
					}
				}
			}
		}
		catch (ArithmeticException e) {
			System.out.println(e+" notes of denomination 0 is invalid");
		}
	}


	public static void main(String[] args) {
				System.out.println("enter the size of the currency denominations ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] notes=new int[size];
		System.out.println("enter the currency denominations value");
		for (int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();
		bubbleSort(notes);
		NotesCountIMplementation(notes, amount);
	}

}
