/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ollama_algot2;

/**
 *
 * @author becer
 */
class TreasureGame {
    
    private int[][] map; // Mapa del juego
    private int playerX, playerY; // Posición del jugador
    private int treasuresFound; // Tesoros encontrados
    private int score; // Puntaje actual

    public TreasureGame(int rows, int cols) {
        map = new int[rows][cols];
        playerX = 0; // Posición inicial del jugador
        playerY = 0; // Posición inicial del jugador
        treasuresFound = 0; // Inicializa los tesoros encontrados
        score = 0; // Inicializa el puntaje
        generateMap(); // Genera el mapa aleatorio
    }

    // Genera un mapa aleatorio con tesoros y trampas
    private void generateMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                double random = Math.random();
                if (random < 0.2) {
                    map[i][j] = 1; // Tesoro (20% probabilidad)
                } else if (random < 0.3) {
                    map[i][j] = -1; // Trampa (10% probabilidad)
                } else {
                    map[i][j] = 0; // Celda vacía (70% probabilidad)
                }
            }
        }
    }

    // Movimiento del jugador
    public void movePlayer(String direction) {
        switch (direction.toUpperCase()) {
            case "UP":
                if (playerX > 0) {
                    playerX--;
                }
                break;
            case "DOWN":
                if (playerX < map.length - 1) {
                    playerX++;
                }
                break;
            case "LEFT":
                if (playerY > 0) {
                    playerY--;
                }
                break;
            case "RIGHT":
                if (playerY < map[0].length - 1) {
                    playerY++;
                }
                break;
            default:
                System.out.println("Dirección inválida. Usa UP, DOWN, LEFT o RIGHT.");
                return;
        }
        checkCell();
    }

    // Verifica el contenido de la celda actual
    private void checkCell() {
        int cell = map[playerX][playerY];
        if (cell == 1) {
            treasuresFound++;
            score += 10;
            map[playerX][playerY] = 0; // Elimina el tesoro del mapa
            System.out.println("¡Encontraste un tesoro! Tesoros totales: " + treasuresFound);
        } else if (cell == -1) {
            score -= 5;
            System.out.println("¡Pisé una trampa! Puntos perdidos.");
        } else {
            System.out.println("Esta celda está vacía.");
        }
        System.out.println("Puntaje actual: " + score);
    }

    // Muestra el mapa con la posición actual del jugador
    public void displayMap() {
        System.out.println("\nMapa del juego:");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == playerX && j == playerY) {
                    System.out.print(" P "); // Posición del jugador
                } else if (map[i][j] == 1) {
                    System.out.print(" T "); // Tesoro
                } else if (map[i][j] == -1) {
                    System.out.print(" X "); // Trampa
                } else {
                    System.out.print(" 0 "); // Celda vacía
                }
            }
            System.out.println();
        }
    }

   
    public int getTreasuresFound() {
        return treasuresFound;
    }

    public int getScore() {
        return score;
    }

}

