import java.util.Scanner;

public class App {
//Nome Completo: Aline Almeida dos Santos;
//RA: 2920482121034
//Idade: 24
//gitHub: linnedev
//LinkedIn:https://www.linkedin.com/in/alinealmeida012/
//Curso e Turma: Análise e Desenvolvimento de Sistemas - 4º Semestre

    public static void funcao_teste (){
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        //variável local 
        String v2;
        int v1;

        System.out.println("Comando de Saida de Dados");
        
        System.out.printf("Informe uma palavra: ");
        v2 = ler.next();

        System.out.printf("Informe um número: ");
        v1 = ler.nextInt();

        System.out.printf(v2+" "+v1);
    }
    public static void main(String[] args) throws Exception {
        funcao_teste();


    }
}
