# 🚀 Quick Start Guide for VS Code

## Step-by-Step Instructions for Beginners

### 1️⃣ Install Java JDK

**Windows:**
1. Go to https://www.oracle.com/java/technologies/downloads/
2. Download "Windows x64 Installer" for Java 21 (or latest)
3. Run the installer
4. Follow the installation wizard (keep default settings)

**Mac:**
1. Open Terminal
2. Install Homebrew (if not installed): 
   ```
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
3. Install Java: `brew install openjdk`

**Linux (Ubuntu/Debian):**
```bash
sudo apt update
sudo apt install default-jdk
```

**Verify installation:**
```bash
java -version
javac -version
```
You should see version information for both commands.

---

### 2️⃣ Install VS Code

1. Download from https://code.visualstudio.com/
2. Install the application
3. Open VS Code

---

### 3️⃣ Install Java Extension for VS Code

1. Open VS Code
2. Click the **Extensions** icon (or press `Ctrl+Shift+X` / `Cmd+Shift+X`)
3. Search for "**Extension Pack for Java**"
4. Click **Install** on the one by Microsoft
5. Wait for installation to complete

---

### 4️⃣ Open the Project

1. In VS Code, click **File** → **Open Folder**
2. Navigate to the `gamified-learning-platform` folder
3. Click **Select Folder**

You should see all the files in the left sidebar:
- GameEngine.java
- Player.java
- Quiz.java
- QuizDatabase.java
- README.md
- run.bat / run.sh

---

### 5️⃣ Run the Program

**Method 1: Using the Run Button** (Easiest)
1. Click on `GameEngine.java` in the left sidebar
2. You'll see a **▶ Run** button at the top-right of the editor
3. Click it!
4. The program will run in the integrated terminal below

**Method 2: Using Right-Click**
1. Right-click anywhere in `GameEngine.java`
2. Select **Run Java**

**Method 3: Using F5**
1. Open `GameEngine.java`
2. Press **F5**
3. Select "Java" if prompted

---

### 6️⃣ Play the Game!

Once the program starts:
1. Enter your name when prompted
2. Type your answer and press **Enter**
3. Choose from the menu options (1-6)
4. Answer quiz questions
5. Have fun learning!

---

## 🎮 Game Controls

- **Type numbers** (1, 2, 3, etc.) to make choices
- Press **Enter** to confirm
- The game is completely text-based
- No mouse needed!

---

## 🐛 Troubleshooting

### "Java Extension not working"
- Restart VS Code after installing the extension
- Make sure JDK is installed (not just JRE)

### "Cannot find Java runtime"
- VS Code may need to know where Java is installed
- Press `Ctrl+,` (Settings)
- Search for "java.home"
- Set the path to your JDK installation

### "Build failed"
- Make sure all 4 .java files are in the same folder
- Try: View → Command Palette → "Java: Clean Java Language Server Workspace"
- Restart VS Code

### Terminal shows errors
- Make sure you have Java **JDK** not just **JRE**
- Re-install Java JDK if needed
- Restart your computer after installation

---

## 💡 VS Code Tips

- **Split editor**: Drag a file tab to the side to view multiple files
- **Integrated terminal**: View → Terminal (or Ctrl+`)
- **Auto-save**: File → Auto Save (very helpful!)
- **Font size**: Hold Ctrl and scroll mouse wheel
- **Zen mode**: View → Appearance → Zen Mode (distraction-free)

---

## 📚 What You'll Learn

By playing this game, you'll practice:
- Java syntax and variables
- Object-Oriented Programming (OOP)
- Data structures (Arrays, Lists, Sets)
- Java keywords and operators
- Programming logic and problem-solving

---

## 🎯 Next Steps

After mastering the basics:
1. Try to read the code and understand how it works
2. Modify the questions in `QuizDatabase.java`
3. Add your own quiz categories
4. Change the scoring system
5. Add new features!

---

**Need Help?**
- VS Code docs: https://code.visualstudio.com/docs/java/java-tutorial
- Java tutorials: https://www.w3schools.com/java/

**Happy Learning! 🚀**
