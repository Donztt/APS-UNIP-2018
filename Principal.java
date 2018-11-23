
public class Principal {
	

	public static void main(String[]Args) {


// ----------------vetor random-------------//
	
	Vetor vetor = new Vetor();
	//tamanho vetor
	int maxVal1= 1000;
	int maxVal2 =10000;
	int maxVal3 =100000;
	//cria vetor
	int[] v = vetor.PreparaR(maxVal1);
	int[] v2 = vetor.PreparaR(maxVal2);
	int[] v3 = vetor.PreparaR(maxVal3);
//-----------------------vetor ordenado----------//
	//tamanho vetor
	//cria vetor
	int[] o1 = vetor.PreparaO(maxVal1);
	int[] o2 = vetor.PreparaO(maxVal2);	
	int[] o3 = vetor.PreparaO(maxVal3);
//----------------------vetor !ordenado-------------//
	//cria vetor
	int[] d1 = vetor.PreparaD(maxVal1);
	int[] d2 = vetor.PreparaD(maxVal2);
	int[] d3 = vetor.PreparaD(maxVal3);
///////////////////////////////////////////////////////


	//vetor de resultados

	double[][] x= new double[3][3] ;
	double[][] y= new double[3][3] ;
	double[][] z= new double[3][3];
	double[][] w= new double[3][3];

	

		for(int j=0; j<=2;j++){
			for (int i=0; i<=2;i++){
				x[i][j]  =0;
				y[i][j]  =0;
				z[i][j]  =0;
				w[i][j]  =0;

			}
		}
	//instanciando as variaveis 
	//do tempo
	double tempoInicio, tempoFim;
  
	// instanciação das classes
	Bucket buck = new Bucket();
	BubbleSort bub = new BubbleSort();	
	InsertionSort ins = new InsertionSort();
	SelectionSort sel = new SelectionSort();
	//
	//chamada dos métodos de ordenação
	//
	
	//	arrays x,y,z
	// 	|i
	// 	|####################################
	// j|t1v1 t1v2 t1v3 #t= tipo			#
	//	|t2v1 t2v2 t2v3	#					#
	//	|t3v1 t3v2 t3v3	#v = tamanho vetor	#
	//	|####################################
	//  n[i][j]

//--------- INSERTIONSORT-------//
	
//t1v1
	tempoInicio = System.currentTimeMillis();
	ins.ordena(v);	
	tempoFim = System.currentTimeMillis();
	x[0][0]=(tempoFim - tempoInicio)/1000;
//t1v2
	tempoInicio = System.currentTimeMillis();
	ins.ordena(v2);	
	tempoFim = System.currentTimeMillis();
	x[0][1]=(tempoFim - tempoInicio)/1000;
//t1v3
	tempoInicio = System.currentTimeMillis();
	ins.ordena(v3);	
	tempoFim = System.currentTimeMillis();
	x[0][2]=(tempoFim - tempoInicio)/1000;
//t2v1
	tempoInicio = System.currentTimeMillis();
	ins.ordena(o1);	
	tempoFim = System.currentTimeMillis();
	x[1][0]=(tempoFim - tempoInicio)/1000;
//t2v2
	tempoInicio = System.currentTimeMillis();
	ins.ordena(o2);	
	tempoFim = System.currentTimeMillis();
	x[1][1]=(tempoFim - tempoInicio)/1000;
//t2v3
	tempoInicio = System.currentTimeMillis();
	ins.ordena(o3);	
	tempoFim = System.currentTimeMillis();
	x[1][2]=(tempoFim - tempoInicio)/1000;
//t3v1
	tempoInicio = System.currentTimeMillis();
	ins.ordena(d1);	
	tempoFim = System.currentTimeMillis();
	x[2][0]=(tempoFim - tempoInicio)/1000;
//t3v2
	tempoInicio = System.currentTimeMillis();
	ins.ordena(d2);	
	tempoFim = System.currentTimeMillis();
	x[2][1]=(tempoFim - tempoInicio)/1000;
//t3v3
	tempoInicio = System.currentTimeMillis();
	ins.ordena(d3);	
	tempoFim = System.currentTimeMillis();
	x[2][2]=(tempoFim - tempoInicio)/1000;

	
	



	//-------------BUCKETSORT------------//
//t1v1
	tempoInicio = System.currentTimeMillis();
	buck.ordena(v);	
	tempoFim = System.currentTimeMillis();
	y[0][0]=(tempoFim - tempoInicio)/1000;
//t1v2
	tempoInicio = System.currentTimeMillis();
	buck.ordena(v2);	
	tempoFim = System.currentTimeMillis();
	y[0][1]=(tempoFim - tempoInicio)/1000;
//t1v3
	tempoInicio = System.currentTimeMillis();
	buck.ordena(v3);	
	tempoFim = System.currentTimeMillis();
	y[0][2]=(tempoFim - tempoInicio)/1000;
//t2v1
	tempoInicio = System.currentTimeMillis();
	buck.ordena(o1);	
	tempoFim = System.currentTimeMillis();
	y[1][0]=(tempoFim - tempoInicio)/1000;
//t2v2
	tempoInicio = System.currentTimeMillis();
	buck.ordena(o2);	
	tempoFim = System.currentTimeMillis();
	y[1][1]=(tempoFim - tempoInicio)/1000;
//t2v3
	tempoInicio = System.currentTimeMillis();
	buck.ordena(o3);	
	tempoFim = System.currentTimeMillis();
	y[1][2]=(tempoFim - tempoInicio)/1000;
//t3v1
	tempoInicio = System.currentTimeMillis();
	buck.ordena(d1);	
	tempoFim = System.currentTimeMillis();
	y[2][0]=(tempoFim - tempoInicio)/1000;
//t3v2
	tempoInicio = System.currentTimeMillis();
	buck.ordena(d2);	
	tempoFim = System.currentTimeMillis();
	y[2][1]=(tempoFim - tempoInicio)/1000;
//t3v3
	tempoInicio = System.currentTimeMillis();
	buck.ordena(d3);	
	tempoFim = System.currentTimeMillis();
	y[2][2]=(tempoFim - tempoInicio)/1000;



	//-------------BUBBLESORT------------//
//t1v1
	tempoInicio = System.currentTimeMillis();
	bub.ordena(v);	
	tempoFim = System.currentTimeMillis();
	z[0][0]=(tempoFim - tempoInicio)/1000;
//t1v2
	tempoInicio = System.currentTimeMillis();
	bub.ordena(v2);	
	tempoFim = System.currentTimeMillis();
	z[0][1]=(tempoFim - tempoInicio)/1000;
//t1v3
	tempoInicio = System.currentTimeMillis();
	bub.ordena(v3);	
	tempoFim = System.currentTimeMillis();
	z[0][2]=(tempoFim - tempoInicio)/1000;
//t2v1
	tempoInicio = System.currentTimeMillis();
	bub.ordena(o1);	
	tempoFim = System.currentTimeMillis();
	z[1][0]=(tempoFim - tempoInicio)/1000;
//t2v2
	tempoInicio = System.currentTimeMillis();
	bub.ordena(o2);	
	tempoFim = System.currentTimeMillis();
	z[1][1]=(tempoFim - tempoInicio)/1000;
//t2v3
	tempoInicio = System.currentTimeMillis();
	bub.ordena(o3);	
	tempoFim = System.currentTimeMillis();
	z[1][2]=(tempoFim - tempoInicio)/1000;
//t3v1
	tempoInicio = System.currentTimeMillis();
	bub.ordena(d1);	
	tempoFim = System.currentTimeMillis();
	z[2][0]=(tempoFim - tempoInicio)/1000;
//t3v2
	tempoInicio = System.currentTimeMillis();
	bub.ordena(d2);	
	tempoFim = System.currentTimeMillis();
	z[2][1]=(tempoFim - tempoInicio)/1000;
//t3v3
	tempoInicio = System.currentTimeMillis();
	bub.ordena(d3);	
	tempoFim = System.currentTimeMillis();
	z[2][2]=(tempoFim - tempoInicio)/1000;




//-------------selectionSort------------//
//t1v1
	tempoInicio = System.currentTimeMillis();
	sel.ordena(v);	
	tempoFim = System.currentTimeMillis();
	w[0][0]=(tempoFim - tempoInicio)/1000;
//t1v2
	tempoInicio = System.currentTimeMillis();
	sel.ordena(v2);	
	tempoFim = System.currentTimeMillis();
	w[0][1]=(tempoFim - tempoInicio)/1000;
//t1v3
	tempoInicio = System.currentTimeMillis();
	sel.ordena(v3);	
	tempoFim = System.currentTimeMillis();
	w[0][2]=(tempoFim - tempoInicio)/1000;
//t2v1
	tempoInicio = System.currentTimeMillis();
	sel.ordena(o1);	
	tempoFim = System.currentTimeMillis();
	w[1][0]=(tempoFim - tempoInicio)/1000;
//t2v2
	tempoInicio = System.currentTimeMillis();
	sel.ordena(o2);	
	tempoFim = System.currentTimeMillis();
	w[1][1]=(tempoFim - tempoInicio)/1000;
//t2v3
	tempoInicio = System.currentTimeMillis();
	sel.ordena(o3);	
	tempoFim = System.currentTimeMillis();
	w[1][2]=(tempoFim - tempoInicio)/1000;
//t3v1
	tempoInicio = System.currentTimeMillis();
	sel.ordena(d1);	
	tempoFim = System.currentTimeMillis();
	w[2][0]=(tempoFim - tempoInicio)/1000;
//t3v2
	tempoInicio = System.currentTimeMillis();
	sel.ordena(d2);	
	tempoFim = System.currentTimeMillis();
	w[2][1]=(tempoFim - tempoInicio)/1000;
//t3v3
	tempoInicio = System.currentTimeMillis();
	sel.ordena(d3);	
	tempoFim = System.currentTimeMillis();
	w[2][2]=(tempoFim - tempoInicio)/1000;

//-------------RESULTADOS------------//

	Janela nova = new Janela(x,y,z,w);
	nova.main();
	}
}

