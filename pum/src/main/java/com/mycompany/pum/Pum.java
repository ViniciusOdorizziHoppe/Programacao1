public class Estudante {

    private int codMatricula;
    private String semestreIngresso;
    private int anosIngresso;
    private String situacaoAcademica;
    private static String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String telefone;
    public String digito;

    private int obterIdade(Date hoje) {
        int idade = 0;
        return idade;
    }

    public Estudante() {
        nome = "Nobody";
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String _nome) {
        nome = _nome;
    }
    public void setMatricula(String _digito) {
        digito = _digito;
    }
    public String getMatricula() {
        return digito = matricula+semestreIngresso+digito;
    }
    
}

