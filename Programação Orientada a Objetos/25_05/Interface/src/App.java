public class App {
    public static void main(String[] args) throws Exception {
        Horario h = new Horario();
        h.setHora(22);
        h.setMinuto(8);
        h.setSegundo(50);
        
        System.out.println("Hora: " + h.convert());
    }
}