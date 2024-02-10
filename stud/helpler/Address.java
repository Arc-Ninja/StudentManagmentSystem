
package stud.helpler;
import java.io.Serializable;
public class Address implements Serializable{
    protected String loacation;
    protected String city;
    protected String distric;
    protected String state;
    protected String country;
    protected int zipcode;
    public Address(String loacation, String city, String distric, String state, String country, int zipcode){
        try{
            if(loacation!=null||city!=null||distric!=null||state!=null||country!=null||zipcode>0){
                this.loacation = loacation;
                this.city = city;
                this.distric = distric;
                this.state = state;
                this.country = country;
                this.zipcode = zipcode;
            }else{
                throw new Exception("Invalid Address format");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getAddress(){
        try{
            return (loacation + city + distric +state + country + String.valueOf(zipcode));
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }
    public String getLoacation() {
        return this.loacation;
    }
    public String getCity() {
        return this.city;
    }
    public String getDistric() {
        return this.distric;
    }
    public String getState(){
        return this.state;
    }
    public String getCountry(){
        return this.country;
    }
    public int getZipcode() {
        return this.zipcode;
    }
    public boolean setLocation(String loacation){
        try{
            this.loacation=loacation;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean setCity(String city){
        try{
            this.city=city;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setDistric(String distric){
        try{
            this.distric=distric;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setState(String state){
        try{
            this.state=state;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setCountry(String country){
        try{
            this.country=country;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setZipcode(int zipcode){
        try{
            this.zipcode=zipcode;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setAddress(String loacation,String city,String distric,String state,String country,int zipcode){
        try{
            this.loacation = loacation;
            this.city = city;
            this.distric=distric;
            this.state=state;
            this.country=country;
            this.zipcode=zipcode;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setAddress(Address address){
        try{
            this.loacation = address.getLoacation();
            this.city = address.getCity();
            this.distric=address.getDistric();
            this.state=address.getCity();
            this.country=address.getCountry();
            this.zipcode=address.getZipcode();
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
