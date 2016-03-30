package modelo;

public class BubbleSort implements IAlgoritmoOrdenamiento {

	

	public int[] burbuja(int[] array)
	{
		int lenD = array.length;
		boolean ordenado = false;
		for(int i=0;i<lenD && !ordenado;i++)
		{
			ordenado=true;
			for(int j = (lenD-1);j>=(i+1);j--)
			{
				if(array[j]<array[j-1]){
				ordenado=false;
				intercambiar(array,j,j-1);
				}
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
		return burbuja(array);
	}

	public String toString()
	{
		return("BubbleSort");
	}
	


}
