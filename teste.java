public class CadeiaCaracteres {

    public static void main(String args[]){
        String nome = "Carlinha", sobrenome = "Christina";
        String nomeCompleto = nome + sobrenome;
        System.out.println("Nome completo: "+ nomeCompleto);
        System.out.println("Tamanho String: "+ nomeCompleto.length());
        System.out.println("Igual a Carla Christina: "+ nomeCompleto.equals("Carla Christina"));
        System.out.println("Igual a CARLA CHRISTINA: " + nomeCompleto.equalsIgnoreCase("CARLA CHRISTINA"));
    }
}
