
public class Main {

	public static void main(String[] args) {
		
		Algoritmos al1 = new Algoritmos();
		
		int[] array1 = {2,3,6,1,10,3,7,9,4,5};
		System.out.println("Bubble sort:");
		al1.bubbleSort(array1);
		System.out.println();
		
		
		
		int[] array2 = {2,3,6,1,10,3,7,9,4,5};
		System.out.println("Ordenação utilizando dois loops:");
		al1.doMaiorProMenor(array2);
		System.out.println();
		
		

		
		int[] array4 = {2,3,6,1,10,3,7,9,4,5};
		System.out.println("Binary search:");
		al1.binarySearch(array4,7);
		
	}

}
