import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Hotel {
    private String name;
    private int cleanlinessRating;
    private int facilityRating;
    private int rentPerNight;
    private int overallRating;

    public Hotel(String name, int cleanlinessRating, int facilityRating, int rentPerNight) {
        this.name = name;
        this.cleanlinessRating = cleanlinessRating;
        this.facilityRating = facilityRating;
        this.rentPerNight = rentPerNight;
        this.overallRating = calculateOverallRating();
    }

    private int calculateOverallRating() {
        int rating = cleanlinessRating + facilityRating;
        if (rating >= 8) {
            return 5;
        } else if (rating >= 4) {
            return 3;
        } else {
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public int getRentPerNight() {
        return rentPerNight;
    }
}

public class HotelRatingSorter {
    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();

        try {
            File file = new File("src/hotels.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t");

                if (parts.length == 4) {
                    String name = parts[0];
                    int cleanlinessRating = Integer.parseInt(parts[1]);
                    int facilityRating = Integer.parseInt(parts[2]);
                    int rentPerNight = Integer.parseInt(parts[3]);
                    Hotel hotel = new Hotel(name, cleanlinessRating, facilityRating, rentPerNight);
                    hotels.add(hotel);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: hotels.txt");
            return;
        }

        // Sort hotels by overall rating in descending order and rent price per night in ascending order
        Collections.sort(hotels, (hotel1, hotel2) -> {
            if (hotel1.getOverallRating() != hotel2.getOverallRating()) {
                return Integer.compare(hotel2.getOverallRating(), hotel1.getOverallRating());
            } else {
                return Integer.compare(hotel2.getRentPerNight(), hotel1.getRentPerNight());
            }
        });

        // Print sorted hotels
        System.out.println("Hotel\tOverall rating\tRent price");
        for (Hotel hotel : hotels) {
            String rating = getRatingText(hotel.getOverallRating());
            System.out.println(hotel.getName() + "\t" + rating + "\t\t" + hotel.getRentPerNight());
        }
    }

    private static String getRatingText(int overallRating) {
        if (overallRating == 5) {
            return "5 star";
        } else if (overallRating == 3) {
            return "3 star";
        } else {
            return "1 star";
        }
    }
}

