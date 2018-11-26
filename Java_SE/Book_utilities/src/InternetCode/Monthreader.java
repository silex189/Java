package InternetCode;

//codigo de internet, no puedo elegir mas del mes 9 porque system.in.read()
// solo acepta un caracter al mismo tiempo, buscar un metodo de entrada de varios
public class Monthreader {
    public static void main(String[] args) 
            throws java.io.IOException{

    	char month;

        System.out.println("Please enter a Month Number: ");

        month = (char) System.in.read(); //Get an integer
        //System.out.println("Actual value of :" + month);

        switch (month) {
        case '1':  System.out.println("January");
        break;
        case '2':  System.out.println("February");
        break;
        case '3':  System.out.println("March");
        break;
        case '4':  System.out.println("April");
        break;
        case '5':  System.out.println("May");
        break;
        case '6':  System.out.println("June");
        break;
        case '7':  System.out.println("July");
        break;
        case '8':  System.out.println("August");
        break;
        case '9':  System.out.println("September");
        break;
        /*case '10': System.out.println("October");
        break;
        case '11': System.out.println("November");
        break;
        case '12': System.out.println("December");
        break;*/
        default: System.out.println("Invalid Month");
        break;
        }
        System.out.println();
    }
}
