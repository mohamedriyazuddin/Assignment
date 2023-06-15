package edu.disease.asn1;


import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;


public class Patient {
	private UUID patientid;
    private String firstname;
    private String lastname;
    private Exposure[] exposure;
    private UUID[] diseaseid;
	public UUID getPatientid() {
		return patientid;
	}
	public void setPatientid(UUID patientid) {
		this.patientid = patientid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Exposure[] getExposure() {
		return exposure;
	}
	public void setExposure(Exposure[] exposure) {
		this.exposure = exposure;
	}
	public UUID[] getDiseaseid() {
		return diseaseid;
	}
	public void setDiseaseid(UUID[] diseaseid) {
		this.diseaseid = diseaseid;
	}
	 public Patient(int maxDiseases, int maxExposures) throws IllegalArgumentException {
	        if (maxDiseases < 0 || maxExposures < 0) {
	        	throw new IllegalArgumentException("maxDiseases/maxExposure cannot be less Zero , as it is not able to intialize size");
	        } else {
	            this.diseaseid = new UUID[maxDiseases];
	            this.exposure = new Exposure[maxExposures];
	        }
	    }
	 public void addDiseaseId(UUID diseaseId) {
	    	boolean checkIndex = false;
	    	for(int i = 0; i < diseaseid.length-1; i++){
	    	    if(diseaseid[i] == null){
	    	    	diseaseid[i] = diseaseId;
	    	    	checkIndex = true;
	    	    	break;
	    	    }
	    	}
	    	if(checkIndex == false){
	            throw new IndexOutOfBoundsException("There is no space in array");
	    	}
	    }
	 public void addExposure(Exposure exposureOb) {
	    	boolean checkIndex = false;
	    	for(int i = 0; i < exposure.length; i++){
	    	    if(exposure[i] == null){
	    	    	exposure[i] = exposureOb;
	    	    	checkIndex = true;
	    	    	break;
	    	    }
	    	}
	    	if(checkIndex == false){
	    	     throw new IndexOutOfBoundsException("There is no space in array");
	 	    	}
	    }
	
	public int hashCode() {
		   
		return Objects.hash(patientid);
	}
	@Override
	public String toString() {
		return  "patientid=" + patientid +", firstName=" + firstname + ", lastName=" + lastname +
                ", exposure=" + Arrays.toString(exposure) +
                ", diseaseid=" + Arrays.toString(diseaseid);
	}
}
