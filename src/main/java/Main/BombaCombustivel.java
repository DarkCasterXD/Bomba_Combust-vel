
package Main;
import java.util.Scanner;



public class BombaCombustivel {
                     // 0      1      2      3      4
    String[] categorias = {"Gasolina Comum", "Gasolina Aditivada", "Diesel",
    "Etanol", "GNV"};
    float[] qtdCombust = {380.0f, 296.0f, 246.0f, 322.0f, 678.0f};
    public float[] precos = {5.80f, 5.96f, 6.10f, 3.65f, 4.40f};
    
    float gComum, gAditivada, diesel, etanol, gnv;
    public float valorCombAtual = precos[0];
    public float qtdCombAtual = qtdCombust[0];
    public String categoria = categorias[0];
    
     Scanner leitor = new Scanner(System.in);

    public float[] getPrecos() {
        return precos;
    }

    public void setPrecos(float[] precos) {
        this.precos = precos;
    }
    
     
     
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public float getQtdCombAtual() {
        return qtdCombAtual;
    }

    public void setQtdCombAtual(float qtdCombAtual) {
        this.qtdCombAtual = qtdCombAtual;
    }
    
    public BombaCombustivel(float gComum, float gAditivada, float diesel, float etanol, float gnv) {
        this.gComum = gComum;
        this.gAditivada = gAditivada;
        this.diesel = diesel;
        this.etanol = etanol;
        this.gnv = gnv;
        
    }

    public float getValorCombAtual() {
        return valorCombAtual;
    }

    public void setValorCombAtual(float valorCombAtual) {
        this.valorCombAtual = valorCombAtual;
    }

    public void Menu(){
        System.out.println("1 - " + categorias[0]);
        System.out.println("2 - " + categorias[1]);
        System.out.println("3 - " + categorias[2]);
        System.out.println("4 - " + categorias[3]);
        System.out.println("5 - " + categorias[4]);
        
    }
    
    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    public float[] getQtdCombust() {
        return qtdCombust;
    }

    public void setQtdCombust(float[] qtdCombust) {
        this.qtdCombust = qtdCombust;
    }

    public float getgComum() {
        return gComum;
    }

    public void setgComum(float gComum) {
        this.gComum = gComum;
    }

    public float getgAditivada() {
        return gAditivada;
    }

    public void setgAditivada(float gAditivada) {
        this.gAditivada = gAditivada;
    }

    public float getDiesel() {
        return diesel;
    }

    public void setDiesel(float diesel) {
        this.diesel = diesel;
    }

    public float getEtanol() {
        return etanol;
    }

    public void setEtanol(float etanol) {
        this.etanol = etanol;
    }

    public float getGnv() {
        return gnv;
    }

    public void setGnv(float gnv) {
        this.gnv = gnv;
    }
    
     
        
    
    
 

    public void AbastecerPorValor(){
     System.out.println("----------------------------------");
     System.out.println("Digite o valor a ser abastecido:");   
     float resposta = leitor.nextFloat();
     float resposta1 = resposta - valorCombAtual;
     float soma = 0;
     float divisao = resposta / valorCombAtual;
     String formatado = String.format("%.2f", divisao);//Formatação para 
         //duas casas decimais
     
     while (soma < resposta1){
         soma += valorCombAtual;
         String formatado2 = String.format("%.2f", soma); 
         System.out.println("R$ " + formatado2);
        }
     System.out.println(resposta);
     
     
     System.out.println("Quantidade de litros total: " + formatado);
     qtdCombAtual = qtdCombAtual - divisao;
    }
    
    
    
    public void AbastecerPorLitro(){
       System.out.println("----------------------------------");
       System.out.println("Digite a quantidade de litros a ser abastecido:");
       float resposta = leitor.nextFloat();
       
       for(int i = 1; i <= resposta; i++){
           System.out.println(i + " Litro(s) abastecido(s)");
       }
       
       float total = valorCombAtual * resposta;
       String formatadoTotal = String.format("%.2f", total);
       System.out.println("Valor total: R$" + formatadoTotal);
       qtdCombAtual = qtdCombAtual - resposta;
    }
    
    
    
    public void AlterarCombustivel(){
        
        
        System.out.println("Qual combustível deseja selecionar?");
        Menu();
        int resposta = leitor.nextInt();
        
        switch(resposta){
            case 1:
                System.out.println("Combustível alterado para: " + categorias[0]);
                valorCombAtual = precos[0];
                qtdCombAtual = qtdCombust[0];
                categoria = categorias[0];
                
                break;
            case 2:
                System.out.println("Combustível alterado para: " + categorias[1]);
                valorCombAtual = precos[1];
                qtdCombAtual = qtdCombust[1];
                categoria = categorias[1];
                
                break;
            case 3:
                System.out.println("Combustível alterado para: " + categorias[2]);
                valorCombAtual = precos[2];
                qtdCombAtual = qtdCombust[2];
                categoria = categorias[2];
                
                break;
            case 4:
                System.out.println("Combustível alterado para: " + categorias[3]);
                valorCombAtual = precos[3];
                qtdCombAtual = qtdCombust[3];
                categoria = categorias[3];
                
                break;
            case 5:
                System.out.println("Combustível alterado para: " + categorias[4]);
                valorCombAtual = precos[4];
                qtdCombAtual = qtdCombust[4];
                categoria = categorias[4];
                
                break;
            case 6:
                System.out.println("Combustível alterado para: " + categorias[5]);
                valorCombAtual = precos[5];
                qtdCombAtual = qtdCombust[5];
                categoria = categorias[5];
                
                break;
        
        
        
        }
}
    
    public void AlterarValorComb(){
        System.out.println("Combustível atual: " + categoria);
        System.out.println("Valor atual: " + valorCombAtual);
        System.out.println("");
        System.out.println("Digite o novo valor do combustível: ");
        float resposta = leitor.nextFloat();
        
        
                
        if(valorCombAtual == precos[0]){
            precos[0] = resposta;
            valorCombAtual = precos[0];
            System.out.println("Valor do combustível " + categoria + " foi alterado para: " + precos[0]);
        }else if(valorCombAtual == precos[1]){
            precos[1] = resposta;
            valorCombAtual = precos[1];
            System.out.println("Valor do combustível " + categoria + " foi alterado para: " + precos[1]);
        }else if(valorCombAtual == precos[2]){
            precos[2] = resposta;
            valorCombAtual = precos[2];
            System.out.println("Valor do combustível " + categoria + " foi alterado para: " + precos[2]);
        }else if(valorCombAtual == precos[3]){
            precos[3] = resposta;
            valorCombAtual = precos[3];
            System.out.println("Valor do combustível " + categoria + " foi alterado para: " + precos[3]);
        }else if(valorCombAtual == precos[4]){
            precos[4] = resposta;
            valorCombAtual = precos[4];
            System.out.println("Valor do combustível " + categoria + " foi alterado para: " + precos[4]);
        }else{
            precos[5] = resposta;
            valorCombAtual = precos[5];
            System.out.println("Valor do combustível " + categoria + " foi alterado para: " + precos[5]);
        }
     
    }
    
    public void Alterarqtdcomb(){
    
        System.out.println("Digite a quantidade de combustível adicionada:");
        float resposta = leitor.nextFloat();
        qtdCombAtual = qtdCombAtual + resposta;
        System.out.println("Operação realizada com sucesso!");
        System.out.println();
        
}
    
    
    
    
    
}
