package user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public int id;
    public String name;
    public String username;
    public String email;
    public Address address;
    public String phone;
    public String website;
    public Company company;
    class Address{
        public String street;
        public String suite;
        public String city;
        public String zipcode;
        public Geo geo;
    }
    class Company{
        public String name;
        public String catchPhrase;
        public String bs;
    }
    public class Geo{
        public String lat;
        public String lng;
    }
}
