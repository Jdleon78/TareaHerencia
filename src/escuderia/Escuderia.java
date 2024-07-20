package escuderia;
public class Escuderia {
    
     public String registrarCarrera (String nombreCarrera) {
        return "Carrera registrada: " + nombreCarrera;   
      }
     
     public int calcularPuntos () {
       int puntosTotales = 120; 
       return puntosTotales; 
      }
     
     public String añadirMiembro (String nombre) {
         return "Miembro anadido: " + nombre;
       }
     
     public String quitarMiembro (String nombre) {
         return "Miembro quitado: " + nombre;
       }
     
     public String  prepararCoche () {
         return "Coche preparado para la carrera.";
       }
     
     public String  planificarEstrategia() {
         return "Estrategia de carrera planificada.";
       }
     
     public String  realizarpitStop() {
         return "Pit stop realizado.";
       }
     
     public String  consultarEstadoCoche() {
         return "Estado del coche: optimo.";        
       }
     
    public String actualizarTecnologia() {
        return "Tecnologia del coche actualizada.";
       }
    
    public String organizarEntrenamiento() {
        return "Sesion de entrenamiento organizada.";
       }

}
