public class City {
    private int x;
    private int y;
    private String name;

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    private boolean isVisited;

    public City() {}

    public City(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.isVisited = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public double distanceToOtherCity(City otherCity) {
        int dx = x - otherCity.getX();
        int dy = y - otherCity.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
