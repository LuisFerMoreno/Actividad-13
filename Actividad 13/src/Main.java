import java.util.*;

interface claseAnonima{
    public void metodoAnonimo();
}

interface expLambda{
    public void imprimir();
}

interface referencia {
    void impRef();
}

public class Main {
    public static void ref(){

        String[] lista = {"Hola","Hello","Ciao","Bienvenido","Hei","Bonjour","Bula","Dia dhuit","Tafola","Ola"};
        System.out.println("referenciar metodo: ");

        Arrays.sort(lista);
        System.out.println("Orden alfabético");
        System.out.println(Arrays.asList(lista));
        Arrays.sort(lista, Comparator.comparing(String::length));
        System.out.println("Orden por longitud");
        System.out.println(Arrays.toString(lista));
    }

    public static void main(String[] args) {

        String[] lista = {"Hola","Hello","Ciao","Bienvenido","Hei","Bonjour","Bula","Dia dhuit","Tafola","Ola"};

        claseAnonima anonimo = new claseAnonima() {
            @Override
            public void metodoAnonimo() {
                System.out.println("Metodo anonimo: ");

                Arrays.sort(lista);
                System.out.println("Orden alfabético");
                System.out.println(Arrays.asList(lista));
                Arrays.sort(lista, Comparator.comparing(String::length));
                System.out.println("Orden por longitud");
                System.out.println(Arrays.toString(lista));


            }
        };
        anonimo.metodoAnonimo();
        System.out.println("");


        expLambda lambda = () ->{

            System.out.println("Metodo lambda: ");

            Arrays.sort(lista);
            System.out.println("Orden alfabético");
            System.out.println(Arrays.asList(lista));
            Arrays.sort(lista, Comparator.comparing(String::length));
            System.out.println("Orden por longitud");
            System.out.println(Arrays.toString(lista));

        };

        lambda.imprimir();



        System.out.println("");
        referencia referencia = Main::ref;
        referencia.impRef();


    }

}