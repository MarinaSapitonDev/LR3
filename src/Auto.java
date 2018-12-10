import java.util.Objects;

public abstract class Auto {

/*protected String color;
protected double price;
protected String model;*/
    private String model;
    private String age;
    private String price;

    public String getModel() {
        return model;
    }

    public String getAge() {
        return age;
    }

    public String getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void setAge(String age) {
        this.age = age;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    protected enum Brand{
        BMV,Lada,Toyota,Mazda
    }

    public Auto(String model, String age, String price) {
        this.model = model;
        this.age = age;
        this.price = price;
    }

    public Auto() {
    }

    @Override
    public String toString() {
        return "Auto{" + "model='" + model + '\'' + ", age='" + age + '\'' + ", price='" + price + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        //если объект сравнивается сам с собой возращаем true
        if (this == o) {
            return true;
        }
        //если объект ссылается на null или не является экземпляром данного класса возвращаем false
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //приводим тип объекта к типу нашего класса чтобы можно было сравнить данные
        Auto auto = (Auto) o;
        //сравниваем и возвращаем результат
        return Objects.equals(model, auto.model) && Objects.equals(age, auto.age) && Objects.equals(price, auto.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, age, price);
    }
}
