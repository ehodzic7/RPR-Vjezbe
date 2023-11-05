public class BaseClass {
    private DerivedClass derived;

    public BaseClass(DerivedClass derived) {
        this.derived = derived;
    }

    public String performOperation() {
        return derived.operation();
    }
}

public class DerivedClass {
    public String operation() {
        return "DerivedClass.operation()";
    }
}

