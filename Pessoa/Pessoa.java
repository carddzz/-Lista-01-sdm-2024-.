package Pessoa;

public class Pessoa {

    // Atributos privados
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    // Construtor sem parâmetros
    public Pessoa() {
        // Inicializa com valores padrão
        this.nome = "";
        this.sobrenome = "";
        this.idade = 0;
        this.cpf = "";
    }

    // Construtor com parâmetros
    public Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Get para nome
    public String getNome() {
        return nome;
    }

    // Set para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get para sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    // Set para sobrenome
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Get para idade 
    public int getIdade() {
        return idade;
    }

    //Set para idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Get para CPF
    public String getCpf() {
        return cpf;
    }

    //Set para CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Retorna o nome completo
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    // Método para imprimir os dados da pessoa no console
    public void imprimirDados() {
        System.out.println("Nome Completo: " + getNomeCompleto());
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando uma instância de Pessoa
        Pessoa pessoa = new Pessoa("Pedro", "Resende", 30, "123.456.789-00");

        // Imprimindo os dados da pessoa no console
        pessoa.imprimirDados();
    }
}