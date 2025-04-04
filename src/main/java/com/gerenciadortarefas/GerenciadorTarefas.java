package main.java.com.gerenciadortarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int contadorId = 1;


    public void adicionarTarefas(String descricao){
        tarefas.add(new Tarefa(contadorId++, descricao));
    }
    public void listarTarefas(){
        for (Tarefa t : tarefas){
            System.out.println(t);
        }
    }

    public void concluirTarefa(int id){
        for(Tarefa t : tarefas){
            if(t.getId() == id){
                t.concluir();
                break;
            }
        }
    }
}
