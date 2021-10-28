package pacote2;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(double[] notas, String curso, String nome, String endereco, String cpf, String telefone) {
        // super sempre que for fazer acesso a super classe
        super(nome, endereco, cpf, telefone);
        // referencia a própria classe com this
        this.notas = notas;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        //super.
        //this.
    }

    public void verificaAcesso(){
        //this.
        //super.
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        s += this.getEndereco();

        return s;
    }

    public void imprimirEtiquetaEndereco(){
        System.out.println("Imprimir endereço do aluno: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
