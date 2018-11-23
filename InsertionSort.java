public class InsertionSort{
	public void ordena(int vetor[]) {
		int[] v = vetor;
			
		for (int i = 1; i < v.length; i++) {
			int pos = i;
			int temp = v[i];
			while ((pos > 0) && (temp < v[pos-1])) {
				v[pos] = v[pos-1];
				pos--;
			}
			v[pos] = temp;
		}
	}
}