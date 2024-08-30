package Livros;

public class Livros {

    // Propriedades privadas
    private String titulo;
    private int quantidadePaginas;
    private String autor;
    private String genero;

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    // Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para imprimir os dados do livro
    public void imprimirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Quantidade de Páginas: " + quantidadePaginas);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Livros
        Livros livro = new Livros();

        // Definindo os valores dos atributos
        livro.setTitulo("Dom Casmurro");
        livro.setQuantidadePaginas(256);
        livro.setAutor("Machado de Assis");
        livro.setGenero("Romance");

        // Imprimindo os dados do livro no console
        livro.imprimirDados();
    }
}