
package findthenearestpoint;

import java.util.ArrayList;

public class FindTheNearestPoint {

    public static void main(String[] args) {
         int numPoints = 8;
        double[][] points = {{0, 0, 1}, {1, 1, -1}, {2, 2, -2},
                            {-2, -2, 2}, {-3, -3, -3}, {-4, -4, -4},
                            {5, 5, 5}};

        double[][] closestPairs = findNearestPoints(points);

        if (closestPairs != null && !closestPairs.isEmpty()) {
            System.out.println("The closest " + closestPairs.size() + " pairs are:");
            for (double[][] pair : closestPairs) {
                System.out.println("(" + pair[0][0] + ", " + pair[0][1] + ", " + pair[0][2] + ") and (" + pair[1][0] + ", " +
pair[1][1] + ", " + pair[1][2] + ")");
            }
        } else {
            System.out.println("No closest pairs found.");
        }
    }

    public static double[][] findNearestPoints(double[][] points) {
        if (points == null || points.length < 2) {
            throw new IllegalArgumentException("At least two points are required.");
        }

        int numPoints = points.length;
        ArrayList<double[]> minPairs = new ArrayList<>();
        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < numPoints; i++) {
            for (int j = i + 1; j < numPoints; j++) {
                double distance = calculateDistance(points[i], points[j]);
                if (distance < minDistance) {
                    minPairs.clear();
                    minPairs.add(new double[]{points[i], points[j]});
                    minDistance = distance;
                } else if (distance == minDistance) {
                    minPairs.add(new double[]{points[i], points[j]});
                }
            }
        }

        return minPairs.toArray(new double[minPairs.size()][]);
    }

    public static double calculateDistance(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));




    }
    
}
