//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    void main() {
        int limit=197; //Limite de exibição dos numeros impares, nesse caso é 197
        System.out.println("Números ímpares entre 75 e 197 abaixo:");
        for (int i = 1; i<limit;i=i+2){
            if (i > 75) {           //Só exibe os numeros impares a partir de 75
                System.out.println(+i);
            }

        }
    }
}
