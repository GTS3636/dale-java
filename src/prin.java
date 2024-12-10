import java.util.Scanner;

public class prin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        String res, nome;
        System.out.println("-Sistema de cálculo e classificação de IMC-\n");
        System.out.printf("Digite o nome do paciente: ");
        nome = sc.nextLine();
        System.out.printf("Digite o valor do peso: ");
        peso = sc.nextDouble();
        System.out.printf("Digite o valor da altura: ");
        altura = sc.nextDouble();
        imc = prog.calcularImc(peso, altura);
        res = prog.classificarImc(imc);
        System.out.printf("O paciente %s está classificado como: %.2f \n", nome, imc);
        System.out.println(res);
        sc.close();
    }
}
