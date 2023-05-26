package identifires.second;

import identifires.first.Parent;

// klasa w innej paczce nie ma dostępu do pól private oraz default czyli bez indetyfikatora oraz protected

public class Random {

    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        parent.firstMethod();

    }
}
