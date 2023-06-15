package edu.disease.asn1;
import java.util.Objects;
import java.util.UUID;
public class Desiase {
	
	
	
	private String name;
	private UUID diseaseid;
	
	public UUID getDiseaseid() {
		return diseaseid;
	}
	public void setDiseaseid(UUID diseaseid) {
		this.diseaseid = diseaseid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int hashCode() {
	   
		return Objects.hash(diseaseid);
	}
	public boolean equals(Object ob) {
        if (this == ob) return true;
        if (!(ob instanceof Desiase)) return false;
        Desiase disease = (Desiase) ob;
        return diseaseid.equals(disease.diseaseid);
    }
	 public String toString() {
	        return "diseaseid=" + diseaseid +  ", name=" + name ;
	    }

}
