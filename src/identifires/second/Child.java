package identifires.second;

import identifires.first.Parent;

public class Child extends Parent {
    // klasa potomna w inne paczce nie ma dostępu do pól private oraz default czyli bez indetyfikatora

    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}

