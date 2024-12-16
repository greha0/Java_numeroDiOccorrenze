/**
 * Rappresenta un array di numeri interi
 */
public class arrayInteri {
    private int [] array;

    /**
     * Costruisce un array di numeri interi data la sua dimensione
     * @param dim Dimensione dell'array
     */
    public arrayInteri(int dim){
        array = new int[dim];
    }

    /**
     * Costruisce un array di numeri interi dato un array
     * @param dim Dimensione dell'array
     * @param array Array
     */
    public arrayInteri (int [] array){
        //this.array = new int[dim];
        this.array = array;
    }

    public int [] getArray(){
        return array;
    }

    /**
     * Conta le occorrenze di un numero n dato
     * @param n Numero intero
     * @return Numero di occorrenze del numero dato
     */
    static public int contaOccorrenze(int n, int [] array){
        int numOcc = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                numOcc++;
            }
        }
        return numOcc;
    }

    static public int [] unioneArray(int [] array1, int [] array2){
        int [] arrayUnito = new int[array1.length + array2.length];
        int cont=array1.length;

        for(int i=0; i< array1.length; i++){
            arrayUnito[i] = array1[i];
        }
        for(int i = 0; i<array2.length; i++){
            arrayUnito[cont] = array2[i];
            cont++;
        }
        return arrayUnito;
    }

    static public void main(String [] args){
        int [] array = {1,2,3,3,4,4};
        int [] array1 = {123,44,6};
        int [] unione = unioneArray(array, array1);

        System.out.println("Occorrenze numero 3: "+contaOccorrenze(3, array));

        System.out.println("Array unito: ");
        for(int i=0; i<unione.length; i++){
            System.out.println(unione[i]);
        }
    }
}
