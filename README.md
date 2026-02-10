# 🎓 Gamified Learning Platform - Java Edition

A fun, interactive quiz-based learning platform to master Java programming concepts!

## 📋 Features

✨ **Interactive Quiz System**
- 20+ curated Java programming questions
- Multiple categories: Java Basics, OOP, Data Structures, Advanced, General
- Quick Quiz mode and Category-specific quizzes

🎮 **Gamification Elements**
- Points and scoring system
- Level progression (100 points per level)
- Achievement badges (Beginner, Intermediate, Expert, Hot Streak, Unstoppable)
- Streak tracking for consecutive correct answers

📊 **Progress Tracking**
- Detailed statistics dashboard
- Accuracy percentage calculation
- Personal best streak tracking
- Real-time score updates

## 🚀 Getting Started

### Prerequisites

You need to have Java JDK (Java Development Kit) installed on your system.

**To check if Java is installed:**
```bash
java -version
javac -version
```

**If not installed, download and install:**
- Windows/Mac/Linux: Download from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- Ubuntu/Debian: `sudo apt-get install default-jdk`
- Mac (with Homebrew): `brew install openjdk`

### Installation

1. **Download the project files** - You should have these 4 Java files:
   - `GameEngine.java` (Main game controller)
   - `Player.java` (Player management)
   - `Quiz.java` (Quiz questions)
   - `QuizDatabase.java` (Question database)

2. **Place all files in the same folder** (e.g., `gamified-learning-platform`)

### Running the Program

#### Option 1: Command Line

**Step 1: Open Terminal/Command Prompt**
- Windows: Press `Win + R`, type `cmd`, press Enter
- Mac: Press `Cmd + Space`, type `Terminal`, press Enter
- Linux: Press `Ctrl + Alt + T`

**Step 2: Navigate to the project folder**
```bash
cd path/to/gamified-learning-platform
```

**Step 3: Compile the Java files**
```bash
javac *.java
```

**Step 4: Run the program**
```bash
java GameEngine
```

#### Option 2: Using VS Code

1. **Install VS Code** from https://code.visualstudio.com/

2. **Install Java Extension Pack**
   - Open VS Code
   - Click Extensions (Ctrl+Shift+X)
   - Search "Java Extension Pack"
   - Click Install

3. **Open the project folder**
   - File → Open Folder
   - Select `gamified-learning-platform` folder

4. **Run the program**
   - Open `GameEngine.java`
   - Click the "Run" button at the top-right
   - OR press F5
   - OR right-click in the file and select "Run Java"

## 🎯 How to Play

1. **Enter your name** when prompted
2. **Choose a game mode:**
   - Quick Quiz: 10 random questions
   - Category Mode: Choose specific topics
3. **Answer questions** by entering the number (1-4)
4. **Earn points** for correct answers
5. **Level up** every 100 points
6. **Collect badges** for achievements
7. **Check your stats** to track progress!

## 🏆 Achievement System

### Badges
- 🏅 **Beginner**: Answer 5 questions correctly
- 🏅 **Intermediate**: Answer 10 questions correctly
- 🏅 **Expert**: Answer 20 questions correctly
- 🏅 **Hot Streak**: Get 5 correct answers in a row
- 🏅 **Unstoppable**: Get 10 correct answers in a row

### Levels
- Every 100 points = 1 Level Up
- No maximum level - keep climbing!

## 📚 Quiz Categories

- **Java Basics**: Variables, syntax, data types
- **OOP**: Object-Oriented Programming concepts
- **Data Structures**: Arrays, Lists, Sets, Stacks
- **Advanced**: JVM, exceptions, static keyword
- **General**: Loops, comments, operators

## 🛠️ Troubleshooting

### "javac is not recognized" or "javac: command not found"
- Java JDK is not installed or not in PATH
- Install Java JDK and restart your terminal
- Add Java to your system PATH

### "Could not find or load main class"
- Make sure you're in the correct directory
- Check that all .java files are compiled (you should see .class files)
- Run: `javac *.java` again

### "Scanner closed" error
- This is normal when exiting the program
- Can be safely ignored

## 📝 File Structure

```
gamified-learning-platform/
├── GameEngine.java      # Main application controller
├── Player.java          # Player profile and statistics
├── Quiz.java           # Quiz question model
├── QuizDatabase.java   # Question repository
└── README.md           # This file
```

## 💡 Tips for Best Experience

- Keep your streak going for bonus badges
- Try different categories to expand your knowledge
- Check statistics regularly to track improvement
- Harder questions give more points!

## 🎓 Learning Objectives

This platform helps you master:
- Java syntax and fundamentals
- Object-Oriented Programming principles
- Data structures and algorithms
- Best practices in Java development
- Problem-solving skills

## 🤝 Support

If you encounter any issues:
1. Make sure Java JDK is properly installed
2. Verify all 4 .java files are in the same directory
3. Try recompiling with `javac *.java`
4. Check that you're using Java 8 or higher

## 📄 License

Free to use for educational purposes.

---

**Happy Learning! 🚀**

Made with ❤️ for Java learners everywhere
