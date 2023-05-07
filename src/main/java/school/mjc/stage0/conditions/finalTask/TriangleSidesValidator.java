package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        int ans = (firstSide + secondSide > thirdSide) && (secondSide + thirdSide > firstSide) && (firstSide + thirdSide > secondSide) ? 1 : 0;
        switch (ans) {
            case 1 -> System.out.println("this is a valid triangle");
            case 0 -> System.out.println("it's not a triangle");
        }
    }
}
