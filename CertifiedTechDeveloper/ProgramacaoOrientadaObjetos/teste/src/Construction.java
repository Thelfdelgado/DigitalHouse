import java.util.Date;

public class Construction {
    private String address;
    private Date startingDate;
    private Date expectedDate;
    private Date endingDate = null;

    public Construction(String address, Date startingDate, Date expectedDate) {
        this.address = address;
        this.startingDate = startingDate;
        this.expectedDate = expectedDate;
    }

    public String getAddress() {
        return address;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
    
    @Override
    public String toString() {
        return "Construction{" +
                "address='" + address + '\'' +
                ", startingDate=" + startingDate +
                ", expectedDate=" + expectedDate +
                '}';
    }
    
    public void finishConstruction(Date date) {
        this.endingDate = date;
    }
}
