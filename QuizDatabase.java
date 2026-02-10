import java.util.*;

public class QuizDatabase {
    private List<Quiz> allQuizzes;

    public QuizDatabase() {
        allQuizzes = new ArrayList<>();
        loadQuizzes();
    }

    private void loadQuizzes() {
        // Java Programming Questions
        allQuizzes.add(new Quiz(
            "What is the correct way to declare a variable in Java?",
            Arrays.asList("var x = 5;", "int x = 5;", "x = 5;", "integer x = 5;"),
            1,
            "Java Basics",
            10
        ));

        allQuizzes.add(new Quiz(
            "Which keyword is used to create a class in Java?",
            Arrays.asList("class", "Class", "new", "create"),
            0,
            "Java Basics",
            10
        ));

        allQuizzes.add(new Quiz(
            "What is the output of: System.out.println(5 + 3 + \"2\");",
            Arrays.asList("532", "82", "10", "Error"),
            1,
            "Java Basics",
            15
        ));

        allQuizzes.add(new Quiz(
            "Which of these is NOT a primitive data type in Java?",
            Arrays.asList("int", "boolean", "String", "double"),
            2,
            "Java Basics",
            15
        ));

        allQuizzes.add(new Quiz(
            "What does OOP stand for?",
            Arrays.asList("Object Oriented Programming", "Objective Oriented Programming", 
                         "Object Ordered Programming", "Optimal Object Programming"),
            0,
            "Java Basics",
            10
        ));

        // Object-Oriented Programming
        allQuizzes.add(new Quiz(
            "Which principle of OOP allows a class to inherit properties from another class?",
            Arrays.asList("Encapsulation", "Inheritance", "Polymorphism", "Abstraction"),
            1,
            "OOP",
            20
        ));

        allQuizzes.add(new Quiz(
            "What keyword is used to prevent a method from being overridden?",
            Arrays.asList("static", "final", "private", "const"),
            1,
            "OOP",
            20
        ));

        allQuizzes.add(new Quiz(
            "Which access modifier makes a member accessible only within the same class?",
            Arrays.asList("public", "protected", "private", "default"),
            2,
            "OOP",
            15
        ));

        // Data Structures
        allQuizzes.add(new Quiz(
            "Which data structure follows LIFO (Last In First Out) principle?",
            Arrays.asList("Queue", "Stack", "Array", "LinkedList"),
            1,
            "Data Structures",
            20
        ));

        allQuizzes.add(new Quiz(
            "What is the time complexity of accessing an element in an ArrayList by index?",
            Arrays.asList("O(n)", "O(log n)", "O(1)", "O(n²)"),
            2,
            "Data Structures",
            25
        ));

        allQuizzes.add(new Quiz(
            "Which collection does NOT allow duplicate elements?",
            Arrays.asList("ArrayList", "LinkedList", "HashSet", "Vector"),
            2,
            "Data Structures",
            20
        ));

        // Advanced Java
        allQuizzes.add(new Quiz(
            "What is the purpose of the 'static' keyword?",
            Arrays.asList("Makes a variable constant", "Belongs to the class rather than instance",
                         "Prevents inheritance", "Creates a new object"),
            1,
            "Advanced",
            25
        ));

        allQuizzes.add(new Quiz(
            "Which of these is used for exception handling?",
            Arrays.asList("if-else", "try-catch", "switch-case", "for-loop"),
            1,
            "Advanced",
            20
        ));

        allQuizzes.add(new Quiz(
            "What does JVM stand for?",
            Arrays.asList("Java Virtual Machine", "Java Variable Method", 
                         "Java Visual Manager", "Just Virtual Machine"),
            0,
            "Advanced",
            15
        ));

        allQuizzes.add(new Quiz(
            "Which method is called when an object is created?",
            Arrays.asList("main()", "start()", "constructor", "init()"),
            2,
            "Advanced",
            20
        ));

        // General Programming
        allQuizzes.add(new Quiz(
            "What is recursion?",
            Arrays.asList("A loop that runs forever", "A function that calls itself",
                         "A type of variable", "An error handling technique"),
            1,
            "General",
            20
        ));

        allQuizzes.add(new Quiz(
            "What symbol is used for single-line comments in Java?",
            Arrays.asList("#", "//", "/*", "--"),
            1,
            "General",
            10
        ));

        allQuizzes.add(new Quiz(
            "Which loop is guaranteed to execute at least once?",
            Arrays.asList("for loop", "while loop", "do-while loop", "foreach loop"),
            2,
            "General",
            15
        ));

        allQuizzes.add(new Quiz(
            "What is the result of 10 % 3 in Java?",
            Arrays.asList("3", "1", "0", "3.33"),
            1,
            "General",
            15
        ));

        allQuizzes.add(new Quiz(
            "Which method is the entry point of a Java program?",
            Arrays.asList("start()", "run()", "main()", "execute()"),
            2,
            "General",
            10
        ));

        allQuizzes.add(new Quiz(
            "What does API stand for?",
            Arrays.asList("Application Programming Interface", "Advanced Programming Interface",
                         "Automated Program Integration", "Application Process Integration"),
            0,
            "General",
            15
        ));
    }

    public List<Quiz> getAllQuizzes() {
        return new ArrayList<>(allQuizzes);
    }

    public List<Quiz> getQuizzesByCategory(String category) {
        List<Quiz> filtered = new ArrayList<>();
        for (Quiz quiz : allQuizzes) {
            if (quiz.getCategory().equalsIgnoreCase(category)) {
                filtered.add(quiz);
            }
        }
        return filtered;
    }

    public List<Quiz> getRandomQuizzes(int count) {
        List<Quiz> shuffled = new ArrayList<>(allQuizzes);
        Collections.shuffle(shuffled);
        return shuffled.subList(0, Math.min(count, shuffled.size()));
    }

    public Set<String> getAllCategories() {
        Set<String> categories = new HashSet<>();
        for (Quiz quiz : allQuizzes) {
            categories.add(quiz.getCategory());
        }
        return categories;
    }
}
