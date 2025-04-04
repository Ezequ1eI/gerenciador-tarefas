package main.java.com.gerenciadortarefas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        System.out.println("Seja muito bem-vindo ao Gerenciador de Tarefas");

        while (true) {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Concluir tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefas(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    break;
                case 3:
                    System.out.print("ID da tarefa para concluir: ");
                    int id = scanner.nextInt();
                    gerenciador.concluirTarefa(id);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }

        }


    }
}