import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng thành phố: ");
        int numOfCities = scanner.nextInt();
        City[] cities = new City[numOfCities];

        for (int i = 0; i < numOfCities; i++) {
            System.out.println("---------------------------------------\nNhập thông tin thành phố: ");
            System.out.print("Tên thành phố: ");
            String name = scanner.next();
            System.out.print("Tọa độ x thành phố: ");
            int x = scanner.nextInt();
            System.out.print("Tọa độ y thành phố: ");
            int y = scanner.nextInt();
            City city = new City(x,y,name);
            cities[i] = city;
        }

        List<City> road = TSP_Solve.nearestNeighborTSP(cities);
        System.out.print("Hành trình đi: ");
        for (int i = 0; i < road.size() - 1; i++) {
            System.out.print(road.get(i).getName() + "  -->  ");
        }
        System.out.println(road.get(road.size() - 1).getName());
    }
}