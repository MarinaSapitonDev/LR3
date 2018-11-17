import java.util.Scanner;

public class View {
    private Controller controller;
    int number=1;
    int index=0;


    public View(){
       // number=1;
        controller = new Controller();
    }


    public void showMenu() {

        System.out.println("Список операций");
        System.out.println("1.Добавить элемент в коллекцию");
        System.out.println("2.Обновить данные элемента коллекции по индексу");
        System.out.println("3.Удалить элемент коллекции по индексу");
        System.out.println("4.Вывести все оюъекты на экран");
        System.out.println("5.Сохранить в файл");
        System.out.println("6.Загрузить из файла");
        System.out.println("0.Выход");
        Scanner reader = new Scanner(System.in);
        while (number!=0) {
            System.out.println("Введите номер оперпции");
            number = reader.nextInt();
            doOperations(number);
        }

    }

    public void doOperations(int number){

       if(number==1) {
           FactoryClass factory = new FactoryClass();
           Auto auto = factory.getAuto("economy");
           auto.setModel("BMV");
           auto.setAge("10");
           auto.setPrice("4$");
           controller.add(0, auto);

       }


        if(number==2) controller.update();
        if(number==3) controller.delete();

        if(number==4)  controller.show();
    }

}
