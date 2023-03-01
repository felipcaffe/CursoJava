public class Main {
    public static void main(String[] args) {

        int ingresos = 670400;
        int vehiculos = 3;
        int antiguedad = 2;
        int inmuebles = 4;
        boolean lujo = true;

        if((ingresos < 489083) && (vehiculos < 3) && (antiguedad >= 5) && (inmuebles < 3) && (lujo == false)){
            System.out.println("No se le otorga ningun subsidio");
        }
        else{
            System.out.println("Consultar por Subsidios");
        }
    }
}