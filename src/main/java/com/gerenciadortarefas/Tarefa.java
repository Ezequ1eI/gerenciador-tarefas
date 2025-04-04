package main.java.com.gerenciadortarefas;

public class Tarefa {


    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }
    public int getId(){
        return id;
    }

    public String toString() {
        return id + " - " + descricao + " [" + (concluida ? "Concluida" : "Pendente") + "]";

    }

}
