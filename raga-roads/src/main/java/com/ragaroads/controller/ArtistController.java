//package com.ragaroads.artistservice;
//Changed to
package com.ragaroads.controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/artists")
public class ArtistController {
    @GetMapping("/{artistId}")
    public Map<String, Object> getArtist(@PathVariable Long artistId) {
        Map<String, Object> artist = new HashMap<>();
        switch (artistId.intValue()) {
            case 1:
                artist.put("artistId", 1);
                artist.put("artistName", "Arjun");
                artist.put("artistRole", "Singer-Male");
                artist.put("city", "Chennai");
                artist.put("state", "Tamil Nadu");
                artist.put("performanceCost", 12000);
                artist.put("available", true);
                break;
            case 2:
                artist.put("artistId", 2);
                artist.put("artistName", "Rahul");
                artist.put("artistRole", "Singer-Male");
                artist.put("city", "Bangalore");
                artist.put("state", "Karnataka");
                artist.put("performanceCost", 15000);
                artist.put("available", true);
                break;
            case 3:
                artist.put("artistId", 3);
                artist.put("artistName", "Priya");
                artist.put("artistRole", "Singer-Female");
                artist.put("city", "Chennai");
                artist.put("state", "Tamil Nadu");
                artist.put("performanceCost", 10000);
                artist.put("available", true);
                break;
            case 4:
                artist.put("artistId", 4);
                artist.put("artistName", "Megha");
                artist.put("artistRole", "Singer-Female");
                artist.put("city", "Hyderabad");
                artist.put("state", "Telangana");
                artist.put("performanceCost", 12000);
                artist.put("available", false);
                break;
            case 5:
                artist.put("artistId", 5);
                artist.put("artistName", "Karthik");
                artist.put("artistRole", "Guitarist");
                artist.put("city", "Bangalore");
                artist.put("state", "Karnataka");
                artist.put("performanceCost", 9000);
                artist.put("available", true);
                break;
            case 6:
                artist.put("artistId", 6);
                artist.put("artistName", "Vikram");
                artist.put("artistRole", "Guitarist");
                artist.put("city", "Mumbai");
                artist.put("state", "Maharashtra");
                artist.put("performanceCost", 11000);
                artist.put("available", true);
                break;
            case 7:
                artist.put("artistId", 7);
                artist.put("artistName", "Rohit");
                artist.put("artistRole", "Drummer");
                artist.put("city", "Delhi");
                artist.put("state", "Delhi");
                artist.put("performanceCost", 8500);
                artist.put("available", true);
                break;
            case 8:
                artist.put("artistId", 8);
                artist.put("artistName", "Amit");
                artist.put("artistRole", "Drummer");
                artist.put("city", "Pune");
                artist.put("state", "Maharashtra");
                artist.put("performanceCost", 9500);
                artist.put("available", false);
                break;
            case 9:
                artist.put("artistId", 9);
                artist.put("artistName", "Manoj");
                artist.put("artistRole", "Keyboardist");
                artist.put("city", "Hyderabad");
                artist.put("state", "Telangana");
                artist.put("performanceCost", 10000);
                artist.put("available", true);
                break;
            case 10:
                artist.put("artistId", 10);
                artist.put("artistName", "Suresh");
                artist.put("artistRole", "Keyboardist");
                artist.put("city", "Chennai");
                artist.put("state", "Tamil Nadu");
                artist.put("performanceCost", 11000);
                artist.put("available", true);
                break;
            case 11:
                artist.put("artistId", 11);
                artist.put("artistName", "Naveen");
                artist.put("artistRole", "Flutist");
                artist.put("city", "Mysore");
                artist.put("state", "Karnataka");
                artist.put("performanceCost", 12000);
                artist.put("available", true);
                break;
            case 12:
                artist.put("artistId", 12);
                artist.put("artistName", "Kiran");
                artist.put("artistRole", "Flutist");
                artist.put("city", "Coimbatore");
                artist.put("state", "Tamil Nadu");
                artist.put("performanceCost", 13000);
                artist.put("available", true);
                break;
            case 13:
                artist.put("artistId", 13);
                artist.put("artistName", "Ramesh");
                artist.put("artistRole", "Tablist");
                artist.put("city", "Mumbai");
                artist.put("state", "Maharashtra");
                artist.put("performanceCost", 7000);
                artist.put("available", true);
                break;
            case 14:
                artist.put("artistId", 14);
                artist.put("artistName", "Sanjay");
                artist.put("artistRole", "Tablist");
                artist.put("city", "Jaipur");
                artist.put("state", "Rajasthan");
                artist.put("performanceCost", 8000);
                artist.put("available", true);
                break;
            default:
                artist.put("message", "Artist Not Found");
        }
        return artist;
    }
}
