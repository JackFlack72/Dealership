package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class DealershipFileManager {

    /*
    Line,Field 1,Field 2,Field 3,Field 4,Field 5,Field 6,Field 7,Field 8
    Line 1,Name,Address,Phone
    Vehicle,VIN/ID,Year,Make,Model,Type,Color,Mileage,Price
     */
    public Dealership getDealership() {
        Dealership dealership = null; // List to hold loaded objects.
        int lineNumber = 0; // Tracks the line number for special handling of Line 1 (dealership info)
        try {
            // File I/O Setup (Read)
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            // Loop to process every line in the file
            while ((line = bufferedReader.readLine()) != null) {
                // Splits the line using the pipe character '|' as a delimiter.
                String[] parts = line.split(Pattern.quote("|"));
                //line 1 is Dealership information
                if (lineNumber == 0) {
                    // Set Data
                    String name = (parts[0]);
                    String address = (parts[1]);
                    String phone = (parts[2]);

                    // Create Object
                    dealership = new Dealership(name, address, phone);
                } else if (dealership != null) { //need to guarantee the dealership variable is created
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int mileage = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, mileage, price);
                    dealership.addVehicle(vehicle);
                }
                lineNumber++;
            }
            bufferedReader.close(); // Close the reader (essential step).
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dealership;// Returns the list of all transactions loaded from the file.
    }

    public void saveDealership(Dealership dealership) {

    }
}

