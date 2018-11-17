public class FactoryClass {

    public Auto getAuto(String autoType){
        if (autoType == null) return null;
        if (autoType.equalsIgnoreCase("ECONOMY"))
            return new Economy();
        if (autoType.equalsIgnoreCase("PREMIUM"))
            return new Premium();
        return null;
    }

}
