package entities;

public class Usuario {

    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public Usuario(){}

    public Usuario(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
    }

    // Get e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public void aumentarPontuacao(int aumentarPontuacao) {}

    public void subirNivel (int subirNivel){

    }

    public void bonus (int bonus){

    }

}