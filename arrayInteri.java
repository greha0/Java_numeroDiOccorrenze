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

    static public void main(String [] args){
        int [] array = {1,2,3,3,4,4};

        System.out.println(contaOccorrenze(3, array));
    }
}
