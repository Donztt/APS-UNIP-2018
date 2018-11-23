public class BubbleSort {
	public void ordena(int v[]) { 
	
	int vetor[]=v;
	int slotbub=0;
	boolean controle;
		
		for(int i =0;i<vetor.length;++i) {
			controle=true;
			for(int j = 0;j<(vetor.length-1);++j) {
				
				if(vetor[j]>vetor[j+1]) {
				
					slotbub = vetor[j];
					vetor[j]=vetor[j+1];
					vetor[j+1]=slotbub;
					controle = false;
					}
				}
			if(controle=true) {
				break;
				}
			
			}   	
		}
	}

 



