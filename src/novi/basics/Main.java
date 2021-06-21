package novi.basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        // stap 1 maak een bord
        String[] board = new String[9];

        for (int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i); //  board[i] = i; Dit kan niet, omdat we een string array hebben
            System.out.println(board[i]);   //  gemaakt en nu een integer proberen te gebruiken, dus integer omzetten naar string;
        }

        Player playerA = new Player("Kruisje", "X");
        Player playerB = new Player("Rondje", "O");

        Player currentPlayer = playerA;
        boolean hasWon = false;


// stap 2 geef de speler de mogelijkheid om een x te zetten
        while (hasWon == false) {
            System.out.println("\n Voer een cijfer van 0 t/m 8 in om op het bord een " + currentPlayer.getName() + "te zetten");

        Scanner userInput = newScanner(System.in);
        int selectedField = userInput.nextInt();

        board[selectedField] = currentPlayer.getToken();
        // toon het bord
        printBoard(board);

        hasWon = hasPlayerWon(board, currentPlayer);

        //wissel van speler
        currentPlayer = switchPlayer(currentPlayer, playerA, playerB);

    }


        System.out.println("Gefeliciteerd, je hebt gewonnen: " + currentPlayer.getName());
        //for (int i = 0; i < board.length; i++) {
          //System.out.print(board[i] + " | ");

        boolean isEndOfRow = (i + 1) %3 ==0;
        boolean isLastField = i == 8;
            if(isEndOfRow == false){
                System.out.println(" | ");
            if (isEndOfRow && !isLastField){
                System.out.println("\n_________");
            }



        // stap 3 kijk of een speler heeft gewonnen

        // stap 4 geef een andere speler de mogelijkheid om een 0 te zetten

        // stap 5 kijk of de speler heeft gewonnen

        // herhaal stap 2 t/m 5

public static void printBoard(String[]board);

            public static Player switchPlater(Player currentPlayer, Player playerA, Player playerB);
                {
                    if (currentPlayer.getToken() == "X") {
                    return playerB;
                    } else {
                    return playerA;
       }
   }
  public static boolean hasPlayerWon(String[] board, String currentPlayer) {
            // Horizontale opties om te winnen
      if (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer){
          return true;
      }
      if (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) {
          return true;
      }
      if (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) {
          return true;
      }
      // verticale opties om te winnen
      if (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer){
          return true;
      }
      if (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) {
           return true;
      }
      if (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) {
          return true;
      /* diagonale opties om te winnen
          if (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer){
              return true;
          }
          if (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) {
              return true;
          }
          if (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) {
              return true;    */

}}}}}}
