import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Lista Doblemente Enlazada");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer hacia adelante");
            System.out.println("4. Recorrer hacia atras");
            System.out.println("5. Mostrar tamaño de la lista");
            System.out.println("6. Mostrar si la lista esta vacia");
            System.out.println("7. Buscar elemento por valor");
            System.out.println("8. Buscar elemento por indice");
            System.out.println("9. Borrar un Elemento");
            System.out.println("0. Salir");
            System.out.print("Ingrese su elección: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar: ");
                    int data1 = scanner.nextInt();
                    list.insertAtBeginning(data1);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a insertar: ");
                    int data2 = scanner.nextInt();
                    list.insertAtEnd(data2);
                    break;
                case 3:
                    list.traverseForward();
                    break;
                case 4:
                    list.traverseBackward();
                    break;
                case 5:
                    System.out.println("Tamaño de la lista: " + list.size());
                    break;
                case 6:
                    System.out.println("La lista está vacía: " + list.isEmpty());
                    break;
                case 7:
                    System.out.print("Ingrese el elemento a buscar: ");
                    int searchData = scanner.nextInt();
                    int index = list.searchByValue(searchData);
                    if (index != -1) {
                        System.out.println("El elemento " + searchData + " se encuentra en el índice " + index);
                    } else {
                        System.out.println("El elemento no se encuentra en la lista.");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el índice a buscar: ");
                    int searchIndex = scanner.nextInt();
                    int dataAtIndex = list.searchByIndex(searchIndex);
                    if (dataAtIndex != -1) {
                        System.out.println("El elemento en el índice " + searchIndex + " es " + dataAtIndex);
                    } else {
                        System.out.println("No hay elemento en el índice especificado.");
                    }
                    break;
                case 9:
                    System.out.print("Ingrese el índice del elemento a borrar: ");
                    int deleteIndex = scanner.nextInt();
                    list.deleteAtIndex(deleteIndex);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (choice != 0);
    }
}
