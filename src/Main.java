import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número de CEP para consulta: ");
        var cep = leitura.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Adress novoEndereco = consultaCep.bucaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.geradorDeArquivo(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("finalizando a aplicação");
        }
    }
}
