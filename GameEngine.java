import java.util.*;

public class GameEngine {
    private Player player;
    private QuizDatabase quizDatabase;
    private Scanner scanner;
    private List<Quiz> currentQuizSet;

    public GameEngine() {
        quizDatabase = new QuizDatabase();
        scanner = new Scanner(System.in);
    }

    public void start() {
        displayWelcomeBanner();
        setupPlayer();
        mainMenu();
    }

    private void displayWelcomeBanner() {
        System.out.println("\n" + "╔".repeat(60));
        System.out.println("║" + " ".repeat(58) + "║");
        System.out.println("║" + " ".repeat(10) + "🎓 GAMIFIED LEARNING PLATFORM 🎓" + " ".repeat(16) + "║");
        System.out.println("║" + " ".repeat(15) + "Master Java Through Fun!" + " ".repeat(20) + "║");
        System.out.println("║" + " ".repeat(58) + "║");
        System.out.println("╚".repeat(60));
    }

    private void setupPlayer() {
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            name = "Player";
        }
        player = new Player(name);
        System.out.println("\nWelcome, " + player.getName() + "! Let's start learning! 🚀\n");
    }

    private void mainMenu() {
        while (true) {
            System.out.println("\n" + "━".repeat(60));
            System.out.println("                        MAIN MENU");
            System.out.println("━".repeat(60));
            System.out.println("1. 🎮 Play Quick Quiz (10 random questions)");
            System.out.println("2. 📚 Choose Category");
            System.out.println("3. 📊 View Statistics");
            System.out.println("4. 🏆 View Leaderboard Info");
            System.out.println("5. ❓ How to Play");
            System.out.println("6. 🚪 Exit");
            System.out.println("━".repeat(60));
            System.out.print("Choose an option (1-6): ");

            int choice = getValidIntInput(1, 6);

            switch (choice) {
                case 1:
                    playQuickQuiz();
                    break;
                case 2:
                    chooseCategoryMode();
                    break;
                case 3:
                    player.displayStats();
                    break;
                case 4:
                    displayLeaderboardInfo();
                    break;
                case 5:
                    displayInstructions();
                    break;
                case 6:
                    exitGame();
                    return;
            }
        }
    }

    private void playQuickQuiz() {
        currentQuizSet = quizDatabase.getRandomQuizzes(10);
        playQuizSet(currentQuizSet);
    }

    private void chooseCategoryMode() {
        Set<String> categories = quizDatabase.getAllCategories();
        List<String> categoryList = new ArrayList<>(categories);
        Collections.sort(categoryList);

        System.out.println("\n" + "━".repeat(60));
        System.out.println("                    SELECT CATEGORY");
        System.out.println("━".repeat(60));
        
        for (int i = 0; i < categoryList.size(); i++) {
            System.out.println((i + 1) + ". " + categoryList.get(i));
        }
        System.out.println((categoryList.size() + 1) + ". Back to Main Menu");
        System.out.println("━".repeat(60));
        System.out.print("Choose a category: ");

        int choice = getValidIntInput(1, categoryList.size() + 1);

        if (choice == categoryList.size() + 1) {
            return;
        }

        String selectedCategory = categoryList.get(choice - 1);
        currentQuizSet = quizDatabase.getQuizzesByCategory(selectedCategory);
        
        System.out.println("\nYou selected: " + selectedCategory);
        System.out.println("Total questions available: " + currentQuizSet.size());
        
        playQuizSet(currentQuizSet);
    }

    private void playQuizSet(List<Quiz> quizzes) {
        if (quizzes.isEmpty()) {
            System.out.println("\nNo quizzes available for this category!");
            return;
        }

        int correctCount = 0;
        int questionNumber = 0;

        System.out.println("\n🎯 Starting quiz with " + quizzes.size() + " questions!");
        System.out.println("Let's test your knowledge!\n");

        for (Quiz quiz : quizzes) {
            questionNumber++;
            quiz.displayQuestion(questionNumber);

            System.out.print("Your answer (1-" + quiz.getOptions().size() + "): ");
            int userAnswer = getValidIntInput(1, quiz.getOptions().size()) - 1;

            if (quiz.checkAnswer(userAnswer)) {
                System.out.println("\n✅ Correct! +" + quiz.getPoints() + " points");
                player.addScore(quiz.getPoints());
                player.incrementCorrectAnswers();
                correctCount++;
                
                if (player.getStreak() > 1) {
                    System.out.println("🔥 Streak: " + player.getStreak() + " in a row!");
                }
            } else {
                System.out.println("\n❌ Wrong! The correct answer was: " + 
                    quiz.getOptions().get(quiz.getCorrectAnswerIndex()));
                player.incrementWrongAnswers();
            }

            // Show current score
            System.out.println("Current Score: " + player.getScore() + " | Level: " + player.getLevel());
            
            // Pause between questions
            if (questionNumber < quizzes.size()) {
                System.out.print("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        // Display quiz results
        displayQuizResults(correctCount, quizzes.size());
    }

    private void displayQuizResults(int correct, int total) {
        double percentage = (correct * 100.0) / total;
        
        System.out.println("\n" + "╔".repeat(60));
        System.out.println("║" + " ".repeat(20) + "QUIZ COMPLETE!" + " ".repeat(25) + "║");
        System.out.println("╠".repeat(60));
        System.out.println("║ Score: " + correct + "/" + total + " (" + String.format("%.1f", percentage) + "%)");
        System.out.println("║ Total Points Earned: " + player.getScore());
        System.out.println("║ Current Level: " + player.getLevel());
        
        if (percentage >= 90) {
            System.out.println("║ Grade: 🌟 OUTSTANDING! You're a master!");
        } else if (percentage >= 75) {
            System.out.println("║ Grade: ⭐ Excellent! Great job!");
        } else if (percentage >= 60) {
            System.out.println("║ Grade: 👍 Good! Keep practicing!");
        } else if (percentage >= 50) {
            System.out.println("║ Grade: 📖 Fair. Review the material!");
        } else {
            System.out.println("║ Grade: 💪 Keep trying! Practice makes perfect!");
        }
        
        System.out.println("╚".repeat(60));
    }

    private void displayLeaderboardInfo() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("                    ACHIEVEMENT SYSTEM");
        System.out.println("═".repeat(60));
        System.out.println("\n🏆 Available Badges:");
        System.out.println("  🏅 Beginner - Answer 5 questions correctly");
        System.out.println("  🏅 Intermediate - Answer 10 questions correctly");
        System.out.println("  🏅 Expert - Answer 20 questions correctly");
        System.out.println("  🏅 Hot Streak - Get 5 correct answers in a row");
        System.out.println("  🏅 Unstoppable - Get 10 correct answers in a row");
        
        System.out.println("\n📈 Level System:");
        System.out.println("  Every 100 points = 1 Level");
        System.out.println("  Current Level: " + player.getLevel());
        System.out.println("  Points to Next Level: " + (100 - (player.getScore() % 100)));
        System.out.println("═".repeat(60));
    }

    private void displayInstructions() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("                    HOW TO PLAY");
        System.out.println("═".repeat(60));
        System.out.println("\n📖 Instructions:");
        System.out.println("  1. Choose between Quick Quiz or Category-specific quiz");
        System.out.println("  2. Answer multiple-choice questions");
        System.out.println("  3. Earn points for correct answers");
        System.out.println("  4. Level up as you earn points (100 points per level)");
        System.out.println("  5. Collect badges for achievements");
        System.out.println("  6. Build streaks for bonus recognition");
        
        System.out.println("\n💡 Tips:");
        System.out.println("  • Different questions are worth different points");
        System.out.println("  • Harder questions give more points");
        System.out.println("  • Keep your streak going for special badges");
        System.out.println("  • Check your statistics to track progress");
        System.out.println("═".repeat(60));
    }

    private int getValidIntInput(int min, int max) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.print("Please enter a number between " + min + " and " + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    private void exitGame() {
        System.out.println("\n" + "╔".repeat(60));
        System.out.println("║" + " ".repeat(15) + "Thank you for playing!" + " ".repeat(22) + "║");
        System.out.println("║" + " ".repeat(58) + "║");
        player.displayStats();
        System.out.println("\n║" + " ".repeat(12) + "Keep learning and come back soon! 🚀" + " ".repeat(10) + "║");
        System.out.println("╚".repeat(60));
        scanner.close();
    }

    public static void main(String[] args) {
        GameEngine game = new GameEngine();
        game.start();
    }
}
