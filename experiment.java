class library {
    String name;
    int bb;
    library(String name, int bb) {
        this.name = name;
        this.bb = bb;
    }

    public boolean cb() {
        return false;
    }

    public void bob() {
        if (cb()) {
            System.out.println(name + " You borrowed " + bb + " book ");
            bb++; // Increment after printing the message
        } else {
            System.out.println("Your Limit Exceeded!");
        }
    }
}

class students extends library {
    students(String name, int bb) {
        super(name, bb);
    }

    public boolean cb() {
        return bb < 3; // Allow students to borrow up to 2 books
    }
}

class teachers extends library {
    teachers(String name, int bb) {
        super(name, bb);
    }

    public boolean cb() {
        return bb < 10;
    }
}

public class experiment {
    public static void main(String[] args) {
        library a = new students("Amar",5); // Amar can borrow 2 books
        library b1 = new students("Lalitha", 1); // Lalitha starts within limit
        library b = new teachers("Dr.Prem Kumar", 7); // Dr.Prem Kumar starts within limit
        b1.bob();
        a.bob();
        b.bob();
    }
}
/*
Lalitha You borrowed 1 book 
Your Limit Exceeded!
Dr.Prem Kumar You borrowed 7 book   */