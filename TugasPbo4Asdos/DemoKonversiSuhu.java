// Class DemoKonversiSuhu
class DemoKonversiSuhu {
    public static void main(String[] args) {
       
        double suhuCelcius = 100;
        double suhuFahrenheit = 212;
        
        
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        
        double hasilFahrenheit = konversiSuhu.celciusToFahrenheit(suhuCelcius);
       
        double hasilReamurCelcius = konversiSuhu.celciusToReamur(suhuCelcius);
        
       
        System.out.println(suhuCelcius + " Celcius = " + hasilFahrenheit + " Fahrenheit");
        System.out.println(suhuCelcius + " Celcius = " + hasilReamurCelcius + " Reamur");
        
        
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();
        
        double hasilReamurFahrenheit = konversiSuhu2.fahrenheitToReamur(suhuFahrenheit);
        
        
        System.out.println(suhuFahrenheit + " Fahrenheit = " + hasilReamurFahrenheit + " Reamur");
    }
}