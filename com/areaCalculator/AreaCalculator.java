import java.util.*;
import java.io.*;
import java.math.*;

public class AreaCalculator{
    //First 1000 decimal places of pi
    final static BigDecimal pi = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989");
    final static BigDecimal const3=new BigDecimal("3");
    final static BigDecimal const2=new BigDecimal("2");
    final static BigDecimal const4=new BigDecimal("4");
    final static BigDecimal const6=new BigDecimal("6");
    public static void main(String[] args) {
        enterShape();
    }
    static void enterShape(){
        System.out.println("""
                Enter number of the shape:
                1. Cube
                2. Cuboid
                3. Cone
                4. Cylinder
                5. Sphere
                6. Hemisphere
                """);
        int operator=OperatorInput();
        switch (operator){
            case 1:
                System.out.println("Enter side of the cube");
                BigDecimal sideCube=BigDecimalInput();
                BigDecimal volume=(sideCube.multiply(sideCube)).multiply(const6);
                System.out.println(volume);
                break;
            case 2:
                System.out.println("Enter length of the cuboid");
                BigDecimal lengthCube=BigDecimalInput();
                System.out.println("Enter breadth of the cuboid");
                BigDecimal breadthCube=BigDecimalInput();
                System.out.println("Enter height of the cuboid");
                BigDecimal heightCube=BigDecimalInput();
                BigDecimal lb=lengthCube.multiply(breadthCube);
                BigDecimal bh=heightCube.multiply(breadthCube);
                BigDecimal lh=heightCube.multiply(lengthCube);
                BigDecimal volume1=lb.add(bh).add(lh);
                System.out.println(volume1);
                break;
            case 3:
                System.out.println("Enter radius of the cone");
                BigDecimal radiusCone=BigDecimalInput();
                System.out.println("Enter slant height of the cone");
                BigDecimal heightCone=BigDecimalInput();
                BigDecimal hr=heightCone.add(radiusCone);
                BigDecimal volume2=(((radiusCone.multiply(hr)).multiply(pi)));
                System.out.println(volume2);
                break;
            case 4:
                System.out.println("Enter radius of the Cylinder");
                BigDecimal radiusCylinder=BigDecimalInput();
                System.out.println("Enter height of the Cylinder");
                BigDecimal heightCylinder=BigDecimalInput();
                BigDecimal hr1=radiusCylinder.add(heightCylinder);
                BigDecimal volume3=((radiusCylinder.multiply(hr1)).multiply(pi));
                System.out.println(volume3);
                break;
            case 5:
                System.out.println("Enter radius of the Sphere");
                BigDecimal radiusSphere=BigDecimalInput();
                BigDecimal volume4=(((radiusSphere.multiply(radiusSphere))).
                        multiply(pi)).multiply(const4);
                System.out.println(volume4);
                break;
            case 6:
                System.out.println("Enter radius of the Hemisphere");
                BigDecimal radiusHemisphere=BigDecimalInput();
                BigDecimal volume5=((radiusHemisphere.multiply(radiusHemisphere)).
                        multiply(pi)).multiply(const3);
                System.out.println(volume5);
                break;
            default:
        }
    }
    public static int OperatorInput() {
        Scanner scanner2 = new Scanner(System.in);
        int random;
        if (scanner2.hasNextInt()) {
            random = scanner2.nextInt();
            return random;
        } else {
            System.out.println("Enter number again:");
            return OperatorInput();
        }
    }
    public static BigDecimal BigDecimalInput() {
        Scanner scanner1 = new Scanner(System.in);
        BigDecimal random;
        if (scanner1.hasNextBigDecimal()) {
            random = scanner1.nextBigDecimal();
            if (random.compareTo(BigDecimal.ZERO)<=0){
                System.out.println("Enter BigDecimal again");
                return BigDecimalInput();}
            return random;
        } else {
            System.out.println("Enter BigDecimal again");
            return BigDecimalInput();
        }
    }
}