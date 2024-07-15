import java.util.Scanner;

public class SusAmong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskCompleted = 0;
        int playersFrozen = 0;
        int emergencyMeetingCalled = 0;

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Player[] players = new Player[N];

        for (int i = 0; i < N; i++) {
            if (i < M) {
                players[i] = new RedAstronaut("Impostor " + (i + 1));
            } else {
                players[i] = new BlueAstronaut("Crewmate " + (i + 1 - M));
            }
        }

        int operation;
        do {
            operation = scanner.nextInt();

            switch (operation) {
                case 1: 
                    int taskPlayerIndex = scanner.nextInt();
                    if (players[taskPlayerIndex] instanceof BlueAstronaut) {
                        ((BlueAstronaut) players[taskPlayerIndex]).completeTask();
                        taskCompleted++;
                    }
                    break;
                case 2: // Freeze
                    int impostorIndex = scanner.nextInt();
                    int targetIndex = scanner.nextInt();
                    if (players[impostorIndex] instanceof RedAstronaut) {
                        ((RedAstronaut) players[impostorIndex]).freeze(players[targetIndex]);
                        playersFrozen++;
                    }
                    break;
                case 3: // Emergency Meeting
                    for (Player player : players) {
                        player.emergencyMeeting();
                    }
                    emergencyMeetingCalled++;
                    break;
                case 4: // Quit
                    break;
                default:
                    break;
            }

            if (players[0].gameOver()) {
                break;
            }

        } while (operation != 4);

        System.out.println("Task completed: " + taskCompleted);
        System.out.println("Players frozen: " + playersFrozen);
        System.out.println("Emergency meetings called: " + emergencyMeetingCalled);
        System.out.println("Game Over. Thanks for playing!");

        scanner.close();
    }
}
