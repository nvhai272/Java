package OOP;

public class InheritanceAndPolymorphism {
    // kế thừa đơn trong Java (lớp con chỉ có thể kế thừa 1 lớp cha)
    // phương thức private của cha không thể kế thừa (protected and public)
    // ko kế thừa constructor
    public static void main(String[] args) {
        Subclass subclass = new Subclass("Alice", 25);
        subclass.showDetails();
        subclass.greet();
        subclass.greet("Hai");

        // kiểu dữ liệu bố nhưng instance là của con
        Superclass obj = new Subclass();
        // phải ép kiểu vì bố không có hàm này và sẽ bị exception
        ((Subclass) obj).showDetails();
    }
}

class Superclass {
    protected String name;

    public Superclass() {
    }

    public Superclass(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello from Superclass!");
    }
}

class Subclass extends Superclass {
    private int age;

    public Subclass() {
    }
    public Subclass(String name, int age) {
        super(name);
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // nếu không ghi đè phương thức(viết lại hàm) thì khi gọi lại sẽ dùng lại hàm của cha
    @Override
    public void greet() {
        System.out.println("Hello from Subclass!");
    }

    // đa hình overload (nạp chồng phương thức)
    public void greet(String ahihi) {
        System.out.println("Hello " + ahihi);
    }
}

