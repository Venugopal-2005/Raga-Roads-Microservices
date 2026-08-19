package com.ragaroads.controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/concerts")
public class ConcertController {
    @GetMapping("/{concertId}")
    public Map<String, Object> getConcert(@PathVariable Long concertId) {
        Map<String, Object> concert = new HashMap<>();
        switch (concertId.intValue()) {
            case 1:
                concert.put("concertId", 1);
                concert.put("concertTitle", "Corporate Night Chennai");
                concert.put("concertDate", "2026-08-01");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Chennai");
                concert.put("concertState", "Tamil Nadu");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Singer-Male");
                concert.put("budgetAllocated", 15000);
                break;
            case 2:
                concert.put("concertId", 2);
                concert.put("concertTitle", "Wedding Reception Chennai");
                concert.put("concertDate", "2026-08-05");
                concert.put("concertTime", "19:00");
                concert.put("concertCity", "Chennai");
                concert.put("concertState", "Tamil Nadu");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Singer-Female");
                concert.put("budgetAllocated", 12000);
                break;
            case 3:
                concert.put("concertId", 3);
                concert.put("concertTitle", "Infosys Annual Day");
                concert.put("concertDate", "2026-08-08");
                concert.put("concertTime", "18:30");
                concert.put("concertCity", "Bangalore");
                concert.put("concertState", "Karnataka");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Guitarist");
                concert.put("budgetAllocated", 10000);
                break;
            case 4:
                concert.put("concertId", 4);
                concert.put("concertTitle", "Tech Summit");
                concert.put("concertDate", "2026-08-10");
                concert.put("concertTime", "17:00");
                concert.put("concertCity", "Bangalore");
                concert.put("concertState", "Karnataka");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Drummer");
                concert.put("budgetAllocated", 9000);
                break;
            case 5:
                concert.put("concertId", 5);
                concert.put("concertTitle", "Music Fest Hyderabad");
                concert.put("concertDate", "2026-08-12");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Hyderabad");
                concert.put("concertState", "Telangana");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Keyboardist");
                concert.put("budgetAllocated", 11000);
                break;
            case 6:
                concert.put("concertId", 6);
                concert.put("concertTitle", "Cultural Event Pune");
                concert.put("concertDate", "2026-08-15");
                concert.put("concertTime", "18:30");
                concert.put("concertCity", "Pune");
                concert.put("concertState", "Maharashtra");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Flutist");
                concert.put("budgetAllocated", 13000);
                break;
            case 7:
                concert.put("concertId", 7);
                concert.put("concertTitle", "Startup Meetup Mumbai");
                concert.put("concertDate", "2026-08-18");
                concert.put("concertTime", "19:00");
                concert.put("concertCity", "Mumbai");
                concert.put("concertState", "Maharashtra");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Tablist");
                concert.put("budgetAllocated", 8000);
                break;
            case 8:
                concert.put("concertId", 8);
                concert.put("concertTitle", "Corporate Event Delhi");
                concert.put("concertDate", "2026-08-20");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Delhi");
                concert.put("concertState", "Delhi");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Singer-Male");
                concert.put("budgetAllocated", 16000);
                break;
            case 9:
                concert.put("concertId", 9);
                concert.put("concertTitle", "Leadership Summit Kochi");
                concert.put("concertDate", "2026-08-22");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Kochi");
                concert.put("concertState", "Kerala");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Singer-Female");
                concert.put("budgetAllocated", 12000);
                break;
            case 10:
                concert.put("concertId", 10);
                concert.put("concertTitle", "Festival Mysore");
                concert.put("concertDate", "2026-08-25");
                concert.put("concertTime", "19:00");
                concert.put("concertCity", "Mysore");
                concert.put("concertState", "Karnataka");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Guitarist");
                concert.put("budgetAllocated", 10000);
                break;
            case 11:
                concert.put("concertId", 11);
                concert.put("concertTitle", "Concert Coimbatore");
                concert.put("concertDate", "2026-08-28");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Coimbatore");
                concert.put("concertState", "Tamil Nadu");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Drummer");
                concert.put("budgetAllocated", 9000);
                break;
            case 12:
                concert.put("concertId", 12);
                concert.put("concertTitle", "Corporate Vizag");
                concert.put("concertDate", "2026-09-01");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Visakhapatnam");
                concert.put("concertState", "Andhra Pradesh");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Keyboardist");
                concert.put("budgetAllocated", 10000);
                break;
            case 13:
                concert.put("concertId", 13);
                concert.put("concertTitle", "Wedding Jaipur");
                concert.put("concertDate", "2026-09-05");
                concert.put("concertTime", "19:00");
                concert.put("concertCity", "Jaipur");
                concert.put("concertState", "Rajasthan");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Flutist");
                concert.put("budgetAllocated", 14000);
                break;
            case 14:
                concert.put("concertId", 14);
                concert.put("concertTitle", "Festival Lucknow");
                concert.put("concertDate", "2026-09-08");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Lucknow");
                concert.put("concertState", "Uttar Pradesh");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Tablist");
                concert.put("budgetAllocated", 8000);
                break;
            case 15:
                concert.put("concertId", 15);
                concert.put("concertTitle", "Corporate Chandigarh");
                concert.put("concertDate", "2026-09-10");
                concert.put("concertTime", "18:30");
                concert.put("concertCity", "Chandigarh");
                concert.put("concertState", "Punjab");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Singer-Male");
                concert.put("budgetAllocated", 15000);
                break;
            case 16:
                concert.put("concertId", 16);
                concert.put("concertTitle", "Tech Event Indore");
                concert.put("concertDate", "2026-09-12");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Indore");
                concert.put("concertState", "Madhya Pradesh");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Singer-Female");
                concert.put("budgetAllocated", 12000);
                break;
            case 17:
                concert.put("concertId", 17);
                concert.put("concertTitle", "Public Concert Goa");
                concert.put("concertDate", "2026-09-15");
                concert.put("concertTime", "19:00");
                concert.put("concertCity", "Panaji");
                concert.put("concertState", "Goa");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Guitarist");
                concert.put("budgetAllocated", 12000);
                break;
            case 18:
                concert.put("concertId", 18);
                concert.put("concertTitle", "Music Night Surat");
                concert.put("concertDate", "2026-09-18");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Surat");
                concert.put("concertState", "Gujarat");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Drummer");
                concert.put("budgetAllocated", 9000);
                break;
            case 19:
                concert.put("concertId", 19);
                concert.put("concertTitle", "Business Meet Nagpur");
                concert.put("concertDate", "2026-09-20");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Nagpur");
                concert.put("concertState", "Maharashtra");
                concert.put("strategyType", "BALANCED");
                concert.put("artistRole", "Keyboardist");
                concert.put("budgetAllocated", 10000);
                break;
            case 20:
                concert.put("concertId", 20);
                concert.put("concertTitle", "Annual Function Patna");
                concert.put("concertDate", "2026-09-25");
                concert.put("concertTime", "18:00");
                concert.put("concertCity", "Patna");
                concert.put("concertState", "Bihar");
                concert.put("strategyType", "AVAILABILITY");
                concert.put("artistRole", "Flutist");
                concert.put("budgetAllocated", 13000);
                break;
            default:
                concert.put("message", "Concert Not Found");
        }
        return concert;
    }
}
