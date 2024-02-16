import java.util.ArrayList;
import java.util.List;

public class TSP_Solve {
    public static List<City> nearestNeighborTSP (City[] cities) {
        int numOfCities = cities.length;
        List<City> road = new ArrayList<>();

        int currentCity = 0; // Chọn thành phố đầu tiên làm điểm xuất phát
        road.add(cities[currentCity]);
        cities[currentCity].setVisited(true);

        while (road.size() < numOfCities) {
            int nearestCity = -1;
            double minDistance = Double.MAX_VALUE;

            for (int i = 0; i < numOfCities; i++) {
                if (!cities[i].isVisited()) {
                    double dist = cities[currentCity].distanceToOtherCity(cities[i]);
                    if (dist < minDistance) {
                        minDistance = dist;
                        nearestCity = i;
                    }
                }
            }

            road.add(cities[nearestCity]);
            cities[nearestCity].setVisited(true);
            currentCity = nearestCity;
        }

        road.add(road.get(0));

        return road;
    }
}
