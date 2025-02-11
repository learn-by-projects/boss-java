public class Person {
  private String name;
  private int age;
  // constructors getters and setters omitted
  public boolean equals(Person p) {
    return p != null ? name != null && Objects.equals(name, p.name) && p.age == age : false;
  }
}
