public class Controller {
    private Auto[] autos=new Auto[1];
    int i;
    public void add(int index,Auto auto){
       autos[index]=auto;
          // index++;
    }

    public void update(){
    System.out.println("Update");
    }

    public void delete(){
    System.out.println("Delete");
    }

    public void show(){
      for (int j=0;j<autos.length;j++){
          System.out.println(autos[j].getModel());
          System.out.println(autos[j].getAge());
          System.out.println(autos[j].getPrice());
      }
    }
}
