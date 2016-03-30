package vista;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import modelo.BubbleSort;
import modelo.InsertionSort;
import modelo.QuickSort;
import modelo.SelectionSort;


public class TestOrdenamiento {
	
	public static void main(String[] args) {
		
		int ordenMagMax=1;
		List<int[]> arrays=new ArrayList<int[]>();
		for(int k=1;k<=ordenMagMax;k++){
			arrays.add(generarArray(0,(int)Math.pow(10,(k+1)),(int)Math.pow(10,k)));
			} 
		
		System.out.println("Arrays creados");
		BubbleSort bs = new BubbleSort();
		InsertionSort is = new InsertionSort();
		QuickSort qs = new QuickSort();
		SelectionSort ss = new SelectionSort();
		
		for(int[] array: arrays){
			mostrarArray("Array original: ", array);
			mostrarArray("BubbleSort: ",bs.ordenar(array));
			mostrarArray("InsertionSort: ",is.ordenar(array));
			mostrarArray("QuickSort: ",qs.ordenar(array));
			mostrarArray("SelectionSort: ",ss.ordenar(array));
		}
		
	}
		
		public static int[] generarArray(int inicio, int fin,int cantidad){
			int[] array=crearSecuencia(inicio,fin,cantidad);
			mezclarArray(array);
			return array;
			}
		
		
		private static void mezclarArray(int[] array)
		{
			int indice, temp;
			Random random = new Random();
			for (int i = array.length - 1; i > 0; i--)
			{
				indice = random.nextInt(i + 1);
				temp = array[indice];
				array[indice] = array[i];
				array[i] = temp;
				}
			}
				
		public static int[] crearSecuencia(int inicio, int fin, int cantidad)
		{
			int[] array = new int[cantidad];
			int salto=(fin-inicio)/cantidad;
			for (int i=0; inicio < fin; i++){
				array[i] = inicio+=salto;
				}
			return array;
			}
				
		public static void mostrarArray(String mensaje, int[] array){
				
			System.out.println(mensaje+Arrays.toString(array));
				
		}
			
		
}
				

