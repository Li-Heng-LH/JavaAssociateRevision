package mainApp;

//A proper class for reuse
public class Foo {
    private int id;
    private String name;

    public Foo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null) {
            return false;
        } else if(obj instanceof Foo) {
            Foo fooObj = (Foo) obj;
            return this.getId() == fooObj.getId() &&
                    this.getName().equals(fooObj.getName());
        } else {
            return false;
        }
    }
}
