
public class Main {

    public static void main(String[] args) {
        System.out.println(generaPassword());
    }

    static String generaPassword() {
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas).append(minusculas).append(numeros);
        
        StringBuilder randomPassword = new StringBuilder("");
        
        for(int i = 0; i<= 15; i++){
            int cantidadCaracteres = caracteres.length();
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            randomPassword.append(caracteres.charAt(numeroRandom));
        } 
        return randomPassword.toString();
    }

}
