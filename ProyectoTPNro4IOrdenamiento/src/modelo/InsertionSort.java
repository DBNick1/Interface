package modelo;

public class InsertionSort implements IAlgoritmoOrdenamiento{
	
	
	public int[] insercion(int[] array)
	{
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
		
		return array;
	}
	
	public int[] ordenar(int[] array) {
		return insercion(array);
	}
	
	@Override
	public void intercambiar(int[] array, int indice1, int indice2) {
		int tmp = array[indice1];
		array[indice1]=array[indice2];
		array[indice2]=tmp;
	}
	
	public String toString()
	{
		return("Insertion Sort: ");
	}
}

