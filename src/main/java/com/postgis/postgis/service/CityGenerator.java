package com.postgis.postgis.service;

import java.util.List;
import java.util.Random;

public class CityGenerator {

    private static final List<String> CITIES = List.of(
        "Ulaanbaatar", "Reykjavik", "Port Moresby", "Antananarivo", "Nouakchott",
        "Thimphu", "Asmara", "Chisinau", "Bandar Seri Begawan", "Suva",
        "Dushanbe", "Gaborone", "Valparaíso", "Yerevan", "Phnom Penh",
        "Tbilisi", "Vilnius", "Tallinn", "Riga", "Skopje",
        "Podgorica", "Ljubljana", "Sarajevo", "Belmopan", "Roseau",
        "Castries", "Bridgetown", "Apia", "Nukuʻalofa", "Tarawa",
        "Majuro", "Funafuti", "Malé", "Colombo", "Kathmandu",
        "Lusaka", "Lilongwe", "Bujumbura", "Kigali", "Brazzaville",
        "Libreville", "Lomé", "Cotonou", "Ouagadougou", "Niamey",
        "Bamako", "Conakry", "Freetown", "Monrovia", "Dakar",
        "Praia", "Bissau", "Paramaribo", "Georgetown", "La Paz",
        "Quito", "Bogotá", "Caracas", "San Salvador", "Managua",
        "San José", "Panama City", "Havana", "Kingston", "Port-au-Prince",
        "Windhoek", "Maputo", "Harare", "Dar es Salaam", "Kampala",
        "Accra", "Abuja", "Yaoundé", "Kinshasa", "Addis Ababa",
        "Khartoum", "Juba", "Doha", "Muscat", "Kuwait City",
        "Amman", "Damascus", "Beirut", "Tunis", "Algiers",
        "Rabat", "Tripoli", "Mogadishu", "Sana’a", "Tehran",
        "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
        "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"
    );

    private static final Random RANDOM = new Random();

    public static String randomCity() {
        return CITIES.get(RANDOM.nextInt(CITIES.size()));
    }
}