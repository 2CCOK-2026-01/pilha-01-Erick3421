package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        Pilha<Character> pilha = new Pilha<Character>(input.length());
        for (int i = 0; i < input.length(); i++) {
            pilha.push(input.charAt(i));
        }
        String resultado = "";
        while (!pilha.isEmpty()) {
            resultado += pilha.pop();
        }
        return resultado;
    }
}
