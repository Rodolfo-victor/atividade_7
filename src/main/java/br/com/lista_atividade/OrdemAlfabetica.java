package br.com.lista_atividade;

import java.io.*;
import java.util.*;

public class OrdemAlfabetica {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("meuarquivo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
            return;
        }

        Collections.sort(lines);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("meuarquivo_ordenado.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }
}
