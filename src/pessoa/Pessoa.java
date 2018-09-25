
package pessoa;


public class Pessoa {
    
    
    //atributos
   private String nome;
   private int idade;
   private char sexo;
   
   public Pessoa(String nome, int idade, char sexo){
           this.nome = nome;
           this.idade = idade;
           this.sexo = sexo;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
   
    
    //imprimir os dados da Pessoa
    public String imprimir(){
        return "Nome: "+nome+
                "\nIdade: "+idade+
                "\nSexo: "+sexo;
                
    }
    
}
