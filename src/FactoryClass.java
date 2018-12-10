public class FactoryClass {

    public Auto getAuto(String autoType, String model,String age,String price){
        if (autoType == null) return null;
        if (autoType.equalsIgnoreCase("ECONOMY"))
        {
            Auto auto = new Economy();
            auto.setModel(model);
            auto.setAge(age);
            auto.setPrice(price);
            return auto;
        }
            //return new Economy();
        if (autoType.equalsIgnoreCase("PREMIUM"))
        {
            Auto auto = new Premium();
            auto.setModel(model);
            auto.setAge(age);
            auto.setPrice(price);
          //  auto.setCapacity(3);
            return auto;
        }
            return new Premium();

    }

}
