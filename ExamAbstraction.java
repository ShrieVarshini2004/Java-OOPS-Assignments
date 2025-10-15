// File: ExamAbstraction.java
abstract class Exam {
    String subject;

    Exam(String subject) {
        this.subject = subject;
    }

    // Abstract method
    abstract void displayResult();

    // Concrete method
    void showSubject() {
        System.out.println("Subject: " + subject);
    }
}

class SemesterExam extends Exam {
    SemesterExam(String subject) {
        super(subject);
    }

    void displayResult() {
        System.out.println("Semester Exam Result: 85 marks");
    }
}

class FinalExam extends Exam {
    FinalExam(String subject) {
        super(subject);
    }

    void displayResult() {
        System.out.println("Final Exam Result: 90 marks");
    }
}

public class ExamAbstraction {
    public static void main(String[] args) {
        Exam e1 = new SemesterExam("Mathematics");
        Exam e2 = new FinalExam("Physics");

        e1.showSubject();
        e1.displayResult();

        System.out.println();

        e2.showSubject();
        e2.displayResult();
    }
}
