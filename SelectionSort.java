public class SelectionSort {
	
	public void ordena(int[] v) {
		int[] vetor =v;
		for (int i = 0; i < vetor.length-1; i++) {
			int posMenor = i;
			for (int j = i+1; j < vetor.length; j++)
				if (vetor[j] < vetor[posMenor])
					posMenor = j;
			if (posMenor != i) {
				int temp = vetor[i];
				vetor[i] = vetor[posMenor];
				vetor[posMenor] = temp;
			}
		}
	}
	
}