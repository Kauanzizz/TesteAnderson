public class Animal {
    private String nome;
    private String especie;
    private boolean internado;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setInternado(boolean internado) {
        this.internado = internado;
    }
    public boolean getInternado() {
        return internado;
    }
    public String NomeCadastrado() {
        return "Animal cadastrado: " + this.nome + " Raça: " + this.especie;
    }
}