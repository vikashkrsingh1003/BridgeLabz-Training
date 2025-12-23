import java.util.Scanner;

class RockPaper
{
    //Method to get computer choice
    public static String getComputerChoice()
    {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }

    //Method to find winner
    public static String findWinner(String user, String computer)
    {
        if (user.equals(computer)) {
            return "Draw";
        }
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    //Method to calculate average and percentage
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames)
    {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / totalGames);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100.0) / totalGames);

        return stats;
    }

    //Method to display results
    public static void displayResults(String[][] games, String[][] stats)
    {
        System.out.println("\nGame\tUser\tComputer\tResult");
      
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" +
                               games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWin Percentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + String.format("%.2f", Double.parseDouble(stats[i][2])) + "%");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[n][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}
