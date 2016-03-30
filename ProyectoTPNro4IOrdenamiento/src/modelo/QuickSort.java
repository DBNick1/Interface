package modelo;
public class QuickSort implements IAlgoritmoOrdenamiento {

	public int[] quickSort(int[] arr, int comienzo, int fin)
	{
		if(fin - comienzo < 2) return arr;
		int p = comienzo + ((fin-comienzo)/2);
		p = particionar(arr,p,comienzo,fin);
		quickSort(arr,comienzo,p);
		quickSort(arr,p+1,fin);
		return arr;
	}
	
	private int particionar(int[] array, int p, int comienzo, int fin)
	{
		int c = comienzo;
		int f = fin - 2;
		int pivote = array[p];
		intercambiar(array,p,fin-1);
		
		while(c<f)
		{
			if(array[c] < pivote)
			{
				c++;
			}else if(array[f]>=pivote)
			{
				f--;
			}else
			{
				intercambiar(array,c,f);
			}
			
		}
		int indice = f;
		if(array[f] < pivote) indice++;
		intercambiar(array,fin-1,indice);
		return indice;
	}
	
	@Override
	public void intercambiar(int[] array, int indice1, int indice2) {
		int tmp = array[indice1];
		array[indice1]=array[indice2];
		array[indice2]=tmp;
	}
	
	public int[] ordenar(int[] array) {
		return quickSort(array,0,array.length);
	}
	
	public String toString()
	{
		return("QuickSort: ");
	}
	
}
