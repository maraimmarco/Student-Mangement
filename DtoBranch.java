/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

/**
 *
 * @author Resal
 */
public class DtoBranch {
    private int BranchId;
    private String City;
    private String Address;

    public DtoBranch(int BranchId, String City, String Address) {
        this.BranchId = BranchId;
        this.City = City;
        this.Address = Address;
    }
    public DtoBranch(String City,String Address){
        this.City=City;
        this.Address=Address;
    }

    public int getBranchId() {
        return BranchId;
    }

    public void setBranchId(int BranchId) {
        this.BranchId = BranchId;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
}
