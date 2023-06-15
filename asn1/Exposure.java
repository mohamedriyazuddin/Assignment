package edu.disease.asn1;
import java.util.Objects;
import java.time.LocalDateTime;
import java.util.UUID;
public class Exposure {
	 private UUID patientid;
	    private LocalDateTime datetime;
	    private String exposuretype;
	    
	    public UUID getPatientid() {
			return patientid;
		}

		public void setPatientid(UUID patientid) {
			this.patientid = patientid;
		}

		public LocalDateTime getDatetime() {
			return datetime;
		}

		public void setDatetime(LocalDateTime datetime) {
			this.datetime = datetime;
		}

		public String getExposuretype() {
			return exposuretype;
		}

		public void setExposuretype(String exposuretype) {
			this.exposuretype = exposuretype;
		}
		 public void setExposureType(String exposuretype) {
		        if ("D".equals(exposuretype) || "I".equals(exposuretype)) {
		            this.exposuretype = exposuretype;
		        } else {
		            throw new IllegalArgumentException("Exposure Type Should be Either Direct or Indirect Exposure");
		        }
		    }
		public int hashCode() {
	        return Objects.hash(patientid, datetime);
	    }
		 public boolean equals(Object ob) {
		        if (this == ob) 
		            return true;
	
		        if (!(ob instanceof Exposure))
		        	return false;
		        Exposure exposure = (Exposure) ob;
		        return Objects.equals(patientid, exposure.patientid) && Objects.equals(datetime, exposure.datetime);
		    }

		public String toString() {
	        return  "patientId=" + patientid +", dateTime=" + datetime +", exposureType=" + exposuretype;
	    }

}
