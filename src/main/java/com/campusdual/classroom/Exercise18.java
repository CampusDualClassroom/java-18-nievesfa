package com.campusdual.classroom;


public class Exercise18 {


	//reciba por parámetro un número entero //devuelva un array de tipo int.
	public static int [] createAndInitializeArray (int numeros) {
		int[] intArray = new int[numeros];
		for (int i = 0; i < numeros; i++) {
			intArray[i] = i + 1;
		}
		return intArray;
    }

	public static void showInlineArray(int [] intArray) {
		//int [] intArray = { 1, 2, 3, 4, 5,};

		for (int i = 0; i < intArray.length; i++) {
			// Solo añadimos un espacio entre los números, no después del último
			System.out.print(intArray[i]);

			// Añadimos un espacio solo si no es el último elemento del array
			if (i < intArray.length - 1) {
				System.out.print(" "); // Imprime un espacio solo entre los números
			}
		}
		System.out.println(); // Imprimimos una nueva línea al final
	}

	public static void main(String[] args) {
			int[] intArray = createAndInitializeArray(4);
			showInlineArray(intArray);
		}

}
