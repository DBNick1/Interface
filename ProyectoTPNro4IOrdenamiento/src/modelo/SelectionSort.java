package modelo;

public class SelectionSort implements IAlgoritmoOrdenamiento{
	
	public int[] seleccion(int[] array)
	{
		int lenD = array.length-1;

		for(int i=0;i<lenD;i++)
		{
			int min = i;
			for(int j = i+1;j<lenD+1;j++)
			{
				if(array[j]<array[min]){
				min = j;
				}
			}
			
			if(i!=min)
			{
				intercambiar(array,i,min);
			}
		}
		
		return array;
	}
	
	@Override
	public void intercambiar(int[] array, int indice1, int indice2) {
		int tmp = array[indice1];
		array[indice1]=array[indice2];
		array[indice2]=tmp;
	}
	
	public int[] ordenar(int[] array) {
		
		return seleccion(array);
		
	}
	
	public String toString()
	{
		return("SelectionSort: ");
	}
	
}
