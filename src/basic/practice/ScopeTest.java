package basic.practice;

public class ScopeTest {
    int num;

    public void StaticVariable() {
    }

    void getVariable() {
        this.num = 1;
    }

    public void publicVariable() {
        this.num = 1;
    }

    public static void main(String[] args) {
    }

}
