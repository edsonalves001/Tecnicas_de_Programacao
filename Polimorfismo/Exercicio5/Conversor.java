public class Conversor{
   
    public double converter(double celsius){
        double fahrennheit = (celsius*1.8) + 32;
        return fahrennheit;
    }
    public double converter(int km){
        double milha = km/1.609;
        return milha;
    }
    public String converter(String palavra){
        String capslock = palavra.toUpperCase();
        return capslock;
    }
}