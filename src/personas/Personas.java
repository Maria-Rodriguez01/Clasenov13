/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Maria Gabriela
 */
public class Personas {

    public static void ordenar() {
        for (int x = 0; x < 6; x++) {
            for (int y = 1; y < 6; y++) {
                if (Personas[y - 1].getEdad() > Personas[y].getEdad()) {
                    temp = Personas[y];
                    Personas[y] = Personas[y - 1];
                    Personas[y - 1] = temp;
                }
            }

        }

    }

    public static void presentar() {
        for (int i = 0; i < 6; i++) {
            System.out.println("El nombre de la persona es " + Personas[i].getNombre());
            System.out.println("La edad de la persona es " + Personas[i].getEdad());

        }
    }

    public static nombre Personas[] = new nombre[6];
    public static nombre temp = new nombre();
    public static void main(String[] args) {

        Personas[0] = new nombre();
        Personas[0].setNombre("Jeny");
        Personas[0].setEdad(48);

        Personas[1] = new nombre();
        Personas[1].setNombre("Victor");
        Personas[1].setEdad(50);
        
        Personas[2] = new nombre();
        Personas[2].setNombre("Manuel");
        Personas[2].setEdad(23);
        
        Personas[3] = new nombre();
        Personas[3].setNombre("Ana Lucia");
        Personas[3].setEdad(19);
        
        Personas[4] = new nombre();
        Personas[4].setNombre("Maria");
        Personas[4].setEdad(17);
        
        Personas[5] = new nombre();
        Personas[5].setNombre("Olga");
        Personas[5].setEdad(49);

        System.out.println("====================Sin ordenar===============================");
        presentar();
        System.out.println("");
        ordenar();

        
        System.out.println("====================Ordenando de menor a mayor====================");
        presentar();
        System.out.println("Gracias por usar el programa!");
    }
}
