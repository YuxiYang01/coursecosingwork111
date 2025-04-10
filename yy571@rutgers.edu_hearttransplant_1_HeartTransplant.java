/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {

        // WRITE YOUR CODE HERE
        this.patients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        // WRITE YOUR CODE HERE
        return patients;
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        // WRITE YOUR CODE HERE
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        // WRITE YOUR CODE HERE
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.patients = new Patient[numberOfLines];
        int id, ethnicity, gender, age, cause, urgency, stateOfHealth;
        for(int i = 0; i < numberOfLines; i++){
            id = StdIn.readInt();
            ethnicity = StdIn.readInt();
            gender = StdIn.readInt();
            age = StdIn.readInt();
            cause = StdIn.readInt();
            urgency = StdIn.readInt();
            stateOfHealth = StdIn.readInt();
            this.patients[i] = new Patient(id, ethnicity, gender, age, cause, urgency, stateOfHealth);
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.survivabilityByAge = new SurvivabilityByAge();
        int age, yearsPostTransplant, rate;
        for(int i = 0; i < numberOfLines; i++){
            age = StdIn.readInt();
            yearsPostTransplant = StdIn.readInt();
            rate = StdIn.readDouble();

            this.survivabilityByAge.addData(age, yearsPostTransplant, rate);
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.survivabilityByCause = new SurvivabilityByCause();
        int cause, yearsPostTransplant, rate;
        for(int i = 0; i < numberOfLines; i++){
            cause = StdIn.readInt();
            yearsPostTransplant = StdIn.readInt();
            rate = StdIn.readDouble();

            this.survivabilityByCause.addData(cause, yearsPostTransplant, rate);
        }
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        // WRITE YOUR CODE HERE
        String indices = "";
        Patient[] return_patients = null;
        for(int i = 0; i < this.patients.length; i++){
            if(this.patients[i].getAge() > age){
                indices += i;
            }
        }

        if(indices.length()>0){
            return_patients = new Patient[indices.length()];
            for(int i = 0; i < indices.length(); i++){
                return_patients[i] = this.patients[Integer.parseInt(indices.charAt(i))];
            }
            return return_patients;
        }

        return null;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {
        // WRITE YOUR CODE HERE
        String indices = "";
        Patient[] return_patients = null;
        for(int i = 0; i < this.patients.length; i++){
            if(this.patients[i].getCause() > cause){
                indices += i;
            }
        }

        if(indices.length()>0){
            return_patients = new Patient[indices.length()];
            for(int i = 0; i < indices.length(); i++){
                return_patients[i] = this.patients[Integer.parseInt(indices.charAt(i))];
            }
            return return_patients;
        }

        return null;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {
        // WRITE YOUR CODE HERE
        String indices = "";
        Patient[] return_patients = null;
        for(int i = 0; i < this.patients.length; i++){
            if(this.patients[i].getUrgency() > urgency){
                indices += i;
            }
        }

        if(indices.length()>0){
            return_patients = new Patient[indices.length()];
            for(int i = 0; i < indices.length(); i++){
                return_patients[i] = this.patients[Integer.parseInt(indices.charAt(i))];
            }
            return return_patients;
        }

        return null;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {
    	// WRITE YOUR CODE HERE
        int cause, age, rate;
        int highest_cause_rate = 0;
        for(int i = 0; i < 5; i++){
            r1 = this.survivabilityByCause.getRate(i, 1);
            r3 = this.survivabilityByCause.getRate(i, 3);
            r5 = this.survivabilityByCause.getRate(i, 5);
            rate = (r1+r3+r5)/3;
            if(rate>highest_cause_rate){
                highest_cause_rate = rate;
                cause = i;
            }
        }

        Patient[] patients_cause = getPatientsByHeartConditionCause(cause);
        int oldest = 0;
        int index = 0;
        for(int i = 0; i < patients_cause.length; i++){
            if(patients_cause.getNeedHeart() == false){
                continue;
            }
            age = patients_cause.getAge();
            if(age>oldest){
                oldest = age;
                index = ""+i;
            }
        }

        patients_cause[index].setNeedHeart(false);

    	return patients_cause[index];
    }
}
