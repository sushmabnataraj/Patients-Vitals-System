/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_part3;

/**
 *
 * @author sushm
 */
public class VitalSigns {
    
    private int ageGroup;
    private int respiratoryRate;
    private int heartRate;
    private int sysBloodPressure;
    private double weightInKgs;
    private  boolean isRecent;
    
    public boolean getIsIsRecent() {
        return isRecent;
    }

    public void setIsRecent(boolean isRecent) {
        this.isRecent = isRecent;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSysBloodPressure() {
        return sysBloodPressure;
    }

    public void setSysBloodPressure(int sysBloodPressure) {
        this.sysBloodPressure = sysBloodPressure;
    }

    public double getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
    }
    
    
    
     public boolean isThisVitalSignNormal(String selectedVitalSignName) {
       

        switch (selectedVitalSignName) {

            case "RespiratoryRate":
                return respiratoryRateNorm();           

            case "HeartRate":
                return heartRateNorm();

            case "SysBloodPressure":
                return bloodPressureNorm();

            case "WeightInKgs":
                return weightInKgsNorm();
                
        }

        return false;
    }
    
    private boolean respiratoryRateNorm() {
        int ageGroup = this.getAgeGroup();        
        int respiratoryRate = this.getRespiratoryRate();
        
        if (ageGroup == 0) {
            if (respiratoryRate >= 30 && respiratoryRate <= 50) {
                System.out.println("\nRespiratory Rate : " +  respiratoryRate);
                System.out.println("Respiratory Rate is normal");
                return true;
            } else {
            System.out.println("\nRespiratory Rate  : " +  respiratoryRate);
            System.out.println("Respiratory Rate is abnormal");
            return false;
            }
        } else if (ageGroup == 1) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("\nRespiratory Rate : " +  respiratoryRate);
                System.out.println("Respiratory Rate is normal");
                return true;
            }
            System.out.println("\nRespiratory Rate  : " +  respiratoryRate);
            System.out.println("Respiratory Rate is abnormal");
            return false;
        } else if (ageGroup > 1 && ageGroup <= 3) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("\nRespiratory Rate : " +  respiratoryRate);
                System.out.println("Respiratory Rate is normal");
                return true;
            } else {
            System.out.println("\nRespiratory Rate  : " +  respiratoryRate);
            System.out.println("Respiratory Rate is abnormal");
            return false;
            }
        } else if (ageGroup > 3 && ageGroup <= 5) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("\nRespiratory Rate : " +  respiratoryRate);
                System.out.println("Respiratory Rate is normal");
                return true;
            }
            System.out.println("\nRespiratory Rate  : " +  respiratoryRate);
            System.out.println("Respiratory Rate is abnormal");
            return false;
        } else if (ageGroup >= 6 && ageGroup <= 12) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("\nRespiratory Rate : " +  respiratoryRate);
                System.out.println("Respiratory Rate is normal");
                return true;
            }
            System.out.println("\nRespiratory Rate  : " +  respiratoryRate);
            System.out.println("Respiratory Rate is abnormal");
            return false;
        } else {
            if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                System.out.println("\nRespiratory Rate : " +  respiratoryRate);
                System.out.println("Respiratory Rate is normal");
                return true;
            }
            System.out.println("\nRespiratory Rate  : " +  respiratoryRate);
            System.out.println("Respiratory Rate is abnormal");
            return false;
        }

    }

    private boolean heartRateNorm() {
        int ageGroup = this.getAgeGroup();
        int heartRate = this.getHeartRate();

        if (ageGroup == 0) {
            if (heartRate >= 120 && heartRate <= 160) {
                System.out.println("\nHeart Rate : " + heartRate);
                System.out.println("Heart Rate is normal");
                return true;
            }
            System.out.println("\nHeart Rate : " + heartRate);
            System.out.println("Heart Rate is abnormal");
            return false;
        } else if (ageGroup == 1) {
            if (heartRate >= 80 && heartRate <= 140) {
                System.out.println("\nHeart Rate : " + heartRate);
                System.out.println("Heart Rate is normal");
                return true;
            }
            System.out.println("\nHeart Rate : " +  heartRate);
            System.out.println("Heart Rate is abnormal");
            return false;
        } else if (ageGroup > 1 && ageGroup <= 3) {
            if (heartRate >= 80 && heartRate <= 130) {
                System.out.println("\nHeart Rate : " +  heartRate);
                System.out.println("Heart Rate is normal");
                return true;
            }
            System.out.println("\nHeart Rate : " +  heartRate);
            System.out.println("Heart Rate is abnormal");
            return false;
        } else if (ageGroup > 3 && ageGroup <= 5) {
            if (heartRate >= 80 && heartRate <= 120) {
                System.out.println("\nHeart Rate : " +  heartRate);
                System.out.println("Heart Rate is normal");
                return true;
            }
            System.out.println("\nHeart Rate : " +  heartRate);
            System.out.println("Heart Rate is abnormal");
            return false;
        } else if (ageGroup >= 6 && ageGroup <= 12) {
            if (heartRate >= 70 && heartRate <= 110) {
                System.out.println("\nHeart Rate : " +  heartRate);
                System.out.println("Heart Rate is normal");
                return true;
            }
            System.out.println("\nHeart Rate : " +  heartRate);
            System.out.println("Heart Rate is abnormal");
            return false;
        } else {
            if (heartRate >= 55 && heartRate <= 105) {
                System.out.println("\nHeart Rate : " +  heartRate);
                System.out.println("Heart Rate is normal");
                return true;
            }
            System.out.println("\nHeart Rate : " +  heartRate);
            System.out.println("Heart Rate is abnormal");
            return false;
        }
    }

    private boolean bloodPressureNorm() {
        int ageGroup = this.getAgeGroup();
        int sysBloodPressure = this.getSysBloodPressure();

        if (ageGroup == 0) {
            if (sysBloodPressure >= 50 && sysBloodPressure <= 70) {
                System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
                System.out.println("Systolic Blood Pressure is normal");
                return true;
            }
            System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
            System.out.println("Systolic Blood Pressure is abnormal");
            return false;
        } else if (ageGroup == 1) {
            if (sysBloodPressure >= 70 && sysBloodPressure <= 100) {
                System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
                System.out.println("Systolic Blood Pressure is normal");
                return true;
            }
            System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
            System.out.println("Systolic Blood Pressure is abnormal");
            return false;
        } else if (ageGroup > 1 && ageGroup <= 3) {
            if (sysBloodPressure >= 80 && sysBloodPressure <= 110) {
                System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
                System.out.println("Systolic Blood Pressure is normal");
                return true;
            }
            System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
            System.out.println("Systolic Blood Pressure is abnormal");
            return false;
        } else if (ageGroup > 3 && ageGroup <= 5) {
            if (sysBloodPressure >= 80 && sysBloodPressure <= 110) {
                System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
                System.out.println("Systolic Blood Pressure is normal");
                return true;
            }
            System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
            System.out.println("Systolic Blood Pressure is abnormal");
            return false;
        } else if (ageGroup >= 6 && ageGroup <= 12) {
            if (sysBloodPressure >= 80 && sysBloodPressure <= 120) {
                System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
                System.out.println("Systolic Blood Pressure is normal");
                return true;
            }
            System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
            System.out.println("Systolic Blood Pressure is abnormal");
            return false;
        } else {
            if (sysBloodPressure >= 110 && sysBloodPressure <= 120) {
                System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
                System.out.println("Systolic Blood Pressure is normal");
                return true;
            }
            System.out.println("\nSystolic Blood Pressure : " + sysBloodPressure);
            System.out.println("Systolic Blood Pressure is abnormal");
            return false;
        }
    }

    private boolean weightInKgsNorm() {
        int ageGroup = this.getAgeGroup();
        double weightInKgs = this.getWeightInKgs();

        if (ageGroup == 0) {
            if (weightInKgs >= 2 && weightInKgs <= 3) {
                System.out.println("\nWeight in Kg : " + weightInKgs);
                System.out.println("Weight in KGs is normal");
                return true;
            }
            System.out.println("\nWeight in Kg : " + weightInKgs);
            System.out.println("Weight in KGs is abnormal");
            return false;
        } else if (ageGroup == 1) {
            if (weightInKgs >= 4 && weightInKgs <= 10) {
                System.out.println("\nWeight in Kg : " + weightInKgs);
                System.out.println("Weight in KGs is normal");
                return true;
            }
            System.out.println("\nWeight in Kg : " + weightInKgs);
            System.out.println("Weight in KGs is abnormal");
            return false;
        } else if (ageGroup > 1 && ageGroup <= 3) {
            if (weightInKgs >= 10 && weightInKgs <= 14) {
                System.out.println("\nWeight in Kg : " + weightInKgs);
                System.out.println("Weight in KGs is normal");
                return true;
            }
            System.out.println("\nWeight in Kg : " + weightInKgs);
            System.out.println("Weight in KGs is abnormal");
            return false;
        } else if (ageGroup > 3 && ageGroup <= 5) {
            if (weightInKgs >= 14 && weightInKgs <= 18) {
                System.out.println("\nWeight in Kg : " + weightInKgs);
                System.out.println("Weight in KGs is normal");
                return true;
            }
            System.out.println("\nWeight in Kg : " + weightInKgs);
            System.out.println("Weight in KGs is abnormal");
            return false;
        } else if (ageGroup >= 6 && ageGroup <= 12) {
            if (weightInKgs >= 20 && weightInKgs <= 42) {
                System.out.println("\nWeight in Kg : " + weightInKgs);
                System.out.println("Weight in KGs is normal");
                return true;
            }
            System.out.println("\nWeight in Kg : " + weightInKgs);
            System.out.println("Weight in KGs is abnormal");
            return false;
        } else {
            if (weightInKgs >= 50 && weightInKgs <= 100) {
                System.out.println("\nWeight in Kg : " + weightInKgs);
                System.out.println("Weight in KGs is normal");
                return true;
            }
            System.out.println("\nWeight in Kg : " + weightInKgs);
            System.out.println("Weight in KGs is abnormal");
            return false;
        }
    }
    
}
