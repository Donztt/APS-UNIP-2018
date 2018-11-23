public class Bucket {

    public void ordena(int[] a) {
        int [] saida =  a;
        int [] bucket=new int[a.length];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0; // inicia o vetor atribuindo 0 a todos os campos
        }

        for (int i=0; i<saida.length; i++) {
            bucket[saida[i]]++; // indica a quantidade de valores iguais correspondentes aquele espaco do vetor
        }
        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
               saida[outPos++]=i; // escreve no array aos numeros de forma crescente
            }
        }
    }
}


