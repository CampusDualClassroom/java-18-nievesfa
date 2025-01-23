package com.campusdual.classroom;


public class Exercise18 {


	public static void main(String[] args) {
		//int[] intArray = createAndInitializeArray(4);
		showInlineArray(createAndInitializeArray(4)); //refactorizado
	}


	//reciba por parámetro un número entero //devuelva un array de tipo int.
	public static int [] createAndInitializeArray (int size) {
		int[] intArray = new int[size];
		for (int i = 0; i < size; i++) {
			intArray[i] = i + 1; // rellenar el array
		}
		return intArray;
    }

	public static void showInlineArray(int [] intArray) {


		for (int i = 0; i < intArray.length; i++) {
			// Solo añadimos un espacio entre los números, no después del último
			System.out.print(intArray[i]);

			// Añadimos un espacio solo si no es el último elemento del array
			if (i < intArray.length - 1) {
				System.out.print(" "); // Imprime un espacio solo entre los números
			}
		}

	}



}
