public class prog {
    public static double calcularImc(double peso, double altura){
        double imc = 0.0;
        imc =  peso / (Math.pow(altura, 2));
        return imc;
    }
    public static String classificarImc(double imc){
        if((imc>0)&&(imc<18.5)){
            return "Abaixo do peso";
        } else if ((imc>=18.5)&&(imc<25.0)) {
            return "Peso normal";
        } else if ((imc>=25.0)&&(imc<30.0)) {
            return "Sobrepeso";
        } else if ((imc>=30.0)&&(imc<35.0)) {
            return "Obesidade grau I";
        } else if ((imc>=35.0)&&(imc<40.0)) {
            return "Obesidade grau II";
        } else if (imc>=40.0) {
            return "Obesidade grau III";
        } else {
            return "Não foi possível classificar";
        }
    }
}
