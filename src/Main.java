public class Main {
    public static void main(String[] args) {
        Employee mainManager = new Manager("Jan", "Kowalski", 5000f);
        mainManager.add(new Employee("Eryk", "Koks", 2000f));
        System.out.println(mainManager.getEmployees());
    }
}
