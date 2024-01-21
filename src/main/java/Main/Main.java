
package Main;
import java.util.Scanner;


public class Main {

    
    
    public static void main(String[] args) {
        

        
        
        BombaCombustivel exemplo = new BombaCombustivel(5.80f, 5.96f
                , 6.10f, 3.65f, 4.40f);
        

        
        Scanner leitor = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar == true){
            
        
        System.out.println("BEM VINDO AO POSTO AMAR!");
        System.out.println();
        System.out.println("Combustível da bomba 1: " + exemplo.categoria);
        System.out.println("Valor atual do combustível: R$" + exemplo.valorCombAtual);
        String formatQtdCombAtual = String.format("%.2f", exemplo.qtdCombAtual);
        System.out.println("Quantidade de combustível na bomba: " + formatQtdCombAtual + " litros");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Abastecer por valor");
        System.out.println("2 - Abastecer por litro");
        System.out.println("3 - Opção administrativa");
        System.out.println("4 - Encerrar programa");
        int resposta = leitor.nextInt();
        
        
        switch(resposta){
            case 1:
                exemplo.AbastecerPorValor();
                break;
            case 2:
                exemplo.AbastecerPorLitro();
                break;
            case 3:
                String login = "adm";
                int senha = 12345;
                
                System.out.println("Digite seu login: ");
                String loginResposta = leitor.next();
                System.out.println("Digite sua senha: ");
                int senhaResposta = leitor.nextInt();
                
                if(login.equals(loginResposta) && senhaResposta == senha){
                   
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Alterar Combustível da bomba");
                    System.out.println("2 - Alterar valor do Combustível atual");
                    System.out.println("3 - Alterar quantidade do combustível");
                    resposta = leitor.nextInt();
                    
                    switch(resposta){
                        case 1:
                            exemplo.AlterarCombustivel();
                            break;
                            
                        case 2:
                            exemplo.AlterarValorComb();
                            break;
                        case 3:
                            exemplo.Alterarqtdcomb();
                    }
                    
                }else{
                    System.out.println();
                    System.out.println("Login ou/e senha incorreto(s)");
                }
            case 4:
                continuar = false;
        
        
        }   
        }
    } 
}



///Problema atual: Fazer a interface funcional