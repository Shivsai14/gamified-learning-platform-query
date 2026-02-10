import java.util.*;

public class Player {
    private String name;
    private int score;
    private int level;
    private int totalQuestionsAnswered;
    private int correctAnswers;
    private List<String> badges;
    private int streak;
    private int maxStreak;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.level = 1;
        this.totalQuestionsAnswered = 0;
        this.correctAnswers = 0;
        this.badges = new ArrayList<>();
        this.streak = 0;
        this.maxStreak = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    public void addScore(int points) {
        score += points;
        checkLevelUp();
    }

    public void incrementCorrectAnswers() {
        correctAnswers++;
        totalQuestionsAnswered++;
        streak++;
        if (streak > maxStreak) {
            maxStreak = streak;
        }
        checkBadges();
    }

    public void incrementWrongAnswers() {
        totalQuestionsAnswered++;
        streak = 0;
    }

    public void checkLevelUp() {
        int newLevel = (score / 100) + 1;
        if (newLevel > level) {
            level = newLevel;
            System.out.println("\n🎉 LEVEL UP! You are now Level " + level + "! 🎉\n");
        }
    }

    public void checkBadges() {
        if (correctAnswers >= 5 && !badges.contains("Beginner")) {
            badges.add("Beginner");
            System.out.println("\n🏅 NEW BADGE EARNED: Beginner (5 correct answers)! 🏅\n");
        }
        if (correctAnswers >= 10 && !badges.contains("Intermediate")) {
            badges.add("Intermediate");
            System.out.println("\n🏅 NEW BADGE EARNED: Intermediate (10 correct answers)! 🏅\n");
        }
        if (correctAnswers >= 20 && !badges.contains("Expert")) {
            badges.add("Expert");
            System.out.println("\n🏅 NEW BADGE EARNED: Expert (20 correct answers)! 🏅\n");
        }
        if (streak >= 5 && !badges.contains("Hot Streak")) {
            badges.add("Hot Streak");
            System.out.println("\n🏅 NEW BADGE EARNED: Hot Streak (5 in a row)! 🏅\n");
        }
        if (maxStreak >= 10 && !badges.contains("Unstoppable")) {
            badges.add("Unstoppable");
            System.out.println("\n🏅 NEW BADGE EARNED: Unstoppable (10 in a row)! 🏅\n");
        }
    }

    public void displayStats() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("                    PLAYER STATISTICS");
        System.out.println("═".repeat(60));
        System.out.println("Player: " + name);
        System.out.println("Level: " + level);
        System.out.println("Total Score: " + score + " points");
        System.out.println("Questions Answered: " + totalQuestionsAnswered);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Accuracy: " + (totalQuestionsAnswered > 0 ? 
            String.format("%.1f", (correctAnswers * 100.0 / totalQuestionsAnswered)) : "0") + "%");
        System.out.println("Current Streak: " + streak);
        System.out.println("Max Streak: " + maxStreak);
        System.out.println("\nBadges Earned (" + badges.size() + "):");
        if (badges.isEmpty()) {
            System.out.println("  No badges yet. Keep playing to earn some!");
        } else {
            for (String badge : badges) {
                System.out.println("  🏅 " + badge);
            }
        }
        System.out.println("═".repeat(60));
    }

    public int getStreak() {
        return streak;
    }
}
