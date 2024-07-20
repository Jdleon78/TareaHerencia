/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuderia;
public class Main{ 
public static void main (String[]args){
     EquipoTecnico equipoTecnico = new EquipoTecnico();
     System.out.println(equipoTecnico.registrarCarrera("Gran Premio de Japon"));
        System.out.println("Puntos totales: " + equipoTecnico.calcularPuntos());
        System.out.println(equipoTecnico.añadirMiembro("YUKI TSUNODA"));
        System.out.println(equipoTecnico.quitarMiembro("TOTO WOLFF"));
        System.out.println(equipoTecnico.prepararCoche());
        System.out.println(equipoTecnico.planificarEstrategia());
        System.out.println(equipoTecnico.realizarpitStop());
        System.out.println(equipoTecnico.consultarEstadoCoche());
        System.out.println(equipoTecnico.actualizarTecnologia());
        System.out.println(equipoTecnico.organizarEntrenamiento());
        equipoTecnico.diseñarAerodinamica();
        equipoTecnico.optimizarMotor();
}
}