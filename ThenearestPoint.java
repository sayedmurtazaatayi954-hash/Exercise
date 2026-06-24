
package thenearestpoint;

public class ThenearestPoint {

    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                            {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
                            {-1.5, 4, 2}, {5.5, 4, -0.5}};

        double[] nearestPoint1 = findNearestPoints(points)[0];
        double[] nearestPoint2 = findNearestPoints(points)[1];

        System.out.println("Nearest points:");
        System.out.println("Point 1: (" + nearestPoint1[0] + ", " + nearestPoint1[1] + ", " + nearestPoint1[2] + ")");
        System.out.println("Point 2: (" + nearestPoint2[0] + ", " + nearestPoint2[1] + ", " + nearestPoint2[2] + ")");
    }

    public static double[][] findNearestPoints(double[][] points) {
        if (points == null || points.length < 2) {
            throw new IllegalArgumentException("At least two points are required.");
        }

        int numPoints = points.length;
        double[][] distances = new double[numPoints][numPoints];
        for (int i = 0; i < numPoints; i++) {
            for (int j = i + 1; j < numPoints; j++) {
                distances[i][j] = calculateDistance(points[i], points[j]);
                distances[j][i] = distances[i][j]; // Ensure the matrix is symmetric
            }
        }

        int minIndex = 0;
        for (int i = 1; i < numPoints; i++) {
            if (distances[minIndex][i] > distances[i][minIndex]) {
               minIndex = i;
            }
        }

        double[] nearestPoint1 = points[minIndex];
        int secondMinIndex = -1;
        for (int i = 0; i < numPoints; i++) {
            if (distances[minIndex][i] == distances[i][minIndex]) {
                if (secondMinIndex == -1 || distances[secondMinIndex][i] > distances[minIndex][i]) {
                    secondMinIndex = i;
                }
            }
       }

        double[] nearestPoint2 = points[secondMinIndex];
        return new double[][]{{nearestPoint1}, {nearestPoint2}};
    }

    public static double calculateDistance(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));        
    
    
    

    }
    
}
