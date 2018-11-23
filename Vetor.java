import java.util.Random;

public class Vetor{


    public static void main(){    }


	//criação do array Random
    public static int[] PreparaR(int maxVal){
		//o vetor tem como maio numero o seu tamanho
		//para facilitar o funcionamento do BucketSort
	
	int v[]= new int[maxVal];
	Random rnd = new Random(); 
		
	for(int i =0;i<maxVal;++i) {
		v[i]=rnd.nextInt(maxVal);	
		}

	return (v);
	}

	//criação do array ordenado
	public static int[] PreparaO(int maxVal){

	int o[]= new int[maxVal];

	for(int i =0;i<maxVal;++i) {
		o[i]=i;	
		}

	return (o);
	}

	//criação do array !ordenado
	public static int[] PreparaD(int maxVal){

	int d[]= new int[maxVal];
	int j=0;
	for(int i = maxVal-1 ;i>= 0;--i, j++) {
		d[j]=i;	
		}
	j=0;
	return (d);
	}


}