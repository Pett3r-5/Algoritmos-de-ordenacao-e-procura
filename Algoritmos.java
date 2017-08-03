
public class Algoritmos {
	
	
	public int[] bubbleSort(int[] a2) {
		int cont = 0;
		int guarda = a2[0];
		
		
		do {
			cont = 0;
			for(int i = 0; i<a2.length-1; i++) {
			
			
			
				if(a2[i]>a2[i+1]) {
					guarda = a2[i];
					a2[i] = a2[i+1];
					a2[i+1] = guarda;
					cont++;
				}
			}
		}while(cont!=0);
		
		for(int i = 0; i<a2.length; i++) {
			System.out.println(a2[i]);
		}
		
		return a2;
	}
	
	
	public int[] doMaiorProMenor(int[] a1) {
		//sorting with two loops (omega(n²))
		
		
		int espaco = 0;
		int cont = 0;
		for(int i = 0; ; i++) {
			for(int j=0; j<a1.length; j++) {
				if(a1[i]>a1[j] && i>j) {
					cont++;
					espaco = a1[i];
					a1[i] = a1[j];
					a1[j] = espaco;
				}
			}
			if (i == a1.length-1 && cont !=0) {
				i = 0;
				cont = 0;
			}
			else if (i == a1.length-1 && cont == 0)
				break;
		}
		
		for(int i = 0; i<a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		return a1;
	}
	
	
	public int[] selectionSort(int[] a3) {
		//forma mais econômica de ordenação do que as duas anteriores
		
		
		int guarda3 = a3[0];
		int num = 0;
		int nada = 0;
		int count = 0;
		int contaTroca = 0;
		
		do {
			for(int i = 0; i<a3.length; i++) {
				if(a3[i]<guarda3) {
					guarda3 = a3[i];
					num = i;
					contaTroca++;
				}
				if(i == a3.length-1 && contaTroca==0)
					num = count;	
				
				if(i == a3.length-1) {
					nada = a3[num];
					a3[num] = a3[count];
					a3[count] = nada;
					count++;
					i = count;
					guarda3 = a3[count];
					contaTroca = 0;
				}
			}
		}while(count< a3.length-1);
		
		
		return a3;
	}
	
	
	public void binarySearch(int[] a, int teclado) {
		
		//forma de busca mais eficiente/econômica. precisa que o array esteja ordenado antes
		int[] a4 = this.selectionSort(a);
		
		int j;
		int tamanho = a4.length-1;
		int i = 0;
		
		
		
		while(true) {
			j =(i+tamanho)/2;
			
			if(a4[j] == teclado) {
				System.out.println("Número encontrado na posição: "+j);
				break;
			}
			else if(a4[j]>teclado)
				tamanho = j-1;
			else
				i = j+1;
			
			
			if(tamanho<i) {
				System.out.println("Número não encontrado");
				break;
			}					
		}
	}
}
