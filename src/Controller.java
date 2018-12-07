public class Controller {
    //private Auto[] autos=new Auto[3];
    private Collection autos= new Collection();
    int i=0;
    public void add(String type,String model, String age, String price){

        FactoryClass factory = new FactoryClass();
        Auto auto = factory.getAuto(type,model,age,price);
          // index++;
      //  autos[i]=auto;
      //  i++;
        //System.out.println(auto.getModel());

        autos.add(auto);
        for(int i=0;i<autos.size();i++) {
            System.out.println("autos");
            System.out.println(autos.get(i));
        }
    }

    public void update(int index,String type,String model, String age, String price){
    System.out.println("Update");
        FactoryClass factory = new FactoryClass();
        Auto auto = factory.getAuto(type,model,age,price);
        // index++;
       // autos[index]=auto;
        autos.add(index,auto);

    }

    public void delete(int index){
    System.out.println("Delete");
      //  autos[index]=null;
        autos.remove(index);
    }

    public void show() {

        for (int j = 0; j < autos.size(); j++) {
            if (autos.get(j) == null) {
                System.out.println("empty");
                break;
            } else {
                System.out.println(autos.get(j).getModel());
                System.out.println(autos[j].getAge());
                System.out.println(autos[j].getPrice());
            }
        }
    }

  /*  public void show(){

      for (int j=0;j<autos.length;j++){
          if(autos[j]==null) {
              System.out.println("empty");
              break;

          }
          else {
              System.out.println(autos[j].getModel());
              System.out.println(autos[j].getAge());
              System.out.println(autos[j].getPrice());
          }
      }

    }*/
}
