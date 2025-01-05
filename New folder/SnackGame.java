import java.util.Random;  
import java.util.Scanner;  

public class SnackGame {  
    private static final int WIDTH = 10;  
    private static final int HEIGHT = 10;  
    private static final char PLAYER = 'P';  
    private static final char SNACK = 'S';  
    private static final char EMPTY = ' ';  

    private char[][] board = new char[HEIGHT][WIDTH]; // note: typically it's row x column  
    private int playerX = HEIGHT / 2;  
    private int playerY = WIDTH / 2;  
    private int snackX;  
    private int snackY;  
    private int score = 0;  
    private Random random = new Random();  

    public SnackGame() {  
        initializeBoard();  
        placeSnack();  
    }  

    private void initializeBoard() {  
        for (int i = 0; i < HEIGHT; i++) {  
            for (int j = 0; j < WIDTH; j++) {  
                board[i][j] = EMPTY;  
            }  
        }  
        board[playerX][playerY] = PLAYER;  
    }  

    private void placeSnack() {  
        do {  
            snackX = random.nextInt(HEIGHT);  
            snackY = random.nextInt(WIDTH);  
        } while (board[snackX][snackY] != EMPTY); // Ensure it's on an empty space  
        board[snackX][snackY] = SNACK;  
    }  

    public void printBoard() {  
        for (int i = 0; i < HEIGHT; i++) {  
            for (int j = 0; j < WIDTH; j++) {  
                System.out.print(board[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  

    public void movePlayer(char direction) {  
        board[playerX][playerY] = EMPTY; // Clear the current position  
        switch (direction) {  
            case 'w': if (playerX > 0) playerX--; break; // Up  
            case 's': if (playerX < HEIGHT - 1) playerX++; break; // Down  
            case 'a': if (playerY > 0) playerY--; break; // Left  
            case 'd': if (playerY < WIDTH - 1) playerY++; break; // Right  
            case 'q': // Quit command  
                System.out.println("Thanks for playing!");  
                System.exit(0);  
            default:  
                System.out.println("Invalid input. Please use 'w', 'a', 's', 'd' to move or 'q' to quit.");  
                break;  
        }  
        
        // Check if player collected snack  
        if (playerX == snackX && playerY == snackY) {  
            score++;  
            placeSnack(); // Place a new snack in a random empty location  
        }  
        board[playerX][playerY] = PLAYER; // Update player's position  
    }  

    public static void main(String[] args) {  
        SnackGame game = new SnackGame();  
        Scanner scanner = new Scanner(System.in);  

        while (true) {  
            game.printBoard();  
            System.out.println("Score: " + game.score);  
            System.out.print("Enter direction (w/a/s/d) or 'q' to quit: ");  
            char direction = scanner.next().charAt(0);  
            game.movePlayer(direction);  
        }  
    }  
}